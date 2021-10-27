package classes;

import java.util.Scanner;

public interface HeadDialog {
    static java.util.Scanner input = new Scanner( System.in);

    public default void diagnostiqueHead(String locationHurtForHead, Integer level) {
        if (level != null) {
            System.out.println("ok je vérifie les données sur cette douleur : " + locationHurtForHead + " douleur de niveau : " + level);
        } else {
            System.out.println("ok je vérifie les données sur cette douleur : " + locationHurtForHead);
            System.out.println("Sur 9 a combien estimez-vous votre douleur ?");
            String ladderOfHurt = input.nextLine();
            switch (ladderOfHurt) {
                case "9":
                    printDouleur(9);
                    break;
                case "8":
                    printDouleur(8);
                    break;
                case "7":
                    printDouleur(7);
                    break;
                case "6":
                    printDouleur(6);
                    break;
                case "5":
                    printDouleur(5);
                    break;
                case "4":
                    printDouleur(4);
                    break;
                case "3":
                    printDouleur(3);
                    break;
                case "2":
                    printDouleur(2);
                    break;
                case "1":
                    printDouleur(1);
                    break;
            }
        }
    }

    private static void printDouleur(int douleur) {
        System.out.println("votre douleur est de niveau " + douleur);
    }
}
