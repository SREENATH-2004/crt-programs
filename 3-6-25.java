public class Main{
    public static void main(String args[]){
        Stack n=new Stack();
        n.push(20);
        n.push(30);
        n.push(40);
        n.push(50);
        n.pop();
        n.print();
    }
}
class Node {
    int data;
    Node next;
    Node (int data){
        this.data=data;
        this.next=null;
    }
}
class Stack{
    Node head;
    
    Stack(){
        this.head=null;
    }
    boolean isempty(){
        if(head == null){
            return true;
        }else{
            return false;
        }
    }
    void push(int data){
        Node newNode=new Node(data);
        if(isempty()){
            this.head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    int pop(){
        if(isempty()){
            System.out.println("stack is empty");
            return -1;
        }else{
            int val=head.data;
            head=head.next;
            return val;
        }
    }
    void print(){
        var temp = head;
        System.out.println("-----------------");
        while(temp!=null){
        System.out.println(temp.data+" ");
        temp=temp.next;
        }System.out.println("-------------------");
    }
}







public class Main{
    public static void main(String[] args){
        Queue q=new Queue(5);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(40);
        q.dqueue();
        q.print();
    }
}
class Queue {
    int[] queue;
    int size;
    int rear;
    Queue(int size){
        this.size=size;
        this.queue=new int[size];
        this.rear= -1;
    }
    boolean isfull(){
       return rear == size -1;
    }
    boolean isempty(){
        if(rear == -1){
        return true;
        }else{
            return false;
        }
    }
    void enqueue(int val){
        if(isfull()){
            System.out.println("Queue is full");
            return;
        }
        rear=rear+1;
        queue[rear]=val;
    }
    int dqueue(){
        if(isempty()){
            System.out.println("queue is empty");
            return -1;
        }
        else{
            int val=queue[front];
            for(int i=1;i<=rear;i++){
queue[i-1]=queue[i];
}
            return val;
        }
    }
    void print(){
        for(int i=0;i<=rear;i++){
            System.out.println(queue[i]);
        }
    }
}