package pt.up.fe.lendea.model.layout.arena;

import pt.up.fe.lendea.model.layout.elements.*;
import pt.up.fe.lendea.model.layout.elements.monsters.Boss;

import java.util.ArrayList;
import java.util.List;

public abstract class ArenaBuilder {
    public Arena createArena() {
        Arena arena = new Arena(getWidth(), getHeight());

        arena.setExit(createExit());
        arena.setLendea(createLendea());
        arena.setMonsters(createMonsters());
        arena.setCoins(createCoins());
        arena.setWalls(createWalls());
        arena.setShots(createShots());
        arena.setBosses(createBosses());
        arena.setBossShots(createShots());
        arena.setTimer(createTimer());

        return arena;
    }

    protected abstract int getWidth();

    protected abstract int getHeight();

    protected abstract List<Wall> createWalls();

    protected abstract List<Monster> createMonsters();

    protected abstract ArrayList<Coin> createCoins();

    protected abstract ArrayList<Shot> createShots();

    protected abstract Lendea createLendea();

    protected abstract Exit createExit();

    protected abstract List<Boss> createBosses();

    protected abstract Timer createTimer();
}
