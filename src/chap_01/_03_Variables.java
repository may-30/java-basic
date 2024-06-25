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

        // 보다 정교한 소수점 계산이 필요하다면 double 자료형 사용
        double d = 3.14123456789;
        // float 자료형의 경우 뒤에 F, f 기입
        float f = 3.14123456789F;

        System.out.println(d);
        System.out.println(f);

        // 21억보다 큰 수의 경우 long 자료형 사용
        long l = 1000000000000L;
        // 3자리씩 끊어서 _ 로 구분 가능
        l = 1_000_000_000_000L;
        System.out.println(l);
    }
}
