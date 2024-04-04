public class trycatch {
    public static void main(String[] args) {
        try{
            int num[]={1,2,3,4,5,6,7,8,9,0};
            System.out.println(num[10]);
        }catch(Exception e){
            System.out.println("something went wrong, please check again");
        }finally{
            System.out.println("try catch is finished");
        }
    }
}
