package exe1;

public class Client {

    private String lastname,firstname;
    private int birthdate;

    public Client(String lastname,String firstname,int birthdate){
        this.lastname=lastname;
        this.firstname=firstname;
        this.birthdate=birthdate;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }
}
