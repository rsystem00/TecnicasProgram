/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author Robert
 */
public class NewClass1 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el límite de la secuencia: ");
        int limite = scanner.nextInt();
        
        int a = 0, b = 1;
        System.out.println("Secuencia Fibonacci:");
        for (int i = 0; i < limite; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        scanner.close();
    }
}
