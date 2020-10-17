public class Task16Chapter11_test {
    public static void main(String[] args){
        method();
        System.out.println();
        altMethod();
    }
    public static void altMethod(){
        ExceptionC exceptionC = new ExceptionC();
        try {
            exceptionC.method3();
        } catch (Exception e) {
            e.printStackTrace();
        }

        ExceptionB exceptionB = new ExceptionB();
        try{
            exceptionB.method2();
        } catch (Exception e){
            e.printStackTrace();
        }

        ExceptionA exceptionA = new ExceptionA();
        try{
            exceptionA.method1();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void method(){
        try{
            System.out.println("Exception A");
            method1();
            throw new ExceptionB();
        }  catch (ExceptionA exceptionA) {
            exceptionA.printStackTrace();
        }
    }
    public static  void method1(){
        try{
            System.out.println("Exception B");
            method2();
            throw new ExceptionC();
        } catch (ExceptionB exceptionB){
            exceptionB.printStackTrace();
        }
    }
    public static void method2(){
        try{
            System.out.println("Exception C");
        } catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
