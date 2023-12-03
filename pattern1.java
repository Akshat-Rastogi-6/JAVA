public class pattern1 {
    public static void main(String[] args) {
        int a = 5;
        int n = 1;
        for(int i = 1; i<=a; i++){
            for(int j = 0; j<i; j++){
                // System.out.print(" * ");
                System.out.print(n);
                // n++;
            }
            System.out.println();
            n++;
        }
    }
}
