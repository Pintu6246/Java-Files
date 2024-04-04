public class threadextends extends Threads {
    public static void main(String[] args) {
        threadextends thread=new threadextends();
        thread.start();
        System.out.println("this code is outside the thread");
    }
    public void run(){
        System.out.println("this code is running in thread");
    }

}
