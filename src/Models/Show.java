package Models;

public class Show {
    private String user;
    private boolean showAllUsers;

    public String getUser() {
        return user;
    }

    public boolean isShowAllUsers() {
        return showAllUsers;
    }

    public void setShowAllUsers(boolean showAllUsers) {
        this.showAllUsers = showAllUsers;
    }

    public void setUser(String user) {
        this.showAllUsers = false;
        this.user = user;
    }

    public Show() {
        this.showAllUsers = true;
    }

}
