public abstract class Termekek implements Box{

    private Integer price;
    private String prodDate;
    private Integer boxID, quantity;

    public Termekek(Integer price, String prodDate, Integer quantity, Integer boxID) {
        this.price = price;
        this.prodDate = prodDate;
        this.quantity = quantity;
        this.boxID = boxID;
    }

    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String getProdDate() {
        return prodDate;
    }

    @Override
    public Integer getBoxID() {
        return boxID;
    }

    @Override
    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
