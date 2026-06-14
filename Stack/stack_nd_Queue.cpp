#include<iostream>
using namespace std;

void explainStack(){

    // LIFO

    //  ====================================
    //        Time-Complexity = O(1)
    // ======================================


    stack<int> st;
    st.emplace(1); //{1}
    st.push(2); // {2, 1}
    st.push(3); //{3, 2 ,1 }

    st.push(3); // {3, 3, 2, 1}
    st.push(5); // { 5, 3, 3, 2, 1}

    cout<<st.top()<<"\n"; // prints 5   "** st[2] is invalid ** "

    st.pop(); // st looks like {3, 3, 2, 1}

    cout<<st.top()<<"\n"; // 3
    
    cout<< st.size()<<"\n"; // 4

    cout<< st.empty()<<"\n"; // 0 ( False)

    stack<int>st1, st2;
    st1.swap(st2);
}


// Queue

void explainQueue(){

    //  FIFO

    //  TimeComplexity = O(1)


    queue<int> q;
    q.push(1); //{1}
    q.push(2); //{ 1, 2}
    q.emplace(4); //{1, 2, 4}


    q.back() += 5;   // last element + 4
    //    { 1, 2, 9}
    cout<< q.front() <<"\n"; //1
    cout<<q.back()<<"\n"; // 9

    q.pop(); // { 2, 9}

    cout<<q.front() <<"\n";  // prints = 2

    //  size, swap and empty same as stack
    
}
int main(){
    explainStack();
    cout<<"\nQueue\n";
    explainQueue();
    return 0;
}