#include<iostream>
#include<string>
#include<list>
using namespace std;
// ================================

void explain_list(){
    list<int> ls;

    ls.push_back(2);     // {2}
    ls.emplace_back(4);  // {2,4}
    ls.push_front(5);    // {5,2,4}
    ls.emplace_front(2);   //{2,5,2,4}

    for(auto it : ls){
        cout<<it<<" ";
    }
    cout<<"\n";


} 

// ======================
void explainDeque(){
    deque<int> dq;
    dq.push_back(1); // {1}
    dq.emplace_back(2);  // {1, 2}

    dq.push_front(3); //{3, 1, 2}
    dq.emplace_front(4); //{4, 3, 1, 2}


    for(auto it : dq){
        cout<<it<<", ";

    
 
    }cout<<"\n";


    dq.back();
    dq.front();

    //  rest functions same as vector
    // begin, end, rbegin, rend, clear, insert, size, swap
}

int main(){
    cout<<" list \n";
    explain_list();

    cout<<"Deque ========\n";
    explainDeque();
    return 0;
}
