public class GradeBookManager {
    public void displayMessage(GradeBook gradeBook) {
        System.out.println("Welcome to the grade book for: " + gradeBook.getCourseName());
    }

    public void Grades(GradeBook gradeBook){
        int i = 1;
        for(int grade:gradeBook.getGrades()){
            System.out.println("Student " + i + ": " + grade);
            i++;
        }
    }

    public void getAvarage(GradeBook gradeBook) {
        int grades[] = gradeBook.getGrades();
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        System.out.println("Class avarage " + sum / 10);
    }

    public void getMin(GradeBook gradeBook) {
        int grades[] = gradeBook.getGrades();
        int min = grades[0];

        for (int grade : grades) {
            if (min > grade) {
                min = grade;
            }
        }
        System.out.println("Minimum grade is " + min);
    }

    public void getMax(GradeBook gradeBook) {
        int grades[] = gradeBook.getGrades();
        int max = grades[0];

        for (int grade : grades) {
            if (max < grade) {
                max = grade;
            }
        }
        System.out.println("Maximum grade is " + max);
    }

    public void outputBarChart(GradeBook gradeBook){
        int[] frequency = new int[11];

        for (int grade : gradeBook.getGrades()){
            ++frequency[grade/10];
        }
        
        for (int count = 0; count < 11; count++) {
            if (count == 10)
            System.out.printf("  %d: ", 100);

            else
            System.out.printf("%d-%d: ", count * 10, count * 10 + 9);
            
        for (int stars = 0; stars < frequency[count]; stars++)
            System.out.print("*");
        System.out.println();
        }
    }
}
