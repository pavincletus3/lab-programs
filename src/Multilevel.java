import java.util.Scanner;

class employee{
    Scanner in = new Scanner(System.in);
    int bp, id;
    String name;
    void get(){
        name = in.next();
        id = in.nextInt();
        bp = in.nextInt();
    }
    void showpay(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(bp);
    }
}
class payment extends employee{
    double da, psa, gs;
    void show(){
        da = 0.1*bp;
        psa = 0.12*bp;
        gs = da+psa+bp;
        System.out.println("DA = "+da);
        System.out.println("PSA = "+psa);
        System.out.println("Gross salary = "+gs);
    }
}
class display extends payment{
    void showall(){
        show();
        get();
        showpay();

    }
}

public class Multilevel {
    public static void main(String[]args){
        display ob = new display();
        ob.get();
        ob.showall();
    }
}
