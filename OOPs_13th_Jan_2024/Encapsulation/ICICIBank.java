package OOPs_13th_Jan_2024.Encapsulation;

public class ICICIBank {
  public  String getname(){
      return name;
  }

    public ICICIBank(String name, long bal) {
        this.name = name;
        Bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setBal(long bal) {
      if(Bal>0){
          this.Bal = bal;
      }
      else {
          System.out.println("Not allowed!");
      }

    }

    public long getBal() {
        return Bal;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
  long Bal;

    }



