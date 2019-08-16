package io.wonko.xo.model;

public class Game {

    private final Player[] player;

    private final Field field;

    private final String name;

    public Game(final Player[] player, final Field field, final String name) {
        this.player = player;
        this.field = field;
        this.name = name;
    }

    public Player[] getPlayer() {
        return player;
    }

    public Field getField() {
        return field;
    }

    public String getName() {
        return name;
    }
}
