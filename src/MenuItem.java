public class MenuItem {

    private String name;
    private double price;
    private String description;

    /**
     * 상세 메뉴 생성
     * @param name
     * @param price
     * @param description
     */
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    /**
     * getter
     * @return
     */
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    /**
     * setter
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
