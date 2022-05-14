import java.util.Objects;

public class Goods implements Comparable{
    String name;
    double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return name.equals(goods.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price + '\n';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods){
//            if(this.price > ((Goods) o).price){
//                return 1;
//            } else if(this.price < ((Goods) o).price){
//                return -1;
//            }
//            return 0;
            return - Double.compare(this.price, ((Goods) o).price);
        } else {
            throw new RuntimeException("输入的类型不一致");
        }

    }
}
