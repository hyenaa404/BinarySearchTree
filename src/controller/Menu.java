/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import util.InputUtils;

/**
 *
 * @author nhs
 */
public class Menu {
    public static int chooseInputOption(){
            System.out.println("-----------------------------------------------------------------");
            System.out.println("1. Add book.");
            System.out.println("2. Search book.");
            System.out.println("3. Delete book.");
            System.out.println("4. View all book.");
            System.out.println("5. Exit");
            System.out.println("-----------------------------------------------------------------");
        int option = InputUtils.inputOption(1, 5);
        return option;
    }
}
