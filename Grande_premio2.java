package grande_premio;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Grande_premio {

    public static void var() {
        Scanner in = new Scanner(System.in);

    }

    public static void main(String[] args) {
        String x= "";
        x= JOptionPane.showInputDialog("\nO Grande Pr�mio Rodinhas\nMenu\n1-Ler ficheiro inscri��o\n2-Ver todos os participantes\n3-Alterar inscri��es");
        do {
            switch (x) {

                case "1":

                    break;
                case "2":

            }

        } while (!x.equals("0"));

    }

}
