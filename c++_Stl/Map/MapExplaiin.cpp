#include<iostream>
#include<map>
using namespace std;

// Storing ----------> keys - Vlues
 // ------  Map stores unique keys in sortes order
void explainMap(){
 map<int, int>mp;
 map<int, pair<int,int>>mpp;

 map<pair<int, int>, int>mppp;

 mp[1] = 2;
 mp.insert({5, 4});  // third
 mp.insert({4,5});  // sotored at Second
mpp[2] = {2, 3};

mppp[{2,4}] = 3;
//  key.   value

cout<<"mp : \n";
for(auto it : mp){
    cout<<it.first<<" "<<it.second<<"\n";
}
// excesing by keys
cout<<mp[1];
cout<<"\n";

auto it = mp.find(5);
cout<<(*it).second;


// Lower bound and upper bound

auto itt = mp.lower_bound(5);
auto ittt = mp.upper_bound(3);

cout<<(*itt).first; // 5 first key >= 5
cout<<(*itt).second;// 4




}

int main(){
    cout<<"Explain map : \n";
    explainMap();
    return 0;
}