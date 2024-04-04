public class threadimpliments implements Runnable {
    public void run(){
        System.out.println("this code is running in a thread");
        }
    public static void main(String[] args) {
        threadimpliments thread =new threadimpliments();
        thread.run();
        //System.out.println("this code is running in a thread");
    }
}
