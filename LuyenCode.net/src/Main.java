import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[11];
        int i;



        for (i=0;i<arr.length;i++) {
            arr[i] = in.nextInt();

        }
        for (i=0;i<arr.length;i++) {
            if(arr[i]==arr[arr.length]){
                System.out.print("YES");
                return;
            }

        }
        System.out.println("NO");

    }
}
