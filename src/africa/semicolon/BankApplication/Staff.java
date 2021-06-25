package africa.semicolon.BankApplication;

public class Staff {
    private String name;
    private int passWord;
    public Staff(String name, int passWord) {
        this.name = name;
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassWord() {
        return passWord;
    }

    public void setPassWord(int passWord) {
        this.passWord = passWord;
    }
}
