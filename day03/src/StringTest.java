import org.junit.Test;

public class StringTest {
    String str = new String("good");
    char[] ch = {'t', 'e', 's', 't'};
    int i = 66;

    public void change(String str, char ch[], int i) {
        this.str = "test ok";
//        this.str = new String("test ok");
        System.out.println(str);
        this.i += 10;
        System.out.println(i);
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch, ex.i);
        System.out.print(ex.str + " and ");//
        System.out.println(ex.ch);
        System.out.println(ex.i);
    }

    @Test
    public void test() {
        String str1 = "123";
        int num = Integer.parseInt(str1);
        String str2 = String.valueOf(num);
        String str3 = num + "";
        String str4 = str3.intern();
        str3 = str3.intern();
        System.out.println(str1 == str3);

    }

    @Test
    public void test1() {
        String str1 = "123abc";
        char[] ch = str1.toCharArray();
        System.out.println(ch);

        char[] ch1 = new char[]{'h', 'e', 'l', 'l', 'o'};
        String str2 = new String(ch1);
        System.out.println(str2);
        str2.trim();
    }

    @Test
    public void test2() {
        String str = new String();
        StringBuffer buffer = new StringBuffer();
        StringBuilder builder = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int j = 0; j < 200; j++) {
            str += (j + "*");
        }
        System.out.println(str);
        long endTime = System.currentTimeMillis();
        System.out.println("String的运行时间是" + (endTime - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 200; i++) {
            buffer.append(i + "*");
        }
        System.out.println(buffer);
        endTime = System.currentTimeMillis();
        System.out.println("Buffer的运行时间是" + (endTime - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 200; i++) {
            builder.append(i + "*");
        }
        System.out.println(builder);
        endTime = System.currentTimeMillis();
        System.out.println("Buidler的运行时间是" + (endTime - startTime));
    }

}