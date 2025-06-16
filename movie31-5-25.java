
31-5-25


public class Movie {
    String name;
    float rating;
    String duration;
    Movie(String name,float rating,String duration){
        this.name=name;
        this.rating=rating;
        this.duration=duration;
    }
        void details(){
            System.out.println("movie name:"+name);
            System.out.println("movie rating:"+rating);
            System.out.println("movie duration:"+duration);
            if(rating >8){
                System.out.println("movie is hit");
            
            }  System.out.println("------------------------------");

        }

        public static void main(String args[]) {
        Movie m1=new Movie("spider",8.5f,"2:30min");
        Movie m2=new Movie("animal",7.5f,"2:30min");
        m1.details();
        m2.details();
        }
        }

GAME


public class game {
    String name;
    String genere;
    int playcount=0;
    float rating;
    game(String name,String genere,float rating){
        this.name=name;
        this.rating=rating;
        this.genere=genere;
    }
    public void familyfriendly(){
        if(genere == "horror"){
            System.out.println("not a family friendly");
        } System.out.println("a family friendly");

    }
   public void play(){
         System.out.println("the game is running");
       this.playcount=this.playcount+1;
    }
        public void getsummary(){
            System.out.println("game name:"+name);
            System.out.println("game rating:"+rating);
            System.out.println("game genere:"+genere);
            System.out.println("playcount:"+this.playcount);

        }

        public static void main(String args[]) {
        game g1=new game("pubg","horror",6);
        game g2=new game("temple run","adventure",7);
        g1.play();
        g1.play();
        g1.getsummary();
        }
        }




public class main{
    public static void main(String args[]){
        int[] nums={1,2,3,4,5,6};
        LinkedList list=new LinkedList();
        Node head=LinkedList.arrayToList(nums);
        var temp=head;
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
            var temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        Node gethead(){
            return head;
        }
        int length(){
            int length=0;
            var temp=head;
            while(temp!=null){
                length=length_+1;
                temp=temp=temp.next;
                
            }return length_;
        }
        static Node arrayToList(int[] nums){
            LinkedList list=new LinkedList();
            for(int i=0;i<nums.length;i++){
                list.insertend(nums[i]);
            }return list.gethead();
             
        }
    }
  
    
}
    