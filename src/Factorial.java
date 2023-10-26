import java.util.Scanner;

class Factorial_ {
    void fact(){
        int fact=1, num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        num = in.nextInt();
        for(int i=1; i<=num; i++){
            fact = fact*i;
        }
        System.out.println("Factorial:"+fact);
    }
}
class Factorial{
    public static void main(String[]args){
        Factorial_ f = new Factorial_();
        f.fact();
    }
}
