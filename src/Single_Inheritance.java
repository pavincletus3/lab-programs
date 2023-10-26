import java.util.Scanner;

class student{
    String name, dept;
    int age;
    Scanner in = new Scanner(System.in);
    void get(){
        System.out.println("Enter student name: ");
        name = in.next();
        System.out.println("Enter the age: ");
        age = in.nextInt();
        System.out.println("Enter the department name: ");
        dept = in.next();
    }
    void show(){
        System.out.println("Student name: "+name);
        System.out.println("Student age: "+age);
        System.out.println("Student Department: "+dept);
    }
}
class area extends student{
    String state;
    void get(){
        System.out.println("Enter the State: ");
        state = in.next();
    }
    void show(){
        System.out.println("State: "+state);
    }
}
class Single_Inheritance {
    public static void main(String[]args){
        student s = new student();
        area a = new area();
        s.get();
        a.get();
        s.show();
        a.show();
    }
}
