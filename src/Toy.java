public class Toy {
    private int id;
    private String name;
    private int quantity;
    private double drop_frequency;

    public Toy(int id, String name, int quantity, double drop_frequency) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.drop_frequency = drop_frequency;
    }
    @Override
    public String toString() {
        return String.format("id: %d, наименование: %s, количество: %d", id, name, quantity);
    }
    public int getQuantity() {
        return quantity;
    }
}
