/*
对字符串中字符进行自然顺序排序。"abcwerthelloyuiodef"
提示：
1）字符串变成字符数组。
2）对数组排序，选择，冒泡，Arrays.sort(str.toCharArray());
3）将排序后的数组变成字符串。

 */


import org.junit.Test;

import java.util.Arrays;

public class Stringexer2 {
    public String stringSort(String str){
        if(str != null){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }
        return null;
    }

    @Test
    public void test3(){
        String str = "abcwerthelloyuiodef";
        System.out.println(stringSort(str));
    }
}
