import java.util.Scanner;

public class bettersolution {
    public static void main(String[] arg){

        // Matrix formation : 
        int [][]matrix = new int[100][100];
        int r, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row : ");
        r = sc.nextInt();
        System.out.print("Enter the row : ");
        c = sc.nextInt();

        // input
         for(int i =0; i<r ;i++){
            for(int j = 0; j< c; j++ ){
                System.out.print("Enyter the "+ i +" x " + j +" element  : ");
                matrix[i][j] = sc.nextInt();

            }
         }

        //  origin matrix
        System.out.println("\nOrigin matrix \n=================\n");
        for(int i =0 ; i<r; i++){
            for (int j =0 ; j<c; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println("\n");

        }
        





        // Solution ==================================================

        int row[] = new int[r];
        int col[] = new int[c];
        //  Mark rows and columns
        for(int i =0; i< r; i++){
            for(int j =0 ; j< c; j++){
                if(matrix[i][j] == 0){
                row[i] = 1;
                col[j] = 1;

                }
                
            }
        }

            // Set zeros

            for(int i =0 ; i<r; i++){
                for(int j =0 ; j<c ; j++){ 
                    if(row[i] == 1 ||  col[j] == 1){
                        matrix[i][j] = 0;

                    }
                    
                }
            }

            // output
            for(int i =0 ; i<r; i++){
                for(int j =0 ; j<c ; j++){ 
                    
                System.out.print( matrix[i][j]+" ");  
                }

                System.out.print("\n");
            }

        




    }
}
