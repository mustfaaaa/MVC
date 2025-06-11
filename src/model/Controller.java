package src.model;

public class Controller {
    private Model model;
    private SummaryModel summaryModel;
    private View view;

    public Controller(Model model, SummaryModel summaryModel, View view) {
        this.model = model;
        this.summaryModel = summaryModel;
        this.view = view;
    }

    public void updateStudent(Student student) {
        model.setStudent(student);
        summaryModel = new SummaryModel(student); // Refresh summary
    }

    public void updateView() {
        view.printStudentDetails(model.getStudent().toString());
        view.printStudentDetails(summaryModel.getSummary());
    }
}
