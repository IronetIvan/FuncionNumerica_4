/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionnumerica_4;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class FuncionNumerica_4 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero ");
        double A = sc.nextDouble();
        System.out.println("Ingresa otro numero ");
        double B = sc.nextDouble();
        System.out.println("Ingresa un numero ");
        double C = sc.nextDouble();
        if (A > B && A > C) {
            System.out.println("El numero mayor es " + A);
        } else {
            if (B > A && B > C) {
                System.out.println("El numero mayor es " + B);
            } else {
                System.out.println("El numero mayor es " + C);
            }
        }
    }
}
