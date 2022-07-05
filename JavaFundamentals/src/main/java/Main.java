public class Main {
    public static void main(String[] args) {

        //String examples

        String a = "a";
        a.concat("b");
        System.out.println(a);

        String s1 = "a";
        String s2 = "a";
        System.out.println(s1==s2);

        String s3 = new String("a");
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }

}
