package src.model;

public class Main {
    public static void main(String[] args) {
        // Create components
        Student student = new Student("Alice", 101, 88.5);
        Model model = new Model();
        SummaryModel summaryModel = new SummaryModel(student);
        View view = new View();
        Controller controller = new Controller(model, summaryModel, view);

        // Use controller
        controller.updateStudent(student);
        controller.updateView();
    }
}
