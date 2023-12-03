class demo {
    public static void main(String[] args) {
        int a = 96;
        int bites = a & 3; // this part is used to get the last two bites of the number
        int swapbites = ((bites<<2) ^ bites) | a &(~3); // this part deals with shifting the last two bits to the left and then changing the original bite and then adding the bite to the one
        System.out.println(swapbites);
    }
}
