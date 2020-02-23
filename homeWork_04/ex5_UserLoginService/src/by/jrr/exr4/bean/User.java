package by.jrr.exr4.bean;

public class User {
    private String login;
    private String password;
    private boolean statusUser;
    private int attemptInput;

    public User(String login, String password,boolean statusUser) {
        this.login = login;
        this.password = password;
        this.statusUser=statusUser;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getStatusUser() {
        return statusUser;
    }

    public void setStatusUser(boolean statusUser) {
        this.statusUser = statusUser;
    }

    public int getAttemptInput() {
        return attemptInput;
    }

    public void setAttemptInput(int attemptInput) {
        this.attemptInput = attemptInput;
    }


}
