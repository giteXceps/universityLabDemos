public class App {
    public static void main(String[] args) throws Exception {

        int grades[] = {87,68,94,100,83,78,85,91,76,87};
        GradeBook gradeBook = new GradeBook(grades, "Sefa's GradeBook");

        GradeBookManager gradeBookManager = new GradeBookManager();
        gradeBookManager.displayMessage(gradeBook);
        gradeBookManager.Grades(gradeBook);
        gradeBookManager.getAvarage(gradeBook);
        gradeBookManager.getMin(gradeBook);
        gradeBookManager.getMax(gradeBook);
        gradeBookManager.outputBarChart(gradeBook);
    }
}
