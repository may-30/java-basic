package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        // String 주민등록번호 = "901231-1234567";
        String 주민등록번호 = "030708-4567890";
        System.out.println(주민등록번호.substring(0, 주민등록번호.indexOf("-") + 2));
    }
}
