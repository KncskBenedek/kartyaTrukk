package main;

import java.util.Scanner;

public class PakliProgram {

    public static void main(String[] args) {
        String[] pakli = new String[21];
        String[] szinek = new String[]{"P", "T", "Z", "M"};
        String[] ertek = new String[]{"Ász", "Kir", "Fel", "X", "IX", "VIII"};

        feltolt(pakli, szinek, ertek);

        
        System.out.println(" ");
        int valtozo = 0;
        while (valtozo < 3) {
            
            kiiratas(pakli);
            int beOszlopSzam = beker();
            pakli = keveres(pakli, beOszlopSzam-1).clone();
            valtozo++;
        }
        
        kiiratas(pakli);
        
        System.out.println(" ");

        

    }

    public static void feltolt(String[] pakli, String[] szinek, String[] ertek) {
        int index = 0;

        for (int i = 0; i < 7; i++) {
            if (i % 2 == 0) {
                index = 0;
            }
            int szin = i / 2;
            for (int j = i; j <= i + 2 * 7; j = j + 7) {
                pakli[j] = szinek[szin] + ertek[index];
                index++;
            }

        }
    }

    public static String[] keveres(String[] pakli, int n) {
        String[] pakli2 = new String[21];
        int[] tomb = new int[]{0, 1, 2};
        
        int y = 0;
        while (tomb[y] != n) {
            y++;
        }
        if (y != 1) {
            int tempElem = tomb[1];
            tomb[1] = n;
            tomb[y] = tempElem;

        }
        int z = 0;
        int szamlalo = 0;
        int temp = z;
        for (int i = 0; i < 3; i++) {

            for (int j = tomb[i] * 7; j < tomb[i] * 7 + 7; j++) {
//                System.out.println("z = " + z);
//                System.out.println("j = " + j);
                pakli2[z] = pakli[j];
                szamlalo++;
                z = z + 7;
                if (szamlalo % 3 == 0) {
                    z = temp + 1;
                    temp = z;
                }

            }

        }
        return pakli2;
    }

    public static void kiiratas(String[] pakli) {
        for (int i = 0; i < 7; i++) {
            for (int j = i; j <= i + 2 * 7; j = j + 7) {
                System.out.printf("|%5s|", pakli[j]);
            }
            System.out.println("");
        }
    }

    private static int beker() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Melyik Oszlopban van a gondolt káryája? 1:2:3");
        int szam = scan.nextInt();
        return szam;
    }

}
