public class Car {
    private int wheels = 4;
    public double power;
    public String color;
    private boolean isDrive;
    private int speed;
    private int maxSpeed;
    
    public Car(int max) {
        maxSpeed = max;
    }

    public Car() {
        maxSpeed = 180;
    }

    public void Drive() {
        if (speed < maxSpeed) {
        speed += 5;
        }
    }

    public boolean isDriving() {
        if (speed > 0) {
            isDrive = true;
        } else if (speed == 0) {
            isDrive = false;
        }
        return isDrive;        
    }
    public void Slow() {
        if (speed > 0) {
        speed -= 5;
        }
    }

    public int getSpeed() {
        return speed;
    }
}
