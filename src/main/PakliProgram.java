
package main;

import java.util.Scanner;


public class PakliProgram {

  
    public static void main(String[] args) {
        String[] pakli = new String[21];
        String[] szinek = new String[] {"P", "T", "Z", "M"};
        String[] ertek = new String[] {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int index = 0;
        for (int i = 0; i < szinek.length; i++) {
            int j = 0;
            while (j < ertek.length && index < pakli.length) {
                pakli[index] = szinek[i]+ertek[j];
                j++;
                index++;
            }
        }
        System.out.printf("|%5s|",pakli[0] );
        for (int i = 1; i < pakli.length; i++) {
            if(i % 3 == 0){
                System.out.println("");
                System.out.print("|");
            }
            System.out.printf("%5s|",pakli[i]);
            

        }
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        System.out.println("Melyik Oszlopban van a gondolt kártyád? 1:2:3");
        int oszlop = scan.nextInt();
        System.out.println("");
        
    }
    
}
