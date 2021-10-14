/**
 * chair
 *
 * @author liyan
 * @date 2021/10/13
 */
public class Chair {
    private int height;
    private int weight;
    private int numberOfLeg;
    private String color;
    private int numberOfRamRest;
    private Leg leg;
    private ArmRest arm;
    private BackRest back;

    /**
     * chair
     */
    Chair(){
        height=5;
        weight=5;
        numberOfLeg=5;
        color="black";
        numberOfRamRest=2;
        leg=new Leg();
        setLeg("black",5);
        arm=new ArmRest();
        setArm("black",5);
        back=new BackRest();
        setBack("black",5);
    }

    /**
     * chair
     *
     * @param height          height
     * @param weight          weight
     * @param numberOfLeg     num of leg
     * @param numberOfRamRest number of ramrest
     * @param legHeight       leg height
     * @param armSize         arm size
     * @param backSize        back size
     * @param legColor        color of leg
     * @param color           color
     * @param armColor        color of arm
     * @param backColor       back color
     */
    Chair(int height, int weight, int numberOfLeg, int numberOfRamRest, int legHeight, int armSize, int backSize, String legColor, String color, String armColor,  String backColor){
        this.height=height;
        this.weight=weight;
        this.numberOfLeg=numberOfLeg;
        this.color=color;
        this.numberOfRamRest=numberOfRamRest;
        this.leg=new Leg();
        setLeg(legColor,legHeight);
        this.arm=new ArmRest();
        setArm(armColor,armSize);
        this.back=new BackRest();
        setBack(backColor,backSize);
    }

    /**
     * set back
     *
     * @param color color
     * @param size  size
     */
    private void setBack(String color, int size) {
        System.out.println("setBack is done.");
        back.setColor(color);
        back.setSize(size);
    }

    /**
     * set arm
     *
     * @param color color
     * @param size  size
     */
    private void setArm(String color, int size) {
        System.out.println("setArm is done.");
        arm.setColor(color);
        arm.setSize(size);
    }

    /**
     * set legs
     *
     * @param color  color
     * @param height height
     */
    private void setLeg(String color, int height) {
        System.out.println("setLeg is done.");
        leg.setColor(color);
        leg.setHeight(height);
    }

    /**
     * to string
     *
     * @return {@link String}
     */
    @Override
    public String toString() {
        System.out.println("Chair toString is done.");
        return "chair{" +
                "height=" + height +
                ", weight=" + weight +
                ", numberOfLeg=" + numberOfLeg +
                ", color='" + color + '\'' +
                ", numberOfRamRest=" + numberOfRamRest +
                ", leg=" + leg +
                ", arm=" + arm +
                ", back=" + back +
                '}';
    }

    /**
     * leg
     *
     * @author Yanzhao Li
     * @date 2021/10/13
     */
    private class Leg {
        private String color;
        private int height;

        /**
         * set color
         *
         * @param color color
         */
        public void setColor(String color) {
            this.color = color;
        }

        /**
         * set height
         *
         * @param height height
         */
        public void setHeight(int height) {
            this.height = height;
        }

        /**
         * to string
         *
         * @return {@link String}
         */
        @Override
        public String toString() {
            return "leg{" +
                    "color='" + color + '\'' +
                    ", height=" + height +
                    '}';
        }
    }

    /**
     * armrest
     *
     * @author Yanzhao Li
     * @date 2021/10/13
     */
    private class ArmRest {
        private String color;
        private int size;

        /**
         * set color
         *
         * @param color color
         */
        public void setColor(String color) {
            this.color = color;
        }

        /**
         * set size
         *
         * @param size size
         */
        public void setSize(int size) {
            this.size = size;
        }
    }

    /**
     * backrest
     *
     * @author liyan
     * @date 2021/10/13
     */
    private class BackRest {
        private String color;
        private int size;

        /**
         * set color
         *
         * @param color color
         */
        public void setColor(String color) {
            this.color = color;
        }

        /**
         * set size
         *
         * @param size size
         */
        public void setSize(int size) {
            this.size = size;
        }

        /**
         * to string
         *
         * @return {@link String}
         */
        @Override
        public String toString() {
            return "backRest{" +
                    "color='" + color + '\'' +
                    ", size=" + size +
                    '}';
        }
    }
}
