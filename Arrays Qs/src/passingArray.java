import java.util.Scanner;

public class passingArray {
    public static void arrayPassing(int[] number, Scanner sc){
        for(int i = 0; i<number.length; i++){
            System.out.println("Enter the number: ");
            number[i] = sc.nextInt();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] number = new int[n];
        arrayPassing(number, sc);
        System.out.println("Array elements are: ");
        for(int i = 0; i<number.length; i++){
            System.out.print("{" + i + ": " + number[i] + "}");
        }
        sc.close();
    }
}
