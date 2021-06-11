/**
 * 2D Array
 * a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
 * standard input and printing them out to standard output.
 * b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
 * c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
 * d. O/P -> Print function to print 2 Dimensional Array.
 *
 *
 * @author Krunal Lad
 * @version 1.0
 * @Since 11-06-2021
 */

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows and columns");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int [] [] arr = new int[rows][columns];

        System.out.println("Enter the  values to insert in the 2D array: ");

        for(int i = 0 ;i < rows;i++){

            for (int j = 0 ; j < columns ;j++){

                arr [i][j] = sc.nextInt();

            }

        }

        for(int i = 0 ;i < rows;i++){

            for (int j = 0 ; j < columns ;j++){

                System.out.println(arr[i][j]+" ");

            }

            System.out.println(" ");

        }

    }
}
