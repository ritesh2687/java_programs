public class skipcharfromstring {
    public static void main(String[] args) {
        skip("", "fhakaakjajajnajna");
    }

    static void skip(String s1, String s2) {
        if (s2.isEmpty()) {
            System.out.println(s1);
            return;
        }
        char ch = s2.charAt(0);
        if (ch == 'a') {
            skip(s1, s2.substring(1));

        } else {
            skip(s1 + ch, s2.substring(1));
        }
    }
}
