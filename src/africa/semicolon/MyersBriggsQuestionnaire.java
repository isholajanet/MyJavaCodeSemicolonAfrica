package africa.semicolon;

import java.util.Arrays;
import java.util.Scanner;

import static africa.semicolon.chapterSix.Multiple.checkIfItIsAMultiple;

public class MyersBriggsQuestionnaire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] questions = {
                """
                """,
                """
                A. expend energy, enjoy groups
                B. conserve energy, enjoy one-on-one
                """,
                """
                A. interpret literally
                B. look for meaning and possibilities
                """,
                """
                A. logical, thinking, questioning
                B. empathetic, feeling, accommodating
                """,
                """
                A. organized,orderly
                B. flexible, adaptable
                """,
                """
                A. more outgoing, think out loud
                B. more reserved, think to yourself
                """,
                """
                A. practical, realistic, experiential
                B. imaginative, innovative, theoretical
                """,
                """
                A. candid, straight forward, frank
                B. tactful, kind, encouraging
                """,
                """
                A. plan, schedule
                B. unplanned, spontaneous
                """,
                """
                A. seek many tasks, public activities, interaction with others
                B. seek private, solitary activities with quiet to concentrate
                """,
                """
                A. standard, usual, conventional
                B. different, novel, unique
                """,
                """
                A. firm, tend to criticize,hold the line
                B. gentle, tend to appreciate,conciliate
                """,
                """
                A. regulated, structured
                B. easygoing, "live" and "let live"
                """,
                """
                A. external, communicative, express yourself
                B. internal, reticent, keep to yourself
                """,
                """
                A. focus on here-and-now
                B. look to the future, global perspective, "big picture"
                """,
                """
                A. tough-minded, just
                B. tender-hearted, merciful
                """,
                """
                A. preparation, plan ahead
                B. go with the flow, adapt as you go
                """,
                """
                A. active, initiate
                B. reflective, deliberate
                """,
                """
                A. facts, things, "what is"
                B. ideas, dreams,"what could be," philosophical
                """,
                """
                A. matter of fact, issue-oriented
                B. sensitive,people-oriented, compassionate
                """,
                """
                A. control,govern
                B. latitude, freedom
                """};
        String[] answers = new String[questions.length];
        String answer = "";
        int numbersOfA = 0;
        int numbersOfB = 0;
        int numbersOf2A = 0;
        int numbersOf2B = 0;
        int numbersOf3A = 0;
        int numbersOf3B = 0;
        int numbersOf4A = 0;
        int numbersOf4B = 0;
        for (int i = 1; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("Enter your choice: ");
            answer = input.next();
            if (answer.equalsIgnoreCase("A")) {
                answers[i] = "A";
            } else if (answer.equalsIgnoreCase("B")) {
                answers[i] = "B";
            }
        }
        System.out.println(Arrays.toString(answers));
        for (int i = 1; i < questions.length; i++) {
            System.out.print(answers[i] + "\t\t\t\t");
            if (checkIfItIsAMultiple(4, i)) {
                System.out.println();
            }
        }
        for (int i = 1; i < questions.length; i += 4) {
            if (answers[i].equalsIgnoreCase("A")) {
                numbersOfA++;
            } else if (answers[i].equalsIgnoreCase("B")) {
                numbersOfB++;
            }
        }
        for (int i = 2; i < questions.length; i += 4) {
            if (answers[i].equalsIgnoreCase("A")) {
                numbersOf2A++;
            } else if (answers[i].equalsIgnoreCase("B")) {
                numbersOf2B++;
            }
        }
        for (int i = 3; i < questions.length; i += 4) {
            if (answers[i].equalsIgnoreCase("A")) {
                numbersOf3A++;
            } else if (answers[i].equalsIgnoreCase("B")) {
                numbersOf3B++;
            }
        }
        for (int i = 4; i < questions.length; i += 4) {
            if (answers[i].equalsIgnoreCase("A")) {
                numbersOf4A++;
            } else if (answers[i].equalsIgnoreCase("B")) {
                numbersOf4B++;
            }
        }
        System.out.println("*********************************************");
        System.out.print(numbersOfA + "A " + numbersOfB + "B\t\t\t" + numbersOf2A + "A " + numbersOf2B + "B\t\t\t" + numbersOf3A + "A " + numbersOf3B + "B\t\t\t" + numbersOf4A + "A " + numbersOf4B + "B");
        System.out.println();
        System.out.println("*********************************************");
        if (numbersOfA > numbersOfB) {
            System.out.print("E - Extrovert\t");
        } else if (numbersOfB > numbersOfA) {
            System.out.print(("I - Introvert\t"));
        }
            if (numbersOf2A > numbersOf2B) {
                System.out.print("S - Sensing\t");
            } else if (numbersOf2B > numbersOf2A) {
                System.out.print("N - Intuition\t");
            }
            if (numbersOf3A > numbersOf3B) {
                System.out.print("T - Thinking\t");
            } else if (numbersOf3B > numbersOf3A) {
                System.out.print("F - Feeling\t");
            }
            if (numbersOf4A > numbersOf4B) {
                System.out.print("J - Judging\t");
            } else if (numbersOf4B > numbersOf4A) {
                System.out.print("P - Perceive\t");
            }
        }
    }