#include<iostream>
using namespace std;

void markRow(int r, int matrix[][100], int c){
    for(int j = 0; j< c; j++){
        if(matrix[r][j] != 0){
            matrix[r][j] = -1;
        }
    }
}

void markCol(int c, int matrix[][100], int r){
    for(int i = 0; i< r; i++){
        if(matrix[i][c] != 0){
            matrix[i][c] = -1;
        }
    }
}


int main(){
int r,c,n;
    cout<<"enter rows and column : \n";
    cout<<"Rows :  ";
    cin>>r;

    cout<<"Column : ";
    cin>>c;

    int matrix[100][100];

    for(int i =0 ; i<r; i++){
        for(int j = 0 ; j< c ; j++){
            cout<<i<<" * "<<j<<" : ";
            cin>>matrix[i][j];

        }
    }

    cout<<"Matrix : \n";
    for(int i =0 ; i<r; i++){
        for(int j = 0 ; j< c ; j++){
            cout<<matrix[i][j]<<" ";
        }
        cout<<"\n";
    }

    // solution


    // Traverse the matrix
    // Whenever a 0 is found,
    // mark its entire row and column as -1

    for(int i =0; i<r; i++){
        for(int j =0; j<c; j++ ){
            if(matrix[i][j] == 0){
                
                markRow(i, matrix, c);
                markCol(j, matrix, r);

            }
        }
    }

    // Convert every -1 into 0
    // because -1 was only a temporary marker

    for(int i = 0; i<r ; i++){
        for(int j =0; j<c ; j++){
            if(matrix[i][j]== -1){
                matrix[i][j] = 0;

            }
        }
    }

    // Print the final matrix
    cout << "\nFinal Matrix:\n";

    for(int i = 0; i < r; i++)
    {
        for(int j = 0; j < c; j++)
        {
            cout << matrix[i][j] << " ";
        }

        cout << endl;
    }

    return 0;
}