
// class Gh extends Thread
// {
//     public void run(){
//         for(int i=0;i<50;i++)
//         System.out.println("run in g");
//         try { Thread.sleep(40);} catch (InterruptedException e) {e.printStackTrace();}
//     }
// }
// class Ba extends Thread
// {
//     public void run(){
//         for(int i=0;i<50;i++)
//         System.out.println("running in a");
//         try { Thread.sleep(40);} catch (InterruptedException e) {e.printStackTrace();}
//     }
// }


// public class Threads {
//     public static void main(String[] args) throws InterruptedException {
//         Gh obj1=new Gh();
//         Ba obj2=new Ba();
//         obj1.start();
//         // Thread.sleep();
//         obj2.start();
//     }
// }



class Gh implements Runnable
{
    public void run(){
        for(int i=0;i<50;i++)
        System.out.println("run in g");
        try { Thread.sleep(40);} catch (InterruptedException e) {e.printStackTrace();}
    }
}
class Ba implements Runnable
{
    public void run(){
        for(int i=0;i<50;i++)
        System.out.println("running in a");
        try { Thread.sleep(40);} catch (InterruptedException e) {e.printStackTrace();}
    }
}

public class Threads {
    public static void main(String[] args) throws InterruptedException {
        Runnable obj1=new Gh();
        Runnable obj2=new Ba();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
    }
}


// public class Threads {
//     public static void main(String[] args) throws InterruptedException {
//         Runnable obj1=()->{
//                 for(int i=0;i<50;i++)
//                 System.out.println("run in g");
//                 try { Thread.sleep(40);} catch (InterruptedException e) {e.printStackTrace();}
//         };
//         Runnable obj2=()->{
//                 for(int i=0;i<50;i++)
//                 System.out.println("running in g");
//                 try { Thread.sleep(40);} catch (InterruptedException e) {e.printStackTrace();}  
//         };
//         Thread t1=new Thread(obj1);
//         Thread t2=new Thread(obj2);
//         t1.start();
//         t2.start();
//     }
// }


// class Counter{
//     int count;
//     public synchronized void increament()//synchronized this helps to clash between the threads to use this method
//     {   // thread safe
//         count++;
//     }
// }
// public class Threads {
//     public static void main(String[] args) throws InterruptedException {
//         Counter c=new Counter();
//         Runnable obj1=()->{
//                 for(int i=0;i<500;i++){
//                     c.increament();
//                 }
//             };
//         Runnable obj2=()->{
//                 for(int i=0;i<500;i++){
//                     c.increament();
//                 }
//         };
//         Thread t1=new Thread(obj1);
//         Thread t2=new Thread(obj2);
//         t1.start();
//         t2.start();
//         //join helps the main function to wait until the threads complete their work
//         t1.join();
//         t2.join();

//         System.out.println(c.count);
//     }
// }

