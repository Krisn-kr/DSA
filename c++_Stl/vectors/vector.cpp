#include<iostream>
using namespace std;
#include <vector>

void vect(){
    vector<int> v;
    v.push_back(1);
    v.emplace_back(2);

    cout<<v[0]<<"\n";

    //  pair
    vector<pair<int , int>> vec;
    vec.push_back({1,2});  // curly braces are required
    vec.emplace_back(3,4);
    cout<<vec[0].first<<" "<<vec[1].second<<"\n";

    vector<int> v1(5,100); // 5 elements with value 100
    cout<<v1[0]<<"\n";

    vector<int> v2(5);
    cout<<v2[0]<<"\n"; // 5 elements with value 0

    //  vector of vectors
    vector<int>v3(v1); // copy constructor
    cout<<v3[0]<<"\n";

    cout<<v.size()<<"\n"; // size of vector
    cout<<v1.size()<<"\n";
    cout<<v2.size()<<"\n";
    cout<<v3.size()<<"\n"; 



}

int main(){
    vect();

    return 0;
}