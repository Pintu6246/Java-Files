public class Palindrome {
    
    public static boolean palindrome(String str){

        str=str.toLowerCase();
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left) == str.charAt(right)){
                return true;
            }
            left++;
            right--;
        }
        return false;
    }

    public static void main(String[] args) {
        String str="raCecaR";
        System.out.println(palindrome(str)+"is the palendrome ");    
    }
}
