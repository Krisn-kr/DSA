#include<iostream>
#include <queue>

using namespace std;

void explainPQ(){

    // ================= TIme complexity ================
    //         push ---------> lon(n)
    //         top -----------> O(1)
    //         pop  -----------> lon(n)
    // ================================================

    priority_queue<int>pq;

    //  Largest value will be at the top

    pq.push (5) ; // {5}
    pq.push(2) ; // {5, 2}
    pq.push(8) ; // {8, 5, 2}
    pq.push(10) ; // {10, 8, 5, 2}

    pq.pop(); //{8, 5, 2}


    cout<< pq.top() <<"\n"; // prints 8

    //  size, swap, empty functions same as others

    // Minimum  heap  == [ Minmum value  = Top ]
    priority_queue<int, vector<int>, greater<int>> pq1;
    pq1.push (5) ; // {5}
    pq1.push(2) ; // {5, 2}
    pq1.push(8) ; // {8, 5, 2}
    pq1.push(10) ; // {10, 8, 5, 2}

    cout<<"Minimum heap : \n"<<pq1.top()<<"\n";

    

}

int main(){

    explainPQ();
    return 0;
}