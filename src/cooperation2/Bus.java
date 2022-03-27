package cooperation2;

public class Bus implements KindOfRide {

    int busNum;
    int passengerCount;
    int money;

    @Override
    public void selectRide(int rideNum) {
        this.busNum = rideNum;
    }

    @Override
    public void take(int money) {
        passengerCount++;
        this.money = money;
    }

    public void busInfo() {
        System.out.println("버스 " + busNum + "번의 승객은 " + passengerCount + "명이고, 수입은" + money + "입니다.");
    }
}
