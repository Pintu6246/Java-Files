// @FunctionalInterface
// interface Cvb{
//     void play(int i);
// }


// public class Functionalinterface {
//     /*    () ->     
//         new Cvb(){
//             public void play(){
//                 System.out.println("playing");
//             }
//         };

//     */
//     public static void main(String[] args) {
//         Cvb obj =(i) -> System.out.println("playing "+i);
//         obj.play(9);
//     }
    
// }


interface Asdfg{
    int add(int a,int b);
}
public class Functionalinterface{
    public static void main(String[] args) {
        Asdfg obj=(i,j) -> i+j  ;
        int res= obj.add(6,8);
        System.out.println(res);
        
    }
}
