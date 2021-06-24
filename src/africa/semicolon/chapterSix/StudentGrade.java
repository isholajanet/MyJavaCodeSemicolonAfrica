package africa.semicolon.chapterSix;

public class StudentGrade {

    public static int getStudentGrade(int score) {
        int studentGrade;
        if((score >= 90) && (score <= 100)){
            studentGrade = 4;
        }else
            if((score >= 80) && (score <= 89)){
                studentGrade = 3;
            }
            else
                if((score >= 70) && (score <= 79)){
                    studentGrade = 2;
                }
                else
                    if((score >= 60) && (score <= 69)){
                        studentGrade = 1;
                    }
                    else {
                        studentGrade = 0;
                    }

        return studentGrade;
    }
}
