package classes;

import java.util.Scanner;

public interface DiagnostiqueDialog {
    static java.util.Scanner input = new Scanner( System.in);

    public default void diagnostique(String locationHurt, HeadDialog headDialog) {
        String responseLocationHurtForHead = "";
        switch (locationHurt) {
            case "tete":
            case "tête":
                System.out.println("ou avez vous mal : (avant, arriere, autre ?)");
                responseLocationHurtForHead = input.nextLine();
                headDialog.diagnostiqueHead(responseLocationHurtForHead, null);
                break;
        }
    }
}
