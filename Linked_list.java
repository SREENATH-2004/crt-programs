class Node{
    int data;
    Node next;
    Node (int data){
        this.data=data;
        this.next=null;
    }

}
class LinkedList{
    Node head;
    LinkedList(){
        this.head=null;
    }
    public void insertatbeg(int data){
        Node s=new Node(data);
        s.next=head;
        head=s;
    }
    public void insertAtEnd(int data){
        Node s=new Node(data);
        if(head==null){
            head=s;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=s;
    }
    public void insertatpos(int pos,int data){
        Node s=new Node(data);
        if(pos>=0 && pos<=length()){
            if(pos==0){
                insertatbeg(data);
            }else if(pos==length()){
                insertAtEnd(data);
            }else{
                Node temp=head;
                for(int i=1;i<pos;i++){
                    temp=temp.next;
                }s.next=temp.next;
                temp.next=s;

            }
            }else {
                System.out.println("the pos is invalid");

        }

    }
    int length(){
        int length_=0;
        Node temp=head;
        while(temp!=null){
            length_=length_+1;
            temp=temp.next;
        }return length_;

    }
      void print(){
        Node temp=head;
        System.out.println("elements are");
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");

    }

}
public class Linked_list{
    public static void main(String args[]){
        LinkedList M=new LinkedList();
        M.insertatbeg(1);
        M.insertatbeg(2);
        M.print();
        M.insertAtEnd(3);
        M.insertAtEnd(4);
        M.insertatpos(2,40);
        M.print();
        System.out.println(M.length());
    }
}

