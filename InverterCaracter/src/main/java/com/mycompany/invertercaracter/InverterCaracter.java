/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.invertercaracter;
import javax.swing.JOptionPane;
import java.util.Stack;

/**
 *
 * @author Pc-lab
 */
public class InverterCaracter {

    public static void main(String[] args) {
        String s;
        s = JOptionPane.showInputDialog("Digite a frase");
        System.out.println("A frase digitada foi: " + s);
        System.out.println("A frase invertida é: " + inverterCaracteres(s));
    }

    public static String inverterCaracteres(String s) {
        int n = s.length();
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < n; i++) {
            pilha.push(s.charAt(i));
        }

        StringBuilder sInvertida = new StringBuilder();
        while (!pilha.isEmpty()) {
            sInvertida.append(pilha.pop());
        }

        return sInvertida.toString();
    }
}
