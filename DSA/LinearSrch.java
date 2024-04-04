import java.util.Scanner;

public class LinearSrch {

    public static void main(String[] args) {

        int[] n={2,3,4,5,6,7,8};
        int key=7;

        int result=linearSearch(n, key);
        int result1=binarySearch(n, key);

        if(result!=-1 || result1!=-1){
        System.out.println("key is at "+result+"th index");
        System.out.println("key is at "+result1+"th position");
        }
        else
        System.out.println("element not found");
    }

    public static int linearSearch(int[] n, int key) {
        int steps=0;
        for(int i=0;i<n.length;i++){
            steps++;
            if(n[i]==key){
                System.out.println("Linear search steps "+steps);
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] n, int key){
        int len=0,righ=n.length-1,steps=0;
        while(len<=righ){
            steps++;
            

            int mid=(len+righ)/2;

            if(n[mid]==key){
                System.out.println("Binary search steps "+steps);
                return mid;
            }
            else if (n[mid]>key) {
                righ=mid-1;
            }
            else{
                len=mid+1;
            }
        }
        System.out.println("Binary search steps "+steps);
        return -1;
      
    }

    
}