package pt.up.fe.lendea.model.layout.arena;

import pt.up.fe.lendea.model.layout.elements.*;
import pt.up.fe.lendea.model.layout.elements.monsters.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class LoaderArenaBuilder extends ArenaBuilder {
    private final int level;
    private final List<String> lines;

    public LoaderArenaBuilder(int level) throws IOException {
        this.level = level;

        URL resource = LoaderArenaBuilder.class.getResource("/levels/level" + level + ".lvl");
        BufferedReader br = new BufferedReader(new FileReader(resource.getFile()));

        lines = readLines(br);
    }

    private List<String> readLines(BufferedReader br) throws IOException {
        List<String> lines = new ArrayList<>();
        for (String line; (line = br.readLine()) != null; )
            lines.add(line);
        return lines;
    }

    @Override
    protected int getWidth() {
        int width = 0;
        for (String line : lines)
            width = Math.max(width, line.length());
        return width;
    }

    @Override
    protected int getHeight() {
        return lines.size();
    }

    @Override
    protected List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();

        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == '#') walls.add(new Wall(x, y));
        }

        return walls;
    }

    @Override
    protected List<Monster> createMonsters() {
        List<Monster> monsters = new ArrayList<>();

        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == '@') monsters.add(new Monster1(x, y));
        }

        return monsters;
    }

    @Override
    protected List<Boss> createBosses() {
        List<Boss> bosses = new ArrayList<>();

        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == '[') bosses.add(new Boss(x, y));
        }

        return bosses;
    }

    @Override
    protected Timer createTimer() {
        for (String line : lines) {
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == '*') return new Timer();
        }
        return null;
    }

    @Override
    protected ArrayList<Coin> createCoins() {
        ArrayList<Coin> coins = new ArrayList<>();

        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == '$') coins.add(new Coin(x, y));
        }

        return coins;
    }

    @Override
    protected ArrayList<Shot> createShots() {
        ArrayList<Shot> shots = new ArrayList<>();

        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == '{') shots.add(new LendeaShot(x, y, true, false, false, false));
        }

        return shots;
    }

    @Override
    protected Lendea createLendea() {
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == '*') return new Lendea(x, y);
        }
        return null;
    }

    @Override
    protected Exit createExit() {
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == 'E') return new Exit(x, y);
        }
        return null;
    }
}