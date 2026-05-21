import java.util.*;

public class array {
    public static void main(String[] args) {

        // take an array as input from the user. Search for a given number x and print the index at which it occurs.


        Scanner sc = new Scanner(System.in);

        // Size input
        System.out.print("enter the size - ");
        int size = sc.nextInt();
        
        //array declaration

        int[] arr = new int[size];

        // array input


        System.out.print("Enter the array values - ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        // array output

        System.out.println("the array is - ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // searching

        System.out.print("enter the value to search : ");
        int x = sc.nextInt();

        for(int i = 0; i<size; i++){
            if(arr[i] == x){
                System.out.println("the value is found at index - " + i);
            }
         }
         System.out.println("Value not found");



        // 2D array

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns - ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];


        //Input

        System.out.println("Enter the array values - ");
        //rows
        for(int i = 0; i<rows; i++){

            //columns
            for(int j = 0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //Output

        System.out.println("the array is - ");

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



    // Take a user input matrix, Search for a given number x and print the indices at which it occurs.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and colums - ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter the array");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // searching

        System.out.print("Enter the number: ");
        int x = sc.nextInt();

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(arr[i][j] == x){
                    System.out.print(i + "," + j);
                }
                
            }
        }
        


    // Print the spiral order matrix as output for a given matrix of numbers.


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows and columns of the matrix - ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println("The matrix - ");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int rowStart = 0;
        int colStart = 0;
        int rowEnd = n-1;
        int colEnd = m-1;

        System.out.println("The spiral matrix - ");

        while(rowStart<=rowEnd && colStart<=colEnd){
            //1st loop
            for(int col = colStart; col<=colEnd; col++ ){
                System.out.print(matrix[rowStart][col]  + " ");
            }
            rowStart++;
            //2nd loop
            for(int row = rowStart; row<=rowEnd; row++){
                System.out.print(matrix[row][colEnd] + " ");
            }
            colEnd--;

            //3rd loop

            for(int col = colEnd; col>=colStart; col-- ){
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;

            //4th loop

            for(int row = rowEnd; row>=rowStart; row-- ){
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;



        }



    // Print transpose of a matrix

        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the row and columns - ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Enter the matrix - ");
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // System.out.println("Transpose matrix -");
        // for(int j = 0; j<col ; j++){
        //     for(int i = 0; i<row; i++){
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // can also be done like this

        System.out.println("Transpose matrix -");
        for(int i = 0; i<col ; i++){
            for(int j = 0; j<row; j++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }


        
        
        
    }
}