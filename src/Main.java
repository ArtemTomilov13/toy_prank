
public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addToy(new Toy(1, "cat", 2,20.4));
        shop.addToy(new Toy(2, "dog", 3,15.3));
        System.out.println(shop);
        System.out.println();
    }
}