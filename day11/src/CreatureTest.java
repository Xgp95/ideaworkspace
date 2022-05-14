import java.util.Random;

public class CreatureTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int num = new Random().nextInt(3);
            Creature instance = getInstance(num);
            System.out.println(instance.toString());
            instance.show();
            System.out.println("***************");
        }
    }

    public static Creature getInstance(int num) {
        switch (num) {
            case 0:
                return new Dog("旺财", 3);

            case 1:
                return new Person("张三", 18);

            default:
                return new Creature("生物");

        }

    }
}
