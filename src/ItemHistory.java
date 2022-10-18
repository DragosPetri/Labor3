public class ItemHistory {
    private int sold;
    private int produced;

    public ItemHistory(){
        this.sold = 0;
        this.produced = 0;
    }

    public ItemHistory(int key, int value) {
        this.sold = key;
        this.produced = value;
    }

    public int getSold() {
        return this.sold;
    }

    public void setSold(int n) {
        this.sold = n;
    }

    public int getProduced(){
        return this.produced;
    }

    public void setProduced(int n) {
        this.produced = n;
    }

}
