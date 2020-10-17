public class ExceptionC extends ExceptionB{
    public void method3() throws Exception {
        try {
            System.out.println("Exception C");
            super.method2();
        } catch (Exception exception){
            throw new Exception("Exception thrown in ExceptionC", exception);
        }
    }
}
