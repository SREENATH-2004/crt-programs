public class linked_list_array{
    public static void main(String args[]){
        int[] nums={1,2,3,4,5,6};
        LinkedList list=new LinkedList();
        Node head=LinkedList.arrayToList(nums);
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        
    }
    class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            
        }
        
    }
    class LinkedList{
        Node head;
        LinkedList(){
            this.head=null;
        }
        public void insertend(int data){
            Node newNode=new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        Node gethead(){
            return head;
        }
        int length(){
            int length_=0;
            Node temp=head;
            while(temp!=null){
                length_=length_+1;
                temp=temp.next;
                
            }return length_;
        }
        public Node arrayToList(int[] nums){
            LinkedList list=new LinkedList();
            for(int i=0;i<nums.length;i++){
                list.insertend(nums[i]);
            }return list.gethead();
             
        }
    }
  
    
}