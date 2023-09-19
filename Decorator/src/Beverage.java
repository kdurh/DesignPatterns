public abstract class Beverage {
    static final String TALL = "tall";
    static final String GRANDE = "grande";
    static final String VENTI = "venti";
    String description = "제목 없음";
    private String size = "";

    public void setSize(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
