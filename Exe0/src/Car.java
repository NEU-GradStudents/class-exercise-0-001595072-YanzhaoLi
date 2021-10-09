public class Car {
    private int numDoor;
    private int wheel;
    private String headlight;
    private String taillight;
    private String color;
    private int numWindow;
    private Engine engine;
    private Interior interior;
    Car(){
        numDoor=5;
        wheel=4;
        headlight="LED";
        taillight="LED";
        color="Black";
        numWindow=6;
        engine=new Engine();
        setEngine(4);
        interior=new Interior();
        setInterior("black");
    }

    Car(int numDoor, int wheel, int numWindow, int cylinder, String headlight, String taillight, String color, String inColor){
        this.numDoor=numDoor;
        this.wheel=wheel;
        this.headlight=headlight;
        this.taillight=taillight;
        this.color=color;
        this.numWindow=numWindow;
        this.engine=new Engine();
        setEngine(cylinder);
        this.interior=new Interior();
        setInterior(inColor);
    }
    public void setEngine(int cylinder) {
        this.engine.setCylinder(cylinder);
        System.out.println("setEngine is done.");
    }

    public void setInterior(String color) {
        this.interior.setColor(color);
        System.out.println("setInterior is done.");
    }

    @Override
    public String toString() {
        System.out.println("Car toString is done.");
        return "car{" +
                "numDoor=" + numDoor +
                ", wheel=" + wheel +
                ", headlight='" + headlight + '\'' +
                ", taillight='" + taillight + '\'' +
                ", color='" + color + '\'' +
                ", numWindow=" + numWindow +
                ", engine=" + engine +
                ", interior=" + interior +
                '}';
    }

    private class Engine {
        private int cylinder;

        public void setCylinder(int cylinder) {
            this.cylinder = cylinder;
        }

        @Override
        public String toString() {
            return "engine{" +
                    "cylinder=" + cylinder +
                    '}';
        }
    }

    private class Interior {
        private String color;

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "interior{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }
}
