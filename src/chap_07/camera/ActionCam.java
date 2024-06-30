package chap_07.camera;

public final class ActionCam extends Camera {  // class 상속 막기
    public final String lens; // = "광각렌즈"; // 값 변경 막기

    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈";
    }

    public final void makeVideo() { // method overriding 막기
        System.out.println(this.name + " : " + this.lens + "로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
    }
}
