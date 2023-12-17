package domain;

public class Car {
    private String name;
    private int distance;

    public Car(String name, int distance){ //다른 패키지의 클래스 파일에서 접근할 수 있도록 public 지정
        this.name = name;
        this.distance = distance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void forward(){
        distance++;
    }
}
