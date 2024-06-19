package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalCost = 0;
        while(true) {
            System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();

            if (option == 1) {
                input.nextLine(); // 이 부분이 없으면 문제가 발생

                System.out.print("상품명을 입력하세요: "); // 이전의 개행 문자를 읽어버려 빈 문자열 반환
                // => 따라서, 해당 부분이 입력을 하지 못하고 자동으로 넘어가서 상품명을 입력하세요: 상품의 가격을 입력하세요:  결과값이 나타나게됨
                String name = input.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = input.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int count = input.nextInt();

                totalCost += price * count;
                System.out.println("상품명:" + name + " 가격:" + price + " 수량:" + count + " 합계:" + price * count);
            } else if (option == 2) {
                System.out.println("총 비용: " + totalCost);
                totalCost = 0; // 비용 초기화
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
