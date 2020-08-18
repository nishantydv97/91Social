package src.model;

public class ChainAssembly {
    private String cassette;
    private String chain;
    private String paddle;

    public ChainAssembly() {

    }

    public ChainAssembly(String cassette, String chain, String paddle) {
        this.cassette = cassette;
        this.chain = chain;
        this.paddle = paddle;
    }

    public String getCassette() {
        return cassette;
    }

    public void setCassette(String cassette) {
        this.cassette = cassette;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }


    public String getPaddle() {
        return paddle;
    }

    public void setPaddle(String paddle) {
        this.paddle = paddle;
    }

}
