package OOPs_13th_Jan_2024.Encapsulation;

public class Badexample {
    public static void main(String[] args) {

        VWOLogin vwoLogin =new VWOLogin("admin","admin");
        //admin admin---HIDDEN
        vwoLogin.setUsername("Nanda");
        //vwoLogin.getpassword();not possible
        System.out.println(vwoLogin.getPassword());
       // boolean check =vwoLogin.isLoginidin("admin","password");--wrong because password is wrong
     //  vwoLogin.password="password";password is privte its secured --we cam use getter settre method
        boolean check2=vwoLogin.isLoginidin("admin","password");// true
        System.out.println(check2);

        //password cannt be share it should be secured so make the privite to not to change pr hack

    }

}

class VWOLogin{
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private   String username;

    public String getPassword() {
        return password;
    }

    private String password;
    public VWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    boolean isLoginidin(String username, String password){
        if(this.username.toLowerCase().equals(username)&& this.password.toLowerCase().equals(password))
        {
            System.out.println("Logged IN!");
            return true;
        }
        else {
            System.out.println("wrong");
            return false;
        }
    }

}