package src.model;

public class HandleBarSet {
    private String handleBar;
    private String breakLeaver;
    private String shifter;
    private String handGrip;


    public HandleBarSet() {

    }

    @Override
    public String toString() {
        return "HandleBarSet{" +
                "handleBar='" + handleBar + '\'' +
                ", breakLeaver='" + breakLeaver + '\'' +
                ", shifter='" + shifter + '\'' +
                ", handGrip='" + handGrip + '\'' +
                '}';
    }

    public HandleBarSet(String handleBar, String breakLeaver, String shifter, String handGrip) {
        this.handleBar = handleBar;
        this.breakLeaver = breakLeaver;
        this.shifter = shifter;
        this.handGrip = handGrip;
    }

    public String getHandleBar() {
        return handleBar;
    }

    public void setHandleBar(String handleBar) {
        this.handleBar = handleBar;
    }

    public String getBreakLeaver() {
        return breakLeaver;
    }

    public void setBreakLeaver(String breakLeaver) {
        this.breakLeaver = breakLeaver;
    }

    public String getShifter() {
        return shifter;
    }

    public void setShifter(String shifter) {
        this.shifter = shifter;
    }

    public String getHandGrip() {
        return handGrip;
    }

    public void setHandGrip(String handGrip) {
        this.handGrip = handGrip;
    }

}
