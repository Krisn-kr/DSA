#include<iostream>
#include<vector>
using namespace std;

void iterators() {
    vector<int> v = {1,2,3,4,5,6};

    vector<int>::iterator it = v.begin();

    cout << *it << "\n";

    it++;
    cout << *it << "\n";

    it = it + 2;
    cout << *it << "\n";



//======================================================

    vector<int>::iterator it1 = v.end(); // location after lasgt element

    vector<int>::reverse_iterator it2 = v.rbegin();
    vector<int>::reverse_iterator it3 = v.rend();

    cout << *it2 << "\n";   // 6
    cout<<*it3 <<"\n";   // 1

    cout<< v[0] <<"\n";  // 1
    cout<<v.at(0)<<"\n";  // 1

//==================================================

    // iterating over vector using iterators
    int i = 1;
    for (vector<int>::iterator it = v.begin(); it !=v.end() ; it++) {
        cout<<i<<" : "<<*it<<", ";
        i++;
    }
    cout<<"\n";

//==================================================
// or
  for(auto it = v.begin(); it != v.end() ; i++) {
    cout<<*it<<", ";
    it++;
  }
  cout<<"\n";

//   or
 for(auto it : v) {
    cout<<it<<", ";
 }
//=================================================
//  {1,2,3,4,5,6}
cout<<"===\n";
v.erase(v.begin()+1); //{1,3,4,5,6}
for(auto it : v) {
    cout<<it<<", ";
 }

cout<<"==\n";
//{1,3,4,5,6}
v.erase(v.begin()+2, v.begin()+ 4); //{1,3,6} 
for(auto it : v) {
    cout<<it<<", ";
 }
 cout<<"\n";

//============================================
//  insert Function 

vector<int>vv(2,100); //{100,100}

// inserting
vv.insert(vv.begin(), 300); // {300,100,100}

vv.insert(vv.begin()+1, 4, 12); // {300,12,12,12,12,100,100}
for(auto it : vv){
    cout<<it<<", ";
}

cout<<"\n";


// =========================================
//  copy vector to vector
vv.insert(vv.begin(),v.begin(),v.end());
for(auto it : vv){
    cout<<it<<", ";
}
cout<<"\n";

// ==============================
// size
// {1, 3, 6, 300, 12, 12, 12, 12, 100, 100,}
cout<<"size : "<<vv.size()<<"\n"; // 10

// pop_back

 vv.pop_back(); //100 - poped out 
                // pops out the last element


// v =  { 1 3 6 }
// vv = { 1 3 6 300 12 12 12 12 100 } 

v.swap(vv); // v{ 1 3 6 300 12 12 12 12 100 }
            // vv {1 2 3}




v.clear() ; // erases the entire vector 

cout<< v.empty();  // 1 ( True )















}

int main() {
    iterators();
    return 0;
}