#include<iostream>
using namespace std;
#include <vector>

void vect(){
    vector<int> v;
    v.push_back(1);
    v.emplace_back(2);

    cout<<v[0]<<"\n";
}

int main(){
    vect();

    return 0;
}