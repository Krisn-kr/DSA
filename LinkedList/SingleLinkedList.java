package LinkedList;

// node creation
class Node{
        int data;
        Node next;

        Node(int data1, Node next1){
            this.data = data1;
            this.next = next1;

        }
        // oir
        Node(int data1){
            this.data = data1;
            this.next = null;
        }
    };

    //single linked list
    
public class SingleLinkedList {

    private static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for( int i = 1; i< arr.length; i++){
        Node  temp = new Node(arr[i]);
        mover.next = temp;
        mover = temp;
        }
        return head;
    
        }     
        // Finding the length of the linked list
        private static int lengthOfLL(Node head){
            int cnt =0; 
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
                cnt++;
            }
            return cnt;
        }

        // check if the value is present 
        public static String checkValue(Node head, int val){
            Node temp = head;
            int cnt =0;
            while(temp != null){

                if(temp.data == val){
                    cnt++;
                }
                temp= temp.next;
            }
            if(cnt<1){
                return "Not Present";
            }
            return "Present";
        }
    
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8};
        Node head = convertArr2LL(arr);
        System.out.println(head.data);
        Node temp = head;

        // traversing the linked list
    while(temp != null){
        System.out.print(temp.data + " ");
        temp = temp.next;

        }
        System.out.println("\n The length of the node : "+lengthOfLL(head));

        // Check if the value is present or not;
        System.out.println("Check 2 is present or not :\n" +checkValue(head,2));
    }

    
    
    
    
}
