

//class Add {
//    int a, b;
//    Add(){
//         a=10;
//         b=10;
//    }
//    void show(){
//        System.out.println("The sum of 2 numbers :"+(a+b));
//    }
//    public static void main(String[]args){
//        Add a = new Add();
//        a.show();
//    }
//}

//class Add{
//    int a, b;
//    Add(int x, int y){
//        a=x;
//        b=y;
//    }
//    void show(){
//        System.out.println("The sum of 2 numbers :"+(a+b));
//    }
//    public static void main(String[]args){
//        Add a = new Add(20, 50);
//        a.show();
//    }
//
//}
class Add {
    int a, b;
    Add(int x, int y){
        a=x;
        b=y;
    }

    Add(Add c) {
        a = c.a;
        b = c.b;
    }

    void show() {
        System.out.println("The sum of 2 numbers :" + (a + b));
    }

    public static void main(String[] args) {
        Add a = new Add(20, 50);
        Add a1 = new Add(a);
        a.show();
        a1.show();
    }
}


