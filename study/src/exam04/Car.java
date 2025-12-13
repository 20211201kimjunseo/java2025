package exam04;

public class Car extends Vehicle{
    public Car(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println(name + "가 도로를 달립니다.");
    }
}
