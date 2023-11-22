import truck.Single;
import truck.Truck;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setSeat(5);
        System.out.println(car.getSeat());

        Bike bike = new Bike();
        bike.setSeat(2);
        System.out.println(bike.getSeat());

        Truck truck = new Truck();
        truck.setSeat(4);
        System.out.println(truck.getSeat());

        Single single = new Single();
    }
}


class Car {
    int seat;

    public int getSeat()
    {
        return seat;
    }

    public void setSeat(int seat)
    {
        this.seat = seat;
    }
}