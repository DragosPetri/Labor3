import java.util.List;

import static java.lang.Math.floor;

public class Storage {

    private final List<Product> storage;

    public Storage(List<Product> storage) {
        this.storage = storage;
    }

    public void categorize() {
        for (Product p : this.storage) {
            switch (Double.compare(p.getDemandLastYear(), p.getDemandSecondLastYear())) {
                case 0 -> {
                    System.out.println(p.getName() + " is stagnant.");
                    p.setCategory("b");
                }
                case -1 -> {
                    System.out.println(p.getName() + " demand is falling");
                    p.setCategory("c");
                }
                case 1 -> {
                    System.out.println(p.getName() + " demand is rising");
                    p.setCategory("a");
                }
                default -> {
                }
            }
        }
    }

    public void nextYearPlan() {
        for (Product p : this.storage) {
            switch (p.getCategory()){
                case "a" -> System.out.println(p.getName() + " produce next year " + floor((p.getLastYearHistory().getProduced() * 1.5)));
                case "b" -> System.out.println(p.getName() + " produce next year " + floor((p.getLastYearHistory().getProduced() * 1.1)));
                case "c" -> System.out.println(p.getName() + " produce next year " + floor((p.getLastYearHistory().getProduced() * 0.9)));
                default -> {}
            }
        }
    }

    public void sortAfterDemand() {
        List<Product> aux = this.storage;
        aux.sort(
                (lhs, rhs) -> Double.compare(
                        ((lhs.getDemandLastYear() + lhs.getDemandSecondLastYear()) / 2),
                        ((rhs.getDemandLastYear() + rhs.getDemandSecondLastYear()) / 2)
                )
        );
        for (Product p : aux) {
            System.out.println(p.getName());
        }
    }
}
