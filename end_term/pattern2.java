class pattern2 {
    public static void main(String[] args) {
        int a = 5;
        int n = 1;

        for(int i = 1; i<=a; i++){
            for(int j = 1; j<=a-i; j++){
                System.out.print(" ");
            }

            for(int k = 1; k<=2*i-1; k++){
                System.out.print(n);
            }

            System.out.println();
            n++;
        }
    }
}
