public class Maszkok extends Felszerelesek{
    private String attachment;

    public Maszkok(Integer boxID, String attachment, Integer securityLevel, Integer quantity, String prodDate) {
        super(securityLevel, prodDate, quantity, boxID);
        this.attachment = attachment;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    @Override
    public String toString() {
        return "Masks{" +
                "boxID: " + getBoxID() +
                ", attachment: " + attachment +
                ", security level: " + getSecurityLevel() +
                ", quantity: " + getQuantity() +
                ", production date: " + getProdDate() +
                '}';
    }
}
