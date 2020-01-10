public class Fan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        System.out.println("Fan 1: " + fan1.toString());
        Fan fan2 = new Fan(10, "yellow", 3, true);
        System.out.println("Fan 2: " + fan2.toString());

    }

    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private double radius = 5;
    private String color = "blue";
    private int speed = SLOW;
    private boolean on = false;

    public Fan() {
    }

    public Fan(double radius, String color, int speed, boolean on) {
        this.radius = radius;
        this.color = color;
        switch (speed){
            case 1:this.speed = SLOW;
            case 2:this.speed = MEDIUM;
            case 3:this.speed = FAST;
        }
        this.on = on;
    }

    public int getSpeed() {

        return this.speed;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public boolean getOn() {
        return this.on;
    }

    @Override
    public String toString() {
        if (on) {
            return "radius= " + this.radius + ",color= " + this.color + ",speed = " + this.speed + " fan is on";
        } else {
            return "fan is off";
        }
    }

}
