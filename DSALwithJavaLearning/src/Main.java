class Adder{
    static int add(int a,int b){return a+b;}
    static double add(int a,int b , int c){return a+b;}
}

class A{
    public A(int a){
        System.out.println("int A");
    }
    public A(){
        System.out.println("a");
    }
}
class B extends A{

    public void test(){
            System.out.println("Test");
    }
    public B(int a){

        System.out.println("Int B");
    }
    public B(){

        System.out.println("b");
    }
}
class TestOverloading3{
    public static void main(String[] args){
//        System.out.println(Adder.add(11,11 , 11));//ambiguity
//        String n = "Tanma";
//        String b = "Tanma";
//        StringBuffer sb = new StringBuffer("Tanmay");
//        StringBuffer s = new StringBuffer("Tanmay");
//        System.out.println(sb == s);
//        System.out.println(n == b);
//        sb.append(" Kumar");
//        System.out.println(sb);
//        System.out.println(s);
//          B obj = new B();
//          obj.test();
//          int sum = 0;

//          while (a > 0){
//              sum += a%10;
//              a /= 10;
//          }
//        System.out.println(sum);
        int a = 78;
          int sum = 0;
          while (a > 10){
              while (a > 0) {
                  sum += a % 10;
                  a /= 10;
              }
              a = sum;
          }
    }
}