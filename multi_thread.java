public class multi_thread {
   
 public static void main(String[] args){
        spotify s1=new spotify();
        spotify s2=new spotify();
        spotify s3=new spotify();
        s1.start();
        s2.start();
        s3.start();
    }
}

class spotify extends Thread{
    public void run(){
        for(int i=0;i<2;i++){
            System.out.println("Songs");
            System.out.println("Duration");
            System.out.println("Lyrics");
        }
    }
}