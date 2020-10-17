public class ExceptionA extends Exception {
    public void method1() throws Exception{
        try {
            System.out.println("Exception A");
        } catch (Exception exception){
            throw new Exception("Exception thrown in ExceptionA", exception);
        }
    }
}
