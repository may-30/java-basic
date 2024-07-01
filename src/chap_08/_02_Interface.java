package chap_08;

/*
import chap_08.reporter.NormalReporter;
import chap_08.reporter.VideoReporter;
*/

import chap_08.reporter.*;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스 (그냥 뼈대만 제공)
        /*
        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();
        */

        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();
    }
}
