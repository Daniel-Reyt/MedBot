package Methods;

import Classes.LadderOfHurt;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MedBot {
    static java.util.Scanner input = new Scanner( System.in);

    private List<LadderOfHurt> listOfLadderOfHurt = new ArrayList<>();

    private LadderOfHurt ladderOfHurt1 = new LadderOfHurt(new ArrayList<Integer>(Arrays.asList(1, 2, 3)), 0);

    private LadderOfHurt ladderOfHurt2 = new LadderOfHurt(new ArrayList<Integer>(Arrays.asList(4, 5, 6)), 1);

    private LadderOfHurt ladderOfHurt3 = new LadderOfHurt(new ArrayList<Integer>(Arrays.asList(7, 8, 9)), 2);

    public static void main(String[] args) throws IOException {
        String responseMainQuestion = "";
        String callBot = input.nextLine();
        switch (callBot) {
            case "Ok MedBot !":
                System.out.println("Bienvenue sur MedBot, que puis je faire pour vous");
                responseMainQuestion = input.nextLine();
                break;
            case "annuler":
                break;
        }

        switch (responseMainQuestion) {
            case "diagnostique":
                System.out.println("ou avez vous mal ?");
                String responseLocationHurt = input.nextLine();
                diagnostique(responseLocationHurt);
                break;
            case "annuler":
                System.out.println("Daccord j'annule votre demande");
                break;
        }
    }

    public static void diagnostique(String locationHurt) {
        String responseLocationHurtForHead = "";
        switch (locationHurt) {
            case "tete":
            case "tête":
                System.out.println("ou avez vous mal : (avant, arriere, autre ?)");
                responseLocationHurtForHead = input.nextLine();
                diagnostiqueHead(responseLocationHurtForHead, null);
                break;
            case "ventre":
                System.out.println("ou avez vous mal : (estomac, vessie, autre ?)");
                String responseLocationHurtForStomach = input.nextLine();
                diagnostiqueStomach(responseLocationHurtForStomach, null);
                break;
        }
    }

    private static void diagnostiqueStomach(String locationHurtForStomach, Integer level) {
        if (level != null) {
            System.out.println("ok je vérifie les données sur cette douleur : " + locationHurtForStomach + " douleur de niveau : " + level);
        } else {
            System.out.println("ok je vérifie les données sur cette douleur : " + locationHurtForStomach);
            String ladderOfHurt = input.nextLine();
            System.out.println("vous avez mal au niveau : " + ladderOfHurt);
        }
    }

    private static void diagnostiqueHead(String locationHurtForHead, Integer level) {
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
