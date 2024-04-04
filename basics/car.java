
//inheritance

class vehicle {     //super class

    protected String brand="ford";//protected: accessed from the same file ie same class and sub class 
    public  void honk() {
        System.out.println("tutt,tutt");
    }
}

class car extends vehicle {     //sub class
private String modelname="mustang";//protected: accessed within the same class 
public static void main(String[] args) {
    car mycar =new car();
    mycar.honk();//calling the method from super class
    System.out.println(mycar.brand+" "+mycar.modelname);//acessing the variables from sub class and from superclass 
}
    
}
