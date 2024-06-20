package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }


        // 향상된 for문 = for-each문
        // iter 단축키 존재
        for (int number : numbers) {
            System.out.println(number);
        }

        // for-each문을 사용할 수 없는 경우 : 증가하는 index 값 필요할 때
        // 증가하는 i값을 출력해야 하므로 일반 for문 사용
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number " + i + "번의 결과는: " + numbers[i]);
        }
    }
}