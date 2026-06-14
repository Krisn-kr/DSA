
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
v.erase(v.begin()+2, v.begin()+ 4); //{1,2,3,6} 
for(auto it : v) {
    cout<<it<<", ";
 }

