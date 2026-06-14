#include<iostream>
#include<set>

using namespace std;

void explainSet(){

    //  sorted and unique
    set<int>st;
    st.insert(1); //{1}
    st.insert(2); // {1, 2}
    st.insert(2); // {1, 2}  no repitation

    st.insert(4); // {1, 2, 4}

    st.insert(3); // {1, 2, 3, 4}   ** sorted **

    // Functionality of insert in vector can be used also, that only increases efficiency


    // begin(), end(), rbegin(), rend(), size(),
    // empty() and swap() are same as those of above

    // {1, 2 ,3 ,4,}
    auto it = st.find(3);  // it -> iterator 

    // {1, 2, 3, 4, }

    // auto itt = st.find(5);   ================
                                //  5 not available
                                //  st.end() , points to the end

    st.erase(4); //{1, 2, 3}  -----> takes logarithmic time
                //    passing    ----> element

    st.erase(it);   //---------> takes constant time 
                    //  passing ---> address
    
    
    
    
    int cnt  = st.count(1); //      exist = 1
                            //  not- exist = 0
    
        //  {1, 2, 3, 4, 5}                   
    auto it1 = st.find(2);    
    auto it2 = st.find(4);     
    st.erase(it1, it2); // after erase {1, 4, 5} [first, last]

    // lower _bound( ) and upper_bound() function works in the same way
    //  as in vector it does.

    // This is the syntax
    auto it3 = st.lower_bound(2);

    auto it4 = st.upper_bound(3);

}

// MultiSet

void explainMultiSet(){

    //  only sorted
    //  can hold multiple comaon elements

    multiset<int>ms;
    ms.insert(1); //{1}
    ms.insert(1); //{1, 1}
    ms.insert(1); //{1, 1, 1}

    ms.erase(1) ;// erases all 1's 

    int cnt = ms.count(1);

    // only a single one erase
    ms.erase(ms.find(1));

    auto it = ms.find(1);
ms.erase(it, next(it, 2)); 
// rest all fuunctions same as set

}

int main(){
    explainSet();
     

    explainMultiSet();
    return 0;
}