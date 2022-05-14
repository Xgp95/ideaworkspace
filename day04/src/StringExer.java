/*
    获取一个字符串在另一个字符串中出现的次数。
    比如：获取“ ab”在 “abkkcadkabkebfkabkskab” 中出现的次数
 */

import org.junit.Test;

public class StringExer {
    public int getCount(String mainStr,String containsStr){
        int count = 0;
        int index = 0;
        if(containsStr.length() < mainStr.length()){
//            while ((index = mainStr.indexOf(containsStr)) != -1) {
            while (mainStr.contains(containsStr)){
                index = mainStr.indexOf(containsStr);
                mainStr = mainStr.substring(index + containsStr.length());
                count++;
            }
            return count;
        }else {
            return count;
        }


    }

    @Test
    public void test(){
        String str = "abkkcadkabkebfkabkskab";
        String str1 = "ab";

        System.out.println( getCount(str, str1));

    }

    @Test
    public void test1(){
        String str = "abkkcadkabkebfkabkskab";
        String str1 = "abc";
        System.out.println(str.contains(str1));
    }
}
