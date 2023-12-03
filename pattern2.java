public class pattern2 {
    public static void main(String[] args) {
        int a = 5;
        for(int i = 1; i<=a ;i++){
            for(int j= i; j<a; j++){
                char sn = 'A';
                System.out.print(sn);
                sn++;
            }
            System.out.println();
        }
    }
}
