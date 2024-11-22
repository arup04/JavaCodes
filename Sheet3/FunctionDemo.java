package Sheet3;

interface Function {
    int evaluate(int x);
}

class Half implements Function {
    @Override
    public int evaluate(int x) {

        return x / 2;
    }
}

public class FunctionDemo {
    public static int[] halfeachelem(int[] arr) {

        Half halfFunction = new Half();

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = halfFunction.evaluate(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] inputArray = {10, 20, 30, 40, 50};


        int[] outputArray = halfeachelem(inputArray);


        System.out.println("Original Array:");
        for (int value : inputArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Processed Array (Half Values):");
        for (int value : outputArray) {
            System.out.print(value + " ");
        }
    }
}

