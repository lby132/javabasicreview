package cooperation;

public class TakeTrans {

    public static void main(String[] args) {
        final Student james = new Student("James", 5000);
        final Student tomas = new Student("Tomas", 10000);

        Bus bus100 = new Bus(100);
        james.takeBus(bus100);
        james.showInfo();
        bus100.showInfo();

        final Subway subway = new Subway(2);
        tomas.takeSubway(subway);
        tomas.showInfo();
        subway.showInfo();
    }
}
