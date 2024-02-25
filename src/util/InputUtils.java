
package util;

import java.util.Scanner;

/**
 *
 * @author nhs
 */
public class InputUtils {
    public static Scanner sc = new Scanner(System.in);
    
    public static int inputOption(int min, int max) {
        int rs;
        while (true) {
            try {
                rs = Integer.parseInt(sc.nextLine());
                if (rs < min || rs > max) {
                    throw new ArithmeticException("Not valid. Enter a valid number from " + min + " to " + max + ".");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Pls input a valid integer number.");
            } catch (ArithmeticException ex) {
                System.err.println(ex.getMessage());
            }
        }

        return rs;
    }
    
    public static int inputInt() {
        int rs;
        while (true) {
            try {
                rs = Integer.parseInt(sc.nextLine());
                if (rs <= 0) {
                    throw new ArithmeticException("Not valid. Enter a positive number.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Pls input a valid integer number.");
            } catch (ArithmeticException ex) {
                System.err.println(ex.getMessage());
            }
        }

        return rs;
    }
    
     public static String inputName() {
        String name;
        while (true) {
            try {
                name = sc.nextLine();

                if (!name.matches("[a-zA-Z .]+")) {
                    throw new IllegalArgumentException("Invalid name. Please enter a valid name.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.err.print(e.getMessage());
            }
        }
        return name;
    }

}
