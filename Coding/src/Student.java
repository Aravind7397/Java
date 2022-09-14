public class Student {

    String studentName;
    int StudentMarks;

    public Student(String studentName, int studentMarks) {
        this.studentName = studentName;
        StudentMarks = studentMarks;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentMarks() {
        return StudentMarks;
    }

    public void setStudentMarks(int studentMarks) {
        StudentMarks = studentMarks;
    }

    public char rank(int studentMarks){
        if(studentMarks >=80) {
            return 'A';
        }
        else if(studentMarks >= 60 && studentMarks < 80){
            return 'B';
        }
        else if(studentMarks >= 40 && studentMarks < 60){
            return 'C';
        }
        else{
            return 'F';
        }
    }
}