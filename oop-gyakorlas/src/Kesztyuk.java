public class Kesztyuk extends Felszerelesek{

    private Integer gSize;

    public Kesztyuk(Integer boxID, Integer gSize, Integer securityLevel, Integer quantity, String prodDate) {
        super(securityLevel, prodDate, quantity, boxID);
        this.gSize = gSize;
    }

    /*public Kesztyuk(Integer size,Integer SecurityLevel) {
        super(SecurityLevel);
        this.size = size;
    }*/

    public void setGSize(Integer gSize) {
        this.gSize = gSize;
    }

    public Integer getGSize() {
        return gSize;
    }

    @Override
    public String toString() {
        return "Gloves{" +
                "boxID: " + getBoxID() +
                ", size: " + gSize +
                ", security level: " + getSecurityLevel() +
                ", quantity: " + getQuantity() +
                ", production date: " + getProdDate() +
                '}';
    }
}
