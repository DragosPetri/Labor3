import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> myList = new ArrayList<>();
        myList.add(new Product("Chair", new ItemHistory(1, 8), new ItemHistory(1, 4)));
        myList.add(new Product("Table", new ItemHistory(1, 2), new ItemHistory(1, 4)));
        myList.add(new Product("Sofa", new ItemHistory(1, 2), new ItemHistory(1, 4)));
        myList.add(new Product("Hammer", new ItemHistory(1, 100), new ItemHistory(1, 100)));

        Storage myStorage = new Storage(myList);
        myStorage.sortAfterDemand();
        myStorage.categorize();
        myStorage.nextYearPlan();

    }
}