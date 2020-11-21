

public class Chapter20Task5 {

    public static void main(String[] args){

        Integer[] integerArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.printf("Array integerArray contains:%n");
        printArray(integerArray, 3, 8);
        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray, 1, 6);
        System.out.printf("%nArray characterArray contains:%n");
        printArray(characterArray, 1, 3);

    }

    public static <T> void printArray(T[] inputArray, int lowSubscript, int highSubscript){
        try{
            if((lowSubscript<0 || lowSubscript>=inputArray.length) || (highSubscript<0 || highSubscript>=inputArray.length) || lowSubscript>highSubscript)
                throw new Exception("InvalidSubscriptException");
            for(int i = 0; i<inputArray.length; i++) {
                if(i<lowSubscript) continue;
                if(i>highSubscript) break;
                System.out.printf("%s ",inputArray[i]);
            }
            System.out.println("\nSize Array: "+inputArray.length);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
