package Model.studentSys;

class Sports extends Result {
    private int sportsPoints;

    public Sports(String name, int rollNo, int sub1Marks, int sub2Marks, int sub3Marks, int sportsPoints) {
        super(name, rollNo, sub1Marks, sub2Marks, sub3Marks);
        this.sportsPoints = sportsPoints;
    }

    public int getSportsPoints() {
        return sportsPoints;
    }
}
