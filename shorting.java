import java.util.Scanner;

public class shorting {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("write your array size : ");
        int size = input.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print(i+ " :=> ");
            array[i] = input.nextInt();
        }
        int emp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]) {
                    emp = array[i];
                    array[i] = array[j];
                    array[j] = emp; 
                }
            }
            System.out.print(array[i] +" ");
        }
    }
}
