public class patterns {
    public static void main(String[] args) {
        
        // rectanglepattern

        /*

         * * * * *
         * * * * *
         * * * * *
         * * * * *
         
         
         */

        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=5; j++){
                System.out.print("* ");

            }
            System.out.println();
        }
        

        // Hollow rectangle pattern

        /*
        
        * * * * *
        *       *
        *       *
        * * * * * 
        
        
        */

        for(int i =1; i<=4; i++){
            for(int j = 1; j<=5; j++){
                if(i == 1 || i == 4 || j ==1 || j== 5){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
            


        // pattern 
        /*
        
        *
        * *
        * * *
        * * * *
        
    */


        for (int i =1; i<=4; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        


        // pattern

        /*
        
        * * * *
        * * *
        * *
        * 
        
        */

        for(int i = 4; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        


        // Pattern 
        /*
        
               *
             * *
           * * * 
         * * * * 
        
            */

        for(int i = 1; i<=4; i++){
            //inner loop for spaces
            for(int j = 1; j<=4-i; j++){
                System.out.print("  ");
            }
            //inner loop for stars
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
            

        // Pattern 
        /*1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

        */
        

        for(int i = 1; i<=5; i++){
            for(int j =1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
            

        // pattern
        /*
        1 2 3 4 5
        1 2 3 4
        1 2 3       
        1 2
        1

        */
        

        for(int i = 5; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
            


        // Pattern 
        /*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        
    */

        int count = 1;
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

        

        // 0-1 triangle pattern
        /*
        
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1

        
        */

        for(int i =1; i<=5; i++){
            for(int j =1; j<= i; j++){
                if((i+j) %2 == 0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
            


        // Butterfly pattern
        /*
        
        *             *
        * *         * *
        * * *     * * *
        * * * * * * * *
        * * * * * * * *
        * * *     * * *
        * *         * *
        *             *
        
        
        */

        for(int i = 1; i<=4; i++){
            // 1st part stars
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            // spaces
            for(int j = 1; j<=2*(4-i); j++){
                System.out.print("  ");
            }
            // 2nd part stars
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 4; i>=1; i--){
            // 1st part stars
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            // spaces
            for(int j = 1; j<=2*(4-i); j++){
                System.out.print("  ");
            }
            // 2nd part stars
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        


        // Solid Rhombus pattern
        /*
        
            * * * * *
           * * * * *
          * * * * *
         * * * * *
        * * * * *
        
    
    */

        for(int i = 1; i<=5; i++){
            // spaces
            for(int j =1; j<=5-i; j++){
                System.out.print("  ");
            }

            // stars
            for(int j = 1; j<=5; j++){
                System.out.print("* ");
            }
            System.out.println();
                   
        }

        


        // Number Pyramid pattern

        /*
             1 
           2  2
          3  3  3
        4  4  4  4
      5  5  5  5  5

      */
        

        for(int i =1; i<=5; i++){
            //spaces
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            // numbers
            for(int j=1; j<=i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();


        }


        // Palindrome pattern

        /*
                1
              2 1 2
            3 2 1 2 3
          4 3 2 1 2 3 4
        5 4 3 2 1 2 3 4 5

        
        */



        for(int i = 1; i<= 5; i++){
            
            //spaces

            for(int j =1; j<= 5-i; j++){
                System.out.print(" "); 
            }

            // First half numbers

            for(int j = i; j>=1; j--){
                System.out.print(i);
            }

            for(int j = 2; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
            


        // Diamond Pattern

        /*
                   *
                 * * *
               * * * * *
             * * * * * * *
             * * * * * * *
               * * * * *
                 * * *
                   * 
        
        */


        for(int i = 1; i<=4; i++){

            // spaces

            for(int j=1; j<= 4-i; j++){
                System.out.print(" ");
            }



            //upper half

            for(int j = 1; j<=2*i - 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        
        }
        
        for(int i = 4; i>=1; i--){

            // spaces

            for(int j=1; j<= 4-i; j++){
                System.out.print(" ");
            }
            // lower half


            for(int j = 1; j<=2*i - 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
