package PrototypeAndRegistry;

public class IntelligentStudent extends Student {

    private int score;

    public IntelligentStudent(String name, long rollNo, String batch, int score) {
        super(name, rollNo, batch);
        this.score = score;
    }

    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.score = intelligentStudent.score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }
}
