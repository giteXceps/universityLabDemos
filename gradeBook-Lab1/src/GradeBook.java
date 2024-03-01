public class GradeBook {

    private int[] grades = new int[10]; 
    private String courseName;

    public GradeBook(int[] grades, String courseName) {
        this.grades = grades;
        this.courseName = courseName;
    }

    public int[] getGrades() {
        return grades;
    }

    public String getCourseName() {
        return courseName;
    }
}
