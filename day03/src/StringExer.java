import org.junit.Test;

public class StringExer {


    public String myTrim(String str) {
        if (str != null) {

            int start = 0;
            int end = str.length() - 1;
            while (start < end && str.charAt(start) == ' ') {
                start++;
            }
            while (end > start && str.charAt(end) == ' ') {
                end--;
            }
//            if(str.substring(start, end + 1).equals("")){
//                return "";
//            }
            return str.substring(start, end + 1);
        } else {
            return null;
        }
    }

    public String myReversel(String str, int start, int end) {
        if (str != null) {

            StringBuilder strb = new StringBuilder(str.length());
            strb.append(str.substring(0, start));
            for (int i = end; i >= start ; i--) {
                strb.append(str.charAt(i));
            }
            strb.append(str.substring(end + 1));
//            return new String(strb);
            return strb.toString();
        } else {
            return null;
        }

    }

    @Test
    public void test() {
        String str = "abcdefg";
        System.out.println(myReversel(str, 2, 4));
    }
}
