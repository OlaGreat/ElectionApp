package EVotingApp;

public enum Party {
    LABOUR_PARTY(1), APC(2),PDP(3), NNPC(4), AZ(5), FC(6);

    private final int partyNumber;

    Party(int partyNumber) {
        this.partyNumber = partyNumber;
    }

    public int getPartyNumber() {
        return partyNumber;
    }
}
