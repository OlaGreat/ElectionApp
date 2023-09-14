package EVotingApp;

public class Voter {
    private String FirstName;
    private String LastName;
    private String fullName;
    private String poolingUnit;
    private String State;
    private int Id;
    private String phoneNumber;
    private Party votedParty;


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

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
        this.Id = id;
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName() {
        String fullName = getFirstName()+ " " +getLastName();
        this.fullName = fullName;
    }
    public void setVotedParty(Party party) {
        this.votedParty = party;

    }

    public String toString(){
        return this.fullName;
    }
    public Voter register(VotersData votersData){
        Voter voter = new Voter();
        Electorate electorate = new Electorate();
        voter.setFirstName(votersData.getFirstName());
        voter.setLastName(votersData.getLastName());
        voter.setFullName();
        voter.setState(votersData.getState());
        voter.setPoolingUnit(votersData.getPoolingUnit());
        voter.setPhoneNumber(votersData.getPhoneNumber());
        electorate.register(voter);

        return voter;
    }


}
