#include <iostream>
using namespace std;

int main()
{
    int matrix[100][100];
    int r, c;

    cout << "Enter the number of rows: ";
    cin >> r;

    cout << "Enter the number of columns: ";
    cin >> c;

    // Input Matrix
    for(int i = 0; i < r; i++)
    {
        for(int j = 0; j < c; j++)
        {
            cout << "Enter element at (" << i << "," << j << "): ";
            cin >> matrix[i][j];
        }
    }

    // Print Original Matrix
    cout << "\nOriginal Matrix:\n";

    for(int i = 0; i < r; i++)
    {
        for(int j = 0; j < c; j++)
        {
            cout << matrix[i][j] << " ";
        }
        cout << "\n";
    }

    // ==========================================
    // Better Solution
    // ==========================================

    int row[100] = {0};
    int col[100] = {0};

    // Step 1:
    // Mark rows and columns that contain a zero

    for(int i = 0; i < r; i++)
    {
        for(int j = 0; j < c; j++)
        {
            if(matrix[i][j] == 0)
            {
                row[i] = 1;
                col[j] = 1;
            }
        }
    }

    // Step 2:
    // If row or column is marked,
    // make that element zero

    for(int i = 0; i < r; i++)
    {
        for(int j = 0; j < c; j++)
        {
            if(row[i] == 1 || col[j] == 1)
            {
                matrix[i][j] = 0;
            }
        }
    }

    // Print Final Matrix

    cout << "\nFinal Matrix:\n";

    for(int i = 0; i < r; i++)
    {
        for(int j = 0; j < c; j++)
        {
            cout << matrix[i][j] << " ";
        }
        cout << "\n";
    }

    return 0;
}