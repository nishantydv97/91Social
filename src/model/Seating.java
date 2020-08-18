package src.model;

public class Seating {
    private String seatCover;
    private String seatPost;

    public Seating() {

    }

    public Seating(String seatCover, String seatPost) {
        this.seatCover = seatCover;
        this.seatPost = seatPost;
    }

    public String getSeatCover() {
        return seatCover;
    }

    public void setSeatCover(String seatCover) {
        this.seatCover = seatCover;
    }

    @Override
    public String toString() {
        return "Seating{" +
                "seatCover='" + seatCover + '\'' +
                ", seatPost='" + seatPost + '\'' +
                '}';
    }

    public String getSeatPost() {
        return seatPost;
    }

    public void setSeatPost(String seatPost) {
        this.seatPost = seatPost;
    }

}
