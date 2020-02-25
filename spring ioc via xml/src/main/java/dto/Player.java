package dto;

public class Player {
    private String name;
    private String mobile;
    private String sport;

    public Player(String name, String mobile, String sport) {
        this.name = name;
        this.mobile = mobile;
        this.sport = sport;
    }

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
}
