#include <iostream>
using namespace std;

class Node{
    public:
    int data;
    Node *next;
    public:
    Node(int data1, Node* next1){
        data = data1;
        next = next1;
    } 
    Node(int data1){
        data = data1;
        next = nullptr;
    } 
};

Node * convertArr2LL(vector<int> &arr){
    Node* head = new Node(arr[0]);
    Node* mover = head;

    for( int i = 1; i< arr.size(); i++){
        Node* temp = new Node(arr[i]);
        mover->next = temp;
        mover = temp;
    }
     return head;
    
}

// Length of the linked list
int lengthOfNode(Node* head){
    int count = 0;
    Node* temp = head;

    while (temp)
    {
        temp = temp->next;
        count ++;
    }
    return count;
    
}
int main(){
    vector<int> arr = {2, 5, 8, 7};
    Node* head = convertArr2LL(arr);
    cout<< head->data;

    Node* temp = head;

    while (temp)
    {
        cout<< temp->data<<" ";
        temp = temp->next;
    }

    cout<<"\nLenght of the node : "<< lengthOfNode(head);

    return 0;
}