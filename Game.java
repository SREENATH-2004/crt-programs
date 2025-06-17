public class Game {
    String name;
    String genere;
    int playcount=0;
    float rating;
    Game(String name,String genere,float rating){
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
        Game g1=new Game("pubg","horror",6);
        Game g2=new Game("temple run","adventure",7);
        g1.play();
        g1.play();
        g1.getsummary();
        }
    }