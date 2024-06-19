package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");
        while(true) {
            int number = input.nextInt();

            if(number == -1) break;

            sum += number;
            count ++;
        }
        System.out.println("입력한 숫자들의 합계: " + sum);

        double average = (double) sum / count; // 형변환을 한 sum을 가지고 계산이 이루어져야함
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
