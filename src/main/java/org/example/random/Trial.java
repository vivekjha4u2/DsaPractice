package org.example.random;

public class Trial {

    /******* MCQ1 IBM *********/
//    public static void main(String[] args) {
//        Trial trial = new Trial();
//        try {
//            System.out.println("a");
//            trial.display();
//            System.out.println("b");
//        }catch (Exception ex){
//            System.out.println(ex);
//        }finally {
//            System.out.println("finally block");
//        }
//        System.out.println("d");
//    }
//
//    private void display() {
//        throw new Error();
//    }

    /**************************/
    int instanceVar = 2;
    static int staticVar = 3;
    class InnerClass{
        int innerVar = 4;
        void display(){
            System.out.println(instanceVar+ " "+staticVar+" "+innerVar);
        }
    }

    public static void main(String[] args) {
        String s = "horse";
        System.out.println(s.indexOf('o',0));
    }
}
