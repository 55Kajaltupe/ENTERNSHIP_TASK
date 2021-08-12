

public class Jpr2 {
    int k;
    String s;
    static{
        System.out.print("1st Static block");
    }
    {
        System.out.print("Instance block");
        System.out.print("Lets initialize instance varibles ");
        K=50;
        s="kaju";
    }
    static{
        System.out.print("2nd static block");
    }

    public static void main(String[] args) {
        System.out.print("Create object of class");
        JPR6 ob=new JPR2();
        System.out.print("check value of initialized variables in instance block");
        System.out.print("k= "+ob.k+" s= "+ob.s);

    }
}
© 2021 GitHub, Inc.
