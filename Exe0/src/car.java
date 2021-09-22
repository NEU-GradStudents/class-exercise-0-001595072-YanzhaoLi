public class car {
    private int numDoor;
    private int wheel;
    private String headlight;
    private String taillight;
    private String color;
    private int numWindow;
    private engine engine;
    private interior interior;
    car(){
        numDoor=5;
        wheel=4;
        headlight="LED";
        taillight="LED";
        color="Black";
        numWindow=6;
        engine=new engine();
        setEngine(4);
        interior=new interior();
        setInterior("black");
    }

    car(int numDoor, int wheel, int numWindow, int cylinder, String headlight, String taillight, String color, String inColor){
        this.numDoor=numDoor;
        this.wheel=wheel;
        this.headlight=headlight;
        this.taillight=taillight;
        this.color=color;
        this.numWindow=numWindow;
        this.engine=new engine();
        setEngine(cylinder);
        this.interior=new interior();
        setInterior(inColor);
    }
    public void setEngine(int cylinder) {
        this.engine.setCylinder(cylinder);
    }

    public void setInterior(String color) {
        this.interior.setColor(color);
    }

    @Override
    public String toString() {
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

    private class engine {
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

    private class interior {
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
