package src.model;

public class SummaryModel {
    private Student student;

    public SummaryModel(Student student) {
        this.student = student;
    }

    public String getSummary() {
        return "Student Summary: " + student.getName() + " (ID: " + student.getId() + ")";
    }
}

