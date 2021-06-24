package africa.semicolon.BankApplication;

public class Staff {
    private String name;
    private int passWord;
    public Staff(String name, int passWord) {
        this.name = name;
        this.passWord = passWord;
    }

    public boolean confirmDetails(String name, int passWord) {
        if((this.name.equals(name)) && (this.passWord == passWord)){
            return true;
        }else{
            return false;
        }
    }
}
