package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // class Person : 사람
        // class Student extends Person : 학생 (학생은 사람이다. Student is a person)
        // class Teacher extends Person : 선생님 (선생님은 사람이다. Teacher is a person)

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("----------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) {
            cam.showMainFeature();
        }

        System.out.println("----------");

        // factoryCam.detectFire(); // Camera 자료형이기 때문에 바로 호출 불가
        // speedCam.checkSpeed(); // Camera 자료형이기 때문에 바로 호출 불가
        // speedCam.recognizeLicensePlate(); // Camera 자료형이기 때문에 바로 호출 불가

        if (camera instanceof Camera) {
            System.out.println("카메리입니다.");
        }

        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam)factoryCam).detectFire(); // 형변환
        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam)speedCam).checkSpeed(); // 형변환
            ((SpeedCam)speedCam).recognizeLicensePlate(); // 형변환
        }

        System.out.println("----------");

        Object[] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new FactoryCam();
        objs[2] = new SpeedCam();

        for (Object obj : objs) {
            if (obj instanceof Camera) {
                System.out.println("카메라입니다.");
            }

            if (obj instanceof FactoryCam) {
                ((FactoryCam)obj).detectFire();
            }

            if (obj instanceof SpeedCam) {
                ((SpeedCam)obj).checkSpeed();
                ((SpeedCam)obj).recognizeLicensePlate();
            }
        }
    }
}
