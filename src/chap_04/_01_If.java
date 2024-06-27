package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        // int hour = 10; // 오전 10시
        int hour = 15; // 오후 3시
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷 추가");
        }
        System.out.println("커피 주문 완료");
    }
}
