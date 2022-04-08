public class Ceruzak extends Termekek{
    private String color;


    public Ceruzak(Integer boxID, String color, Integer price, Integer quantity, String prodDate) {
        super(price, prodDate, quantity, boxID);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pencils{" +
                "boxID: " + getBoxID() +
                ", color: " + color +
                ", price: " + getPrice() +
                ", quantity: " + getQuantity() +
                ", production date: " + getProdDate() +
                '}';
    }
}