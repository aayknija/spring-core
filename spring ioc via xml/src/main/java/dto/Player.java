package dto;

import lombok.Data;

@Data
public class Player {
    private String name;
    private String mobile;
    private String sport;

    public Player(String name, String mobile, String sport) {
        this.name = name;
        this.mobile = mobile;
        this.sport = sport;
    }
}
