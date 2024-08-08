package view;

import controller.Exercicio2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Digite uma frase: ");
        Exercicio2 m = new Exercicio2();
        m.exDois(frase);
    }
}