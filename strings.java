class strings {
    public static void main(String[] args) {
        String s1 = "akshat";
        System.out.println("length of s1 : " + s1.length() );

        String s2 = " rastogi";
        String s3 = s1 + s2;

        String s = "akshat rastogi";

        System.out.println(s3);
        System.out.println(s3.length());

        String s4 = s1.concat(s2);  //same as s1 + s2;
        System.out.println(s4);

        System.out.println(s1.charAt(2));

        char ch[] = s3.toCharArray();
        System.out.println(ch);

        System.out.println(s.equals(s3));

        System.out.println(s1.startsWith("ak"));
        System.out.println(s1.endsWith("t"));

        System.out.println(s.indexOf("at"));
        System.out.println(s.lastIndexOf("a"));
        System.out.println(s.indexOf("a"));

        System.out.println(s.substring(7,12));
    }
    
}
