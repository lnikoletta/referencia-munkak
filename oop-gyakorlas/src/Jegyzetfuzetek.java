public class Jegyzetfuzetek extends Termekek {
    private Integer pages;


    public Jegyzetfuzetek(Integer boxID, Integer pages,Integer price, Integer quantity, String prodDate) {
        super(price, prodDate, quantity, boxID);
        this.pages = pages;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Notebooks{" +
                "boxID: " + getBoxID() +
                ", pages: " + pages +
                ", price: " + getPrice() +
                ", quantity: " + getQuantity() +
                ", production date: " + getProdDate() +
                '}';
    }
}
