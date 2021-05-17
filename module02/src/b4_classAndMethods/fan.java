package b4_classAndMethods;

public class fan {

        private int speed;
        private boolean on;
        private double radius;
        private String color;

        public fan() {
        }

        public fan(int speed, boolean on, double radius, String color) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public boolean getOn() {
            return on;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public double getRadius(double v) {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor(String color) {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "fan{" +
                    "speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
}
