package bmi;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BMI {
    
    public static double calculate(int váha, double výška) {  
        výška = výška * výška;
        return váha / výška;
    }
    
    public static String message(double bmi) {
        if(bmi < 18) {
            return "Podvaha";
        }
        else if(bmi > 25) {
            return "Silna obezita";
        }
        else if(bmi > 30) {
            return "Obezita";
        }
        else if(bmi > 40) {
            return "ťažká obezita";
        }
        else {
            return "Normálna bmi";
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vaša výška?");
        double výška = scanner.nextDouble();
        System.out.println("Vaša váha?");
        int váha = scanner.nextInt();
        double bmi = calculate(váha, výška);
        String output = bmi + " " + message(bmi);
        System.out.println(output);
    }
}
