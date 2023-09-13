/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;

/**
 *
 * @author Bravo
 */
public class Library {
    private Scanner scanner;

    public Library() {
        scanner = new Scanner(System.in);
    }

    public int getInt(String message, int min, int max) {
        int input;
        while (true) {
            try {
                System.out.print(message + " (" + min + " - " + max + "): ");
                input = Integer.parseInt(scanner.nextLine());
                if (input >= min && input <= max) {
                    return input;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    public void close() {
        scanner.close();
    }
}