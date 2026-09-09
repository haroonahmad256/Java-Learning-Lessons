import java.util.Arrays;
public class Main {
    static void printArray(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    static int[] getArray(int[] arr) {
        for (int i=0; i<arr.length; i++){
            arr[i] +=1;
        }
        return arr;
    }

    static int[] par(){
        return new int[]{1,2,3};
    }

    public static void main(String[] args){
        int[] arr= {4,2,56,7,5,4,7}; //initialize
        int[] arr2= new int[10]; //declare
        int length= arr.length; //length of an array

        int[] arr3;
        arr3= new int[10];

        for(int i=0; i<length; i++){
            System.out.print(arr[i]+ " ");
        }

        for (int x:arr){
            System.out.print(x + " ");
        }
        printArray(arr);

        Arrays.sort(arr);

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(getArray(arr));

        //multidimensional arrays
        int[][] matrix;
        matrix = new int[3][4];

        String[] fruits= {"apple", "orange", "banana"};
        String[] vegetables= {"potato", "onion", "carrot"};
        String[] meats= {"chicken", "pork", "beef", "fish"};
        String[][] groceries= {fruits, vegetables, meats};
        for (String[] x: groceries){
            for (String y: x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
