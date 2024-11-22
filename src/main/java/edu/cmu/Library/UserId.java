package edu.cmu.Library;

public class UserId {
    private String name;
    private String id;

    public UserId(String userId) {
        String[] parts = userId.split(":");
        this.id = parts[0];
        this.name = parts[1];
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
