package View;

import Controller.DistroController;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        DistroController DC = new DistroController();

        Scanner scan = new Scanner(System.in);
        String opc;

        do {
            System.out.print("MENU \n 1) Ver distribuição \n 9) Encerrar \n Escolha uma opção:");
            opc = scan.next();

            switch (opc) {
                case "1": DC.exibeDistro();
                    break;
                case "9":System.out.println("Aplicação Encerrada");
                    break;
                default:System.out.println("Opção inválida");

                    break;
            }
        } while(!(opc.contains("9")));




    }
}
