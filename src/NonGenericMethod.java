public class NonGenericMethod {
    public static void main(String[] args) {
        // create arrays of Integer, Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"one", "two", "three", "four", "five", "six", "seven", "eight"};
        
        System.out.printf("Array integerArray contains:%n");
        printArray(integerArray); // pass an Integer array
        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray); // pass a Double array
        System.out.printf("%nArray characterArray contains:%n");
        printArray(characterArray); // pass a Character array
        System.out.printf("%nArray stringArray contains:%n");
        printArray(stringArray); // pass a String array
    }

    public static <T> void printArray(T[] inputArray)
    {
        for (T element : inputArray)
            System.out.printf("%s ", element);

        System.out.println();
    }


    public static void printArray(String[] inputArray) {
        String[] numbers = inputArray;
        for (int i = 0; i < inputArray.length; i++) {
            if (i < inputArray.length / 2)
                System.out.format("%s   ",numbers[i]);
            if (i == inputArray.length / 2)
                System.out.println();
            if (i >= inputArray.length / 2) {
                int secondRowLength = numbers[i - inputArray.length / 2].length();
                if (numbers[i].length() > secondRowLength) {
                    System.out.format("%s%s ",
                            numbers[i],
                            spaceCreator(numbers[i].length() - secondRowLength));
                }

                if (numbers[i].length() < secondRowLength) {
                    System.out.format("%s%s   ",
                            numbers[i],
                            spaceCreator(secondRowLength - numbers[i].length()));
                }

                if (numbers[i].length() == secondRowLength){
                    System.out.format("%s   ",
                            numbers[i]);
                }

            }
        }
        System.out.println();
    }

    public  static String spaceCreator(int n){
        String result = " ";
        for (int i = 1; i < n; i++)
            result = result + " ";
        return result;
    }
   
}
