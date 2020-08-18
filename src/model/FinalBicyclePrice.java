package src.model;

public class FinalBicyclePrice {
    private String bicycleName="";

    public String getBicycleName() {
        return bicycleName;
    }

    public void setBicycleName(String bicycleName) {
        this.bicycleName = bicycleName;
    }

    private Integer wheelComponentPricePrice=0;
    private Integer frameComponentPrice=0;
    private Integer handleBarSetComponentPrice=0;
    private Integer seatComponentPrice=0;
    private Integer chainComponentPrice=0;
    private Integer finalTotalPrice=0;

    public Integer getFinalTotalPrice() {
        return finalTotalPrice;
    }

    public void setFinalTotalPrice(Integer finalTotalPrice) {
        this.finalTotalPrice = finalTotalPrice;
    }

    @Override
    public String toString() {
        return "FinalBicyclePrice{" +
                "bicycleName='" + bicycleName + '\'' +
                ", wheelComponentPricePrice=" + wheelComponentPricePrice +
                ", frameComponentPrice=" + frameComponentPrice +
                ", handleBarSetComponentPrice=" + handleBarSetComponentPrice +
                ", seatComponentPrice=" + seatComponentPrice +
                ", chainComponentPrice=" + chainComponentPrice +
                ", finalTotalPrice=" + finalTotalPrice +
                '}';
    }

    public Integer getWheelComponentPricePrice() {
        return wheelComponentPricePrice;
    }

    public void setWheelComponentPricePrice(Integer wheelComponentPricePrice) {
        this.wheelComponentPricePrice = wheelComponentPricePrice;
    }

    public Integer getFrameComponentPrice() {
        return frameComponentPrice;
    }

    public void setFrameComponentPrice(Integer frameComponentPrice) {
        this.frameComponentPrice = frameComponentPrice;
    }

    public Integer getHandleBarSetComponentPrice() {
        return handleBarSetComponentPrice;
    }

    public void setHandleBarSetComponentPrice(Integer handleBarSetComponentPrice) {
        this.handleBarSetComponentPrice = handleBarSetComponentPrice;
    }

    public Integer getSeatComponentPrice() {
        return seatComponentPrice;
    }

    public void setSeatComponentPrice(Integer seatComponentPrice) {
        this.seatComponentPrice = seatComponentPrice;
    }

    public Integer getChainComponentPrice() {
        return chainComponentPrice;
    }

    public void setChainComponentPrice(Integer chainComponentPrice) {
        this.chainComponentPrice = chainComponentPrice;
    }
}
