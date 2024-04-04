public class star {
    public static void main(String[] args) {
        // for(int i=0;i<5;i++){//0
        //     for(int j=0;j<=i;j++)//0
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        int row=6;
        for(int i=0;i<row;i++){//0
            for(int j=(row-i);j>1;j--)//0
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)//0
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
