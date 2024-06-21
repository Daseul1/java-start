package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("학생수를 입력하세요: ");
        int studentCount = input.nextInt();

        int[][] arr = new int[studentCount][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(subjects[j] + " 점수: ");
                arr[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int total = 0;
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }

            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + (double) total / 3);
        }
    }
}
