#include<iostream>
using namespace std;

void explainPairs() {
    pair<int,int>p={1,2};
    
    cout<<p.first<<" "<<p.second<<"\n";

    pair<int, pair<int , int>>p2 = {1,{2,3}};
    cout<<p2.first<<" "<<p2.second.first<<" "<<p2.second.second<<"\n";

    cout<<"\narray : ";

    pair<int, int> arr[] = { {1,2}, {23,34}, {23,54} };

    cout<<arr[1].first<<" \n"<<arr[2].second<<"\n";
}

int main(){

    explainPairs();

    return 0;
}


