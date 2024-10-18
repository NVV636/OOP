/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task1.pkg1;

/**
 *
 * @author nazar
 */
import java.util.Scanner;
import java.util.Random;
public class Task11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int n = sc.nextInt();
        
        double[][] matrix = new double[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = random.nextDouble() * (2 * n) - n;
            }
        }
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                System.out.printf("%6.2f", matrix[i][j]);
            }
            System.out.println();
        }
    }
    
}
