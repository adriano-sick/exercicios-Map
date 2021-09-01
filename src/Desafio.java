//Adriano Siqueira - 9/1/2021 - Desafio Dado - DIO Capgemini Fullstack Java and Angular Bootcamp

//Faça um programa que simule um lançamento de dados. (6 lados?)
//        Lance o dado 100 vezes e armazene.
//        Depois mostre quantas vezes cada valor foi inserido.

import java.util.*;

public class Desafio {
    public static void main(String[] args) {
        Random random = new Random();
        int playNumber = 100;

        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < playNumber; i++) {
            Integer dice = random.nextInt(6) + 1;
            values.add(dice);
        }

        Map<Integer, Integer> plays = new HashMap<>();
        for (Integer diceSide : values) {
            if (plays.containsKey(diceSide)) {
                plays.put(diceSide, plays.get(diceSide) + 1);
            } else {
                plays.put(diceSide, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : plays.entrySet()) {
            System.out.println("Dice Side: " +  entry.getKey() + " Times: " + entry.getValue());
        }
    }
}
