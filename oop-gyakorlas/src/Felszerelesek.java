public abstract class Felszerelesek implements Box{

    private Integer securityLevel;
    private String prodDate;
    private Integer boxID, quantity;

    public Felszerelesek(Integer securityLevel, String prodDate, Integer quantity, Integer boxID) {
        this.securityLevel = securityLevel;
        this.prodDate = prodDate;
        this.quantity = quantity;
        this.boxID = boxID;
    }

    public Integer getSecurityLevel() {
        return securityLevel;
    }
    public void setSecurityLevel(Integer securityLevel) {
        this.securityLevel = securityLevel;
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