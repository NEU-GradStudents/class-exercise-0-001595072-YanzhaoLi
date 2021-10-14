/**
 * car
 *
 * @author Yanzhao Li
 * @date 2021/10/13
 */
public class Car {
    private int numDoor;
    private int wheel;
    private String headlight;
    private String taillight;
    private String color;
    private int numWindow;
    private Engine engine;
    private Interior interior;

    /**
     * car
     */
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

    /**
     * car
     *
     * @param numDoor   num of door
     * @param wheel     wheel
     * @param numWindow num of window
     * @param cylinder  cylinder
     * @param headlight headlights
     * @param taillight taillights
     * @param color     color
     * @param inColor   color of Interior
     */
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

    /**
     * set engine
     *
     * @param cylinder cylinder
     */
    public void setEngine(int cylinder) {
        this.engine.setCylinder(cylinder);
        System.out.println("setEngine is done.");
    }

    /**
     * set up interior
     *
     * @param color color
     */
    public void setInterior(String color) {
        this.interior.setColor(color);
        System.out.println("setInterior is done.");
    }

    /**
     * to string
     *
     * @return {@link String}
     */
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

    /**
     * engine
     *
     * @author Yanzhao Li
     * @date 2021/10/13
     */
    private class Engine {
        private int cylinder;

        /**
         * set cylinder
         *
         * @param cylinder cylinder
         */
        public void setCylinder(int cylinder) {
            this.cylinder = cylinder;
        }

        /**
         * to string
         *
         * @return {@link String}
         */
        @Override
        public String toString() {
            return "engine{" +
                    "cylinder=" + cylinder +
                    '}';
        }
    }

    /**
     * Interior
     *
     * @author Yanzhao Li
     * @date 2021/10/13
     */
    private class Interior {
        private String color;

        /**
         * set color
         *
         * @param color color
         */
        public void setColor(String color) {
            this.color = color;
        }

        /**
         * to string
         *
         * @return {@link String}
         */
        @Override
        public String toString() {
            return "interior{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }
}
