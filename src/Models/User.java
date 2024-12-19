package Models;

import java.util.HashMap;

public class User {
    private String userName;

    private Double totalbalance;
    private HashMap<String, User> owedUsers;

    public User(String userName) {
        this.userName = userName;
        setOwedUsers(new HashMap<String, User>());
        this.totalbalance = 0d;
    }

    public HashMap<String, User> getOwedUsers() {
        return owedUsers;
    }

    public void setOwedUsers(HashMap<String, User> owedUsers) {
        this.owedUsers = owedUsers;
    }

    public String getUserName() {
        return userName;
    }

    public Double getTotalbalance() {
        return totalbalance;
    }

    public void setTotalbalance(Double totalbalance) {
        this.totalbalance = totalbalance;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
