package africa.semicolon;

import jdk.swing.interop.SwingInterOpUtils;

import java.awt.font.FontRenderContext;
import java.util.Arrays;
import java.util.Scanner;

public class MyersBriggs {
    public static String questionOne(){
        return """
                A. expend energy, enjoy groups
                B. conserve energy, enjoy one-on-one
                """;
    }
    public static String questionTwo(){
        return """
                A. interpret literally
                B. look for meaning and possibilities
                """;
    }
    public static String questionThree(){
        return """
                A. logical, thinking, questioning
                B. empathetic, feeling, accommodating
                """;
    }
    public static String questionFour(){
        return """
                A. organized,orderly
                B. flexible, adaptable
                """;
    }
    public static String questionFive(){
        return """
                A. more outgoing, think out loud
                B. more reserved, think to yourself
                """;
    }
    public static String questionSix(){
        return """
                A. practical, realistic, experiential
                B. imaginative, innovative, theoretical
                """;
    }
    public static String questionSeven(){
        return """
                A. candid, straight forward, frank
                B. tactful, kind, encouraging
                """;
    }
    public static String questionEight(){
        return """
                A. plan, schedule
                B. unplanned, spontaneous
                """;
    }
    public static String questionNine(){
        return """
                A. seek many tasks, public activities, interaction with others
                B. seek private, solitary activities with quiet to concentrate
                """;
    }
    public static String questionTen(){
        return """
                A. standard, usual, conventional
                B. different, novel, unique
                """;
    }
    public static String questionEleven(){
        return """
                A. firm, tend to criticize,hold the line
                B. gentle, tend to appreciate,conciliate
                """;
    }
    public static String questionTwelve(){
        return """
                A. regulated, structured
                B. easygoing, "live" and "let live"
                """;
    }
    public static String questionThirteen(){
        return """
                A. external, communicative, express yourself
                B. internal, reticent, keep to yourself
                """;
    }
    public static String questionFourteen(){
        return """
                A. focus on here-and-now
                B. look to the future, global perspective, "big picture"
                """;
    }
    public static String questionFifteen(){
        return """
                A. tough-minded, just
                B. tender-hearted, merciful
                """;
    }
    public static String questionSixteen(){
        return """
                A. preparation, plan ahead
                B. go with the flow, adapt as you go
                """;
    }
    public static String questionSeventeen(){
        return """
                A. active, initiate
                B. reflective, deliberate
                """;
    }
    public static String questionEighteen(){
        return """
                A. facts, things, "what is"
                B. ideas, dreams,"what could be," philosophical
                """;
    }
    public static String questionNineteen(){
        return """
                A. matter of fact, issue-oriented
                B. sensitive,people-oriented, compassionate
                """;
    }
    public static String questionTwenty(){
        return """
                A. control,govern
                B. latitude, freedom
                """;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] questions;
        questions = new String[]{questionOne(), questionTwo(), questionThree(), questionFour(), questionFive(), questionSix(),
        questionSeven(), questionEight(), questionNine(), questionTen(), questionEleven(), questionTwelve(),
        questionThirteen(), questionFourteen(), questionFifteen(), questionSixteen(), questionSeventeen(),
        questionEighteen(), questionNineteen(),questionTwenty()};
        String[][] answers = new String[5][4];
        int row = 0;
        int column;
        int numberOfA = 0;
        int numberOfB = 0;
        for (int i = 0; i < questions.length; i++) {
            row = i / 4;
            column = i % 4;
            System.out.println(questions[i]);
            System.out.println("Enter your own choice: ");
            String answer = input.next();
            if (answer.equalsIgnoreCase("A")) {
               answers[row][column] = "A";

            } else if (answer.equalsIgnoreCase("B")) {
                answers[row][column] = "B";
            }
            if(column == 0 && answers[row][column].equalsIgnoreCase("A")) {
                numberOfA++;
            }else if(column == 1 && answers[row][column].equalsIgnoreCase("B")){
                numberOfB++;
            }
        }

        System.out.println(Arrays.deepToString(answers));
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < answers[i].length ; j++) {
                System.out.print(answers[i][j] + "\t");

            }
            System.out.println();

            }
        System.out.println(numberOfA + "\t" + numberOfB);

        if (numberOfA > numberOfB) {
            System.out.println("E");
        } else if (numberOfB > numberOfA && row == 1) {
            System.out.println("I");
        }
//        } else if (numberOfA > numberOfB) {
//            System.out.println("S");
//        } else if (numberOfB > numberOfA && row == 1) {
//            System.out.println("N");
//        }else if (numberOfA > numberOfB) {
//            System.out.println("T");
//        } else if (numberOfB > numberOfA && row == 1) {
//            System.out.println("F");
//        }else if (numberOfA > numberOfB) {
//            System.out.println("J");
//        } else if (numberOfB > numberOfA && row == 1) {
//            System.out.println("P");
//        }

        }


    }

