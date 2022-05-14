public class Creature {
    private String info;

    @Override
    public String toString() {
        return "Creature{" +
                "info='" + info + '\'' +
                '}';
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Creature(String info) {
        this.info = info;
    }

    public Creature() {
    }

    public void show(){
        System.out.println("这是个生物");
    }
}
