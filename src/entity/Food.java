package entity;

public class Food {

    private String foodId;
    private String foodName;
    private String description;
    private int price;
    private String createAt;
    @Override
    public String toString() {
//        System.out.println("%15s", "ma mon an");
        return "Food{" +
                "foodId='" + foodId + '\'' +
                ", foodName='" + foodName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", createAt='" + createAt + '\'' +
                '}';
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }


    public Food() {
    }



    public Food(String foodId, String foodName, String description, int price, String createAt) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.description = description;
        this.price = price;
        this.createAt = createAt;

    }


}
