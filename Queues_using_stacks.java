
public class Queues_using_stacks{
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
            int val=queue[rear];
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