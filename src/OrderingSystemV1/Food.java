package OrderingSystemV1;

public class Food {
    private int foodID;
    private String description;
    private double unitPrice;

    public Food(int foodID, String description, double unitPrice) {
        this.foodID = foodID;
        this.description = description;
        this.unitPrice = unitPrice;
    }

    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.foodID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Food other = (Food) obj;
        return this.foodID == other.foodID;
    }

    @Override
    public String toString() {
        return "Food{" + "foodID=" + foodID + ", description=" + description + ", unitPrice=" + unitPrice + '}';
    }
    
}
