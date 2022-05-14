import org.junit.Test;

import java.util.Arrays;

public class ForEachTest {
    @Test
    public void test(){
        int[] arr = new int[]{1,68,22,31,15};
        Arrays.sort(arr);
        for (int i : arr ) {
            System.out.print("**" + i);
        }

        for (int i : arr) {

        }
    }
}
