import classes.DiagnostiqueDialog;
import classes.HeadDialog;
import classes.LadderOfHurt;

import java.io.IOException;
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

    private static HeadDialog headDialog;
    private static DiagnostiqueDialog diagnostiqueDialog;

    public static void main(String[] args) throws IOException {
        headDialog = new HeadDialog() {
            @Override
            public void diagnostiqueHead(String locationHurtForHead, Integer level) {
                HeadDialog.super.diagnostiqueHead(locationHurtForHead, level);
            }
        };

        diagnostiqueDialog = new DiagnostiqueDialog() {
            @Override
            public void diagnostique(String locationHurt, HeadDialog headDialog) {
                DiagnostiqueDialog.super.diagnostique(locationHurt, headDialog);
            }
        };

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
                diagnostiqueDialog.diagnostique(responseLocationHurt, headDialog);
                break;
            case "annuler":
                System.out.println("Daccord j'annule votre demande");
                break;
        }
    }
}