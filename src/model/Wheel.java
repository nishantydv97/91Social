package src.model;

public class Wheel {
    private String spock;
    private String rim;
    private String tube;
    private String tyre;

    public Wheel() {

    }

    public Wheel(String spock, String rim, String tube, String tyre) {
        this.spock = spock;
        this.rim = rim;
        this.tube = tube;
        this.tyre = tyre;
    }

    public String getSpock() {
        return spock;
    }

    public void setSpock(String spock) {
        this.spock = spock;
    }

    public String getRim() {
        return rim;
    }

    public void setRim(String rim) {
        this.rim = rim;
    }

    public String getTube() {
        return tube;
    }

    public void setTube(String tube) {
        this.tube = tube;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "spock='" + spock + '\'' +
                ", rim='" + rim + '\'' +
                ", tube='" + tube + '\'' +
                ", tyre='" + tyre + '\'' +
                '}';
    }

    public String getTyre() {
        return tyre;
    }

    public void setTyre(String tyre) {
        this.tyre = tyre;
    }

}
