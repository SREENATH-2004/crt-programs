public class Movies{
    String name;
    float rating;
    String duration;
    Movies(String name,float rating,String duration){
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
        Movies m1=new Movies("spider",8.5f,"2:30min");
        Movies m2=new Movies("animal",7.5f,"2:30min");
        m1.details();
        m2.details();
        }
        }
