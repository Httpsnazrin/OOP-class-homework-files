package Comparator;

import java.util.Arrays;
public class PlayerApp {
    public static void main(String[] args) {
        Players[] players = new Players[4];
        players[0]= new Players("Nazrin", 99);
        players[1] = new Players("Kanan", 100);
        players[2]= new Players("Arif", 99);
        players[3] = new Players("Ravan", 100);
        Arrays.sort(players, new Checker());
        for(Players player : players){
            System.out.println(player.name+" "+player.score);
        }

    }

}







