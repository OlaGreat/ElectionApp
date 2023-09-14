package EVotingApp;

public class VotersData {
    private String FirstName;
    private String LastName;
    private String poolingUnit;
    private String State;
    private int Id;
    private String phoneNumber;


    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPoolingUnit() {
        return poolingUnit;
    }

    public void setPoolingUnit(String poolingUnit) {
        this.poolingUnit = poolingUnit;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {

        Id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



}
