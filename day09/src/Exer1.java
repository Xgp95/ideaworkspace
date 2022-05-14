import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Exer1 {
    public void charCount(String file, String charCount) {
        BufferedReader bfr = null;
        BufferedWriter bfw = null;
        try {
            bfr = new BufferedReader(new FileReader(file));
            bfw = new BufferedWriter(new FileWriter(charCount));


            Map<Character, Integer> map = new HashMap<>();
            char[] cbf = new char[1024];
            int len;
            while ((len = bfr.read(cbf)) != -1) {
                for (int i = 0; i < len; i++) {
                    if (!map.containsKey(cbf[i])) {
                        Integer count = 1;
                        map.put(cbf[i], count);
                    } else {
                        Integer count = map.get(cbf[i]) + 1;
                        map.put(cbf[i], count);
                    }
                }
            }

            Set<Character> chars = map.keySet();
            Iterator<Character> iterator = chars.iterator();
            while (iterator.hasNext()) {
                char next = iterator.next();
                switch (next) {
                    case '\t':
                        bfw.write("制表符有" + map.get(next) + "个" + "\t\t");
                        break;
                    case '\n':
                        bfw.write("换行有" + map.get(next) + "个" + "\t\t");
                        break;
                    case ' ':
                        bfw.write("空格有" + map.get(next) + "个" + "\t\t");
                        break;
                    default:
                        bfw.write(next + " 有 " + map.get(next) + "个" + "\t\t");
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bfw != null) {
                try {
                    bfw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bfr != null) {
                try {
                    bfr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }
    }

    @Test
    public void test() {
        charCount("D:\\code\\爪哇资料\\课件笔记源码资料\\1_课件\\第2部分：Java高级编程\\尚硅谷_宋红康_第13章_IO流\\dbcp.txt",
                "D:\\code\\爪哇资料\\课件笔记源码资料\\1_课件\\第2部分：Java高级编程\\尚硅谷_宋红康_第13章_IO流\\charcount.txt");
    }
}
