package src.model;

public class Frame {
    private String rearShock;
    private String suspensionShock;
    private String bodyFrame;

    public Frame() {

    }

    @Override
    public String toString() {
        return "Frame{" +
                "rearShock='" + rearShock + '\'' +
                ", suspensionShock='" + suspensionShock + '\'' +
                ", bodyFrame='" + bodyFrame + '\'' +
                '}';
    }

    public Frame(String rearShock, String suspensionShock, String bodyFrame) {
        this.rearShock = rearShock;
        this.suspensionShock = suspensionShock;
        this.bodyFrame = bodyFrame;
    }

    public String getRearShock() {
        return rearShock;
    }

    public void setRearShock(String rearShock) {
        this.rearShock = rearShock;
    }

    public String getSuspensionShock() {
        return suspensionShock;
    }

    public void setSuspensionShock(String suspensionShock) {
        this.suspensionShock = suspensionShock;
    }

    public String getBodyFrame() {
        return bodyFrame;
    }

    public void setBodyFrame(String bodyFrame) {
        this.bodyFrame = bodyFrame;
    }
}
