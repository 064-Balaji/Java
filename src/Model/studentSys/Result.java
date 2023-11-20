package Model.studentSys;

class Result extends Student {
    private int sub1Marks;
    private int sub2Marks;
    private int sub3Marks;

    public Result(String name, int rollNo, int sub1Marks, int sub2Marks, int sub3Marks) {
        super(name, rollNo);
        this.sub1Marks = sub1Marks;
        this.sub2Marks = sub2Marks;
        this.sub3Marks = sub3Marks;
    }

    public int getTotalMarks() {
        return sub1Marks + sub2Marks + sub3Marks;
    }

    public String getResult() {
        return (getTotalMarks() >= 150) ? "Pass" : "Fail";
    }
}

