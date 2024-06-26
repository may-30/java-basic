package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int to float, double
        int score = 96;
        System.out.println(score); // 96
        System.out.println((float) score); // 96.0
        System.out.println((double) score); // 96.0

        // float, double to int
        float score_f = 96.6F;
        double score_d = 98.8;
        System.out.println((int) score_f); // 96
        System.out.println((int) score_d); // 98

        // 정수 + 실수 연산
        score = 96 + (int) 98.8; // 96 + 98
        System.out.println(score); // 194

        score_d = (double) 96 + 98.8; // 96.0 + 98.8
        System.out.println(score_d); // 194.8

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 194 -> 194.0
        // int -> long -> flaot -> double (자동 형변환)
        System.out.println(convertedScoreDouble);
        

        int convertedScoreInt = (int) score_d; // 194.8 -> 194
        // double -> float -> long -> int (수동 형변환)
        System.out.println(convertedScoreInt);
    }
}
