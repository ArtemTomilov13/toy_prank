import java.util.ArrayList;
import java.util.List;

public class Shop {
    protected List<Toy> locallist= new ArrayList<>();

    public List<Toy> getLocallist() {
        return locallist;
    }
    public Shop addToy(Toy inputToy) {
            locallist.add(inputToy);
            return this;
    }
    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder();
        for (Toy toy: locallist) {
            localString.append(toy.toString());
            localString.append("\n");
        }
        return localString.toString();
    }
}

