
public class Product {

    private String name;
    private ItemHistory lastYearHistory;
    private ItemHistory secondLastYearHistory;

    private String category;

    public Product(String name, ItemHistory lastYearHistory, ItemHistory secondLastYearHistory) {

        this.name = name;
        this.lastYearHistory = lastYearHistory;
        this.secondLastYearHistory = secondLastYearHistory;
        this.category = "";

    }

    public double getDemandLastYear() {
        return (double)lastYearHistory.getSold() / (double)lastYearHistory.getProduced();
    }

    public double getDemandSecondLastYear() {
        return (double)secondLastYearHistory.getSold() / (double)secondLastYearHistory.getProduced();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemHistory getLastYearHistory() {
        return lastYearHistory;
    }

    public void setLastYearHistory(ItemHistory lastYearHistory) {
        this.lastYearHistory = lastYearHistory;
    }

    public ItemHistory getSecondLastYearHistory() {
        return secondLastYearHistory;
    }

    public void setSecondLastYearHistory(ItemHistory secondLastYearHistory) {
        this.secondLastYearHistory = secondLastYearHistory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
