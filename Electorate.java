package EVotingApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Electorate {
    private List<Voter> voters = new ArrayList<>();
    private  int lastIdGenerated;
    private int apcVotes;
    private int lpVotes;
    private int pdpVotes;
    private int nnpcVotes;
    private int azVotes;
    private int fcVotes;
    private int invalidVotes;

    public int getApcVotes() {
        return apcVotes;
    }

    public void setApcVotes(int apcVotes) {
        this.apcVotes = apcVotes;
    }

    public int getLpVotes() {
        return lpVotes;
    }

    public void setLpVotes(int lpVotes) {
        this.lpVotes = lpVotes;
    }

    public int getPdpVotes() {
        return pdpVotes;
    }

    public void setPdpVotes(int pdpVotes) {
        this.pdpVotes = pdpVotes;
    }

    public int getNnpcVotes() {
        return nnpcVotes;
    }

    public void setNnpcVotes(int nnpcVotes) {
        this.nnpcVotes = nnpcVotes;
    }

    public int getAzVotes() {
        return azVotes;
    }

    public void setAzVotes(int azVotes) {
        this.azVotes = azVotes;
    }

    public int getFcVotes() {
        return fcVotes;
    }

    public void setFcVotes(int fcVotes) {
        this.fcVotes = fcVotes;
    }

    public int getInvalidVotes() {
        return invalidVotes;
    }

    public void setInvalidVotes(int invalidVotes) {
        this.invalidVotes = invalidVotes;
    }


    public void  register(Voter voter) {
        int id = generateIdNumber() ;
       voter.setId(id);
        voters.add(voter);
    }

    public  int generateIdNumber() {
        return ++lastIdGenerated;

    }

    public int checkNumberOfRegisteredVoters() {
        return voters.size();
    }

    public String searchByFullName(String fullName) {
        String message = "Not registered. Check the Name and search again ";
        for (Voter voter : voters){
            if(voter.getFullName().equals(fullName)){
                return fullName;
            }
        }
        return message;
    }

    public String searchById(int id) {
        for(Voter voter : voters){
            if(voter.getId()==id){
//                String message = "\n" + voter.getFullName() + " " + "is registered";
                System.out.println("\n" + voter.getFullName() + " " + "is registered");
            }
        }
        return id + " " + "is not registered";

    }

    public void getAllRegisteredVoters() {
        for (Voter voter : voters) {
            System.out.println(voter);
        }

    }

    public void castVote(Voter voter,int partyNumber) {
        if(!voters.contains(voter)){
            System.out.println(voter+" "+"is not registered to vote");
        }
       else
           switch (partyNumber){
            case 1:
                voter.setVotedParty(Party.LABOUR_PARTY);
                 lpVotes++;
                break;
            case 2:
                voter.setVotedParty(Party.APC);
                apcVotes++;
                break;
            case 3:
                voter.setVotedParty(Party.PDP);
                pdpVotes++;
                break;
            case 4:
                voter.setVotedParty(Party.NNPC);
                nnpcVotes++;
                break;
            case 5:
                voter.setVotedParty(Party.AZ);
                azVotes++;
                break;
            case 6:
                voter.setVotedParty(Party.FC);
                fcVotes++;
                break;
            default:
                invalidVotes++;
                break;
                }
        }
    }
