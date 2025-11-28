public class ResultCalculator {

    private String name, roll;
    private int m1, m2, m3, m4, m5;

    public ResultCalculator(String name, String roll,
                            int m1, int m2, int m3, int m4, int m5) {
        this.name = name;
        this.roll = roll;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
    }

    public int getTotal() { return m1 + m2 + m3 + m4 + m5; }
    public double getPercentage() { return getTotal() / 5.0; }

    public String getGrade() {
        double p = getPercentage();
        if (p >= 90) return "A+";
        if (p >= 80) return "A";
        if (p >= 70) return "B+";
        if (p >= 60) return "B";
        if (p >= 50) return "C";
        if (p >= 40) return "D";
        return "Fail";
    }

    public String getFinalResult() {
        return "Name: " + name +
                "\nRoll: " + roll +
                "\nTotal: " + getTotal() +
                "\nPercentage: " + getPercentage() +
                "\nGrade: " + getGrade();
    }
}
