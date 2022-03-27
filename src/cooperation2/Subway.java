package cooperation2;

public class Subway implements KindOfRide {

    int lineNum;
    int passengerCount;
    int money;

    @Override
    public void selectRide(int rideNum) {
        this.lineNum = rideNum;
    }

    @Override
    public void take(int money) {
        passengerCount++;
        this.money += money;
    }

    public void subInfo() {
        System.out.println("지하철 " + lineNum + "번의 승객은 " + passengerCount + "명이고, 수입은" + money + "입니다.");
    }
}
