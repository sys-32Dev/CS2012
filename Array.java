import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        double[] arr = CreateArray();
        System.out.println("The array values are: ");
        PrintArray(arr);
        System.out.println("The cube of each value in the array is: ");
        CubeArray(arr);
        System.out.println("The array values are still: ");
        PrintArray(arr);
        System.out.println("The array values after changing values > 13 to 13 are: ");
        Change13(arr);
        PrintArray(arr);
        double[] cpyarr = ModifyArray(arr);
        System.out.println("The original array values are: ");
        PrintArray(cpyarr);
        System.out.println("The modified array values are: ");
        PrintArray(arr);
    }
 
    public static double[] CreateArray() {
        Scanner input = new Scanner(System.in);
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a non-negative double: ");
            double check = input.nextDouble();
            if (check < 0) {
                System.out.println("Invalid input. Enter a non-negative double: ");
                i--;
            } else {
                arr[i] = check;
            }
        }
        input.close();
        return arr;
    }

    public static void CubeArray(double[] arr) {
        for (double value : arr) {
            double cube = Math.pow(value, 3);
            System.out.println(value + " cubed is " + cube);
        }
    }
    
    public static void Change13(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 13) {
                arr[i] = 13;
            }
        }
    }

    public static double[] ModifyArray(double[] arr) {
        double[] cpyarr =arr.clone();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / 42;
        }
        return cpyarr;
    }
    
    public static void PrintArray(double[] arr) {
        for (double value : arr) {
            System.out.println(value);
        }
    }
}