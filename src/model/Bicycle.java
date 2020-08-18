package src.model;

public class Bicycle {
    private String bicycleName;

    public String getBicycleName() {
        return bicycleName;
    }

    public void setBicycleName(String bicycleName) {
        this.bicycleName = bicycleName;
    }

    private ChainAssembly chainAssembly = new ChainAssembly();
    private  Frame frame = new Frame();
    private HandleBarSet handleBarSet = new HandleBarSet();
    private Seating seating = new Seating();
    private Wheel wheel = new Wheel();

    public ChainAssembly getChainAssembly() {
        return chainAssembly;
    }

    public void setChainAssembly(ChainAssembly chainAssembly) {
        this.chainAssembly = chainAssembly;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public HandleBarSet getHandleBarSet() {
        return handleBarSet;
    }

    public void setHandleBarSet(HandleBarSet handleBarSet) {
        this.handleBarSet = handleBarSet;
    }

    public Seating getSeating() {
        return seating;
    }

    public void setSeating(Seating seating) {
        this.seating = seating;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
