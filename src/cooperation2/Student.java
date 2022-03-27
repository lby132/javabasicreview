package cooperation2;

public class Student implements KindOfRide{

    String name;
    int grade;
    int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public void selectRide(int rideNum) {

    }

    @Override
    public void take(int money) {

    }
}
