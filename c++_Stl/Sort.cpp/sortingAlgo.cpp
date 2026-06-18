#include<iostream>


using namespace std;

bool comp(pair<int, int>p1, pair<int, int>p2)  //Comperator -----------> has to return a boolean 
{
    if(p1.second < p2.second) return true;
    if(p1.second > p2.second) return false;
    // if they are same ========== evaluate

    if(p1.first > p2.first) return true;
    return false;
}
void s(){
    // sort(a, a+n );
    // sort(v.begin(), v.end());  vector

    // sort(a+2, a+4);

    // sort(a, a+n. greater<int>); // for descending order --- COMPERATOR ---

    pair<int , int> a[] = {{1, 2}, {2, 1}, {4, 1}};

    // sort it according to second element
    // if second element is same , then sort
    // it according to first element but in descendiing 

    //  sort(a, a+n, comp);

    // { {4, 1}, {2 , 1}, {1, 2} }
}

void explainBuilt_in_popcount(){
    int num = 7;
    int cnt = __builtin_popcount(num); //  number of 1's in bnary
    // cnt = 3          [ 7 -> 111 ]
    //  cnt for 6 = 2   [ 6 -> 110 ]

    long long num = 122981243;
    int cnt = __builtin_popcountll(num);  //for long values

    string s = "123";
    do{
        cout<<s <<"\n";

    } while(next_permutation(s.begin(), s.end()));

    // int max = *max_element(a, a+n);
}

int main(){
    explainBuilt_in_popcount();
    return 0;
}






