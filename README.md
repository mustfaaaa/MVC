# MVC
ModelViewController

   <h1>Java MVC Project Summary</h1>

  <h2>1. <code>Student</code> Class</h2>
    <p>
        Represents a student with three attributes: <code>name</code>, <code>id</code>, and <code>grade</code>. 
        It includes getter methods and a <code>toString()</code> method for displaying full details.
    </p>
    <h2>2. <code>Model</code> Class</h2>
    <p>
        Acts as a data container for the <code>Student</code> object. 
        Provides methods to set and get the current student.
    </p>
    <h2>3. <code>SummaryModel</code> Class</h2>
    <p>
        Holds a reference to the <code>Student</code> and provides a summarized version of the student's information 
        (name and ID only) using the <code>getSummary()</code> method.
    </p>

  <h2>4. <code>View</code> Class</h2>
    <p>
    Handles output operations. It prints student details to the console using <code>printStudentDetails(String details)</code>.
    </p>

  <h2>5. <code>Controller</code> Class</h2>
    <p>
        Connects the Model, SummaryModel, and View. 
        - <code>updateStudent(Student student)</code>: Sets a new student in the model and refreshes the summary. <br>
        - <code>updateView()</code>: Displays full and summary details via the View.
    </p>
    <h2>6. <code>Main</code> Class</h2>
    <p>
        Entry point of the program. It:
        <ul>
            <li>Creates a <code>Student</code> instance and initializes the <code>Model</code>, <code>SummaryModel</code>, and <code>View</code>.</li>
            <li>Constructs the <code>Controller</code> and uses it to update the student and print the details.</li>
        </ul>
    </p>


