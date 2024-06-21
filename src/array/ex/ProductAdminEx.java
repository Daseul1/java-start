package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxCount = 10; // 등록 가능한 상품 최대 갯수
        String[] productNames = new String[maxCount];
        int[] productPrices = new int[maxCount];
        int productCount = 0; // 현재 등록된 상품의 갯수

        while(true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                // 상품을 더 등록할 수 없는 경우 예외 처리
                if (productCount >= maxCount) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("상품 이름을 입력하세요: ");
                String productName = scanner.nextLine();
                productNames[productCount] = productName;

                System.out.print("상품 가격을 입력하세요: ");
                int productPrice = scanner.nextInt();
                productPrices[productCount] = productPrice;

                productCount++;
            } else if (option == 2) {
                // 등록된 상품이 없는 경우 예외처리
                if (productCount == 0 ) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }

                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }

            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("메뉴 번호를 확인해주세요.");
            }

        }

    }
}
