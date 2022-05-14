/*
获取两个字符串中最大相同子串。比如：
str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"
提示：将短的那个串进行长度依次递减的子串与较长的串比较。
 */

import org.junit.Test;

public class Stringexer1 {

    public String getMaxSameString(String str, String str1) {
        if (str != null && str1 != null) {
            String maxString = (str.length() >= str1.length()) ? str : str1;
            String minString = (str.length() > str1.length()) ? str1 : str;

            for (int i = 0; i < minString.length(); i++) {
                for (int x = 0, y = minString.length() - i; x <= i; x++, y++) {
//                    System.out.println(x);
//                    System.out.println(y);
                    if (maxString.contains(minString.substring(x, y))) {
                        return minString.substring(x, y);
                    }
                }
            }
        }
        return null;
    }

    @Test
    public void test() {
        String str = "abcwerthelloyuiodef";
        String str1 = "cvhellobnmnn";

        System.out.println(getMaxSameString(str, str1));
    }
}
