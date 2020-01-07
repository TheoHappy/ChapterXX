public class NongenericMethod {
    public static void main(String[] args) {
        // create arrays of Integer, Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.printf("Array stringArray contains:%n");
        printArray(integerArray); // pass an Integer array
        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray); // pass a Double array
        System.out.printf("%nArray characterArray contains:%n");
        printArray(characterArray); // pass a Character array
    }

    public static <T> void printArray(T[] inputArray)
    {
        for (T element : inputArray)
            System.out.printf("%s ", element);

        System.out.println();
    }


    public static void printArray(Integer[] inputArray) {
        String[] numbers = new String[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            numbers[i] = convertNumberToString(inputArray[i]);
            if (i < inputArray.length / 2)
                System.out.format("%s   ",numbers[i]);
            if (i == inputArray.length / 2)
                System.out.println();
            if (i >= inputArray.length / 2) {
                if (numbers[i].length() > numbers[i-inputArray.length/2].length()) {
                    System.out.format("%s%s ",
                            numbers[i],
                            spaceCreator(numbers[i].length() - numbers[i - inputArray.length / 2].length()));
                }

                if (numbers[i].length() < numbers[i-inputArray.length/2].length()) {
                    System.out.format("%s%s   ",
                            numbers[i],
                            spaceCreator(numbers[i - inputArray.length / 2].length() - numbers[i].length()));
                }

                if (numbers[i].length() == numbers[i-inputArray.length/2].length()){
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


    public static String convertNumberToString(Integer number) {
        String result = null;
        switch (number) {
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
        }
        return result;
    }
}
