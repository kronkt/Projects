public class Arrays {
    public static void main(String[] args) {

        // can be declared either way
        int[] array1;
        int array2[];

        // need to specify how big the array will be
        array1 = new int[5];

        // can also do it when initializing
        int[] array3 = new int[5];

        // modification
        array1[2] = 2;

        // can assign variables to array elements
        int secondNumber = array1[2];

        // can initialize them this way as well
        int numbers[] = {1, 2, 3, 4, 5};

        // length
        int length = numbers.length;

        // can use the length for loops
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // MULTI-DIMENSIONAL ARRAYS....

        int[][] array4 = new int[3][10];

        System.out.println("Multi-dimensional rows: "+ array4.length);
        System.out.println("Multi-dimensional columns: "+ array4[0].length);





    }
}