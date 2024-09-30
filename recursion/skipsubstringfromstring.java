public class skipsubstringfromstring {
    public static void main(String[] args) {
        // String s1 = skip("fhapplekappleapplekjapplejapplejnapplejnapple");
        // System.out.println(s1);

        System.out.println(skipappnotapple("kfapplekfapplekfapple"));
        System.out.println(skipappnotapple("kfapplkfappekfapp"));

    }

    // static String skip( String s2) {
    // if (s2.isEmpty()) {
    // System.out.println(s2);
    // return "";
    // }

    // if (s2.startsWith("apple")) {
    // return skip( s2.substring(5));

    // } else {
    // return s2.charAt(0) + skip(s2.substring(1));
    // }
    // }

    static String skipappnotapple(String s2) {
        if (s2.isEmpty()) {
            System.out.println(s2);
            return "";
        }

        if (s2.startsWith("app") && !s2.startsWith("apple")) {
            return skipappnotapple(s2.substring(3));

        } else {
            return s2.charAt(0) + skipappnotapple(s2.substring(1));
        }
    }
}
