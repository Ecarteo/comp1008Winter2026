package wk3;

public class WorkingWithArraysAndArrayLists {

    public static void main(String[] args) {
            example1();
    }
    static  void example1(){

        String[] names = new String[10];
        names[0] = "John";
        int[] numbers = {1,2,3,4,5};

        for(int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println("*".repeat(10));
        //foreach(dt placeHolder in array/collection){}
        for(int num : numbers){
            System.out.println(num);
        }

    }
    static  void example2(){}
    static  void example3(){}
    static  void example4(){}
    static  void example5(){}
    static  void example6(){}
}
