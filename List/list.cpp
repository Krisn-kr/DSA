#include<iostream>
#include<string>
#include<list>
using namespace std;

void explain_list(){
    list<int> ls;

    ls.push_back(2);     // {2}
    ls.emplace_back(4);  // {2,4}
    ls.push_front(5);    // {5,2,4}
    ls.emplace_front(2);   //{2,5,2,4}

    for(auto it : ls){
        cout<<it<<" ";
    }


}

int main(){
    cout<<" list \n";
    explain_list();
    return 0;
}
