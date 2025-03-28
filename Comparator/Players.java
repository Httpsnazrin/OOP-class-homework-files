package Comparator;

import java.util.Comparator;

public final class Players{
    public final String name;
    public final int score;

    public Players(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }



}