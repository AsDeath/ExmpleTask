public class ExceptionB extends ExceptionA {
    public void method2() throws Exception{
        try {
            System.out.println("Exception B");
            super.method1();
        } catch (Exception exception){
            throw new Exception("Exception thrown in ExceptionB", exception);
        }
    }
}
