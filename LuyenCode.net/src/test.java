public class test {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            System.out.println();

            for (int k=n-(i-1);k>=1;k--){
                System.out.printf(" ");
            }

            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }

        }
    }
}
