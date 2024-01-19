package OOPs_13th_Jan_2024.Encapsulation;

public class Lab148 {

    public static void main(String[] args) {

        Vwologinfixed vwologinfixed=new Vwologinfixed("admin","admin");
        boolean chcek =vwologinfixed.isLoginidin("admin","admin");
        String u =vwologinfixed.getUsername();
        //String p=vwologinfixed.getpassord();--not possible
        System.out.println(u);
       // vwologinfixed.password="j"--Not possbile
        System.out.println(u);
    }


    }
    class Vwologinfixed{

        public void setUsername(String username) {
            this.username = username;
        }

        public String getUsername() {
            return username;
        }

        private String username;
    private String password;

        public Vwologinfixed(String u, String p) {
            this.username = u;
            this.password = p;
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
