public class dimarray {
    public static void main(String[] args) {
        int a1[]=new int[5];
        int a2[][]=new int[5][4];
        int a3[][][]=new int[4][3][2];
       
       //1darray
        for(int i=0;i<a1.length;i++){
            a1[i]=(int)(Math.random()*10);
            System.out.println(a1[i]);
        }
        System.out.println();


        //2darray
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                a2[i][j]=(int)(Math.random()*10);
                System.out.print(a2[i][j]+"    ");
            }
            System.out.println();
        }
        System.out.println();
        // for(int[] i:a2){
        //     for(int j:i)
        //     {
        //         System.out.print(j+"    ");
        //     }
        //     System.out.println();
        // }
        

        //jagged array
        int jagged[][]=new int[3][];
        jagged[0]=new int[4];
        jagged[1]=new int[5];
        jagged[2]=new int[2];       
        for(int i=0;i<jagged.length;i++){
            for(int j=0;j<jagged[i].length;j++){
                jagged[i][j]=(int)(Math.random()*10);
                // System.out.print(jagged[i][j]+"    ");
            }
            // System.out.println();
        }

        for(int[] i:jagged){
            for(int j:i)
            {      
                System.out.print(j+"    ");
            }
            System.out.println();
        }
        System.out.println();

        //3darray
        for(int i=0;i<a3.length;i++){
            for(int j=0;j<a3[i].length;j++){
                for(int k=0;k<a3[i][j].length;k++){

                a3[i][j][k]=(int)(Math.random()*10);
                System.out.print(a3[i][j][k]+"    ");
                }
                System.out.print("  ");

            }
            System.out.println();
        }

    }
}
