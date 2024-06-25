package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        // 여러 개의 문자로 이루어진 문자열의 경우 String을 사용하고 ""로 사용
        String name = "may30";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        // 한 개의 문자로 이루어진 문자의 경우 char을 사용하고 ''로 사용
        char grade = 'A';
        name = "may31";

        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = false;
        System.out.println("이번 시험에 합격했을까요? " + pass);
    }
}
