/**
 * Table
 *
 * @author Yanzhao Li
 * @date 2021/10/13
 */
public class Table {
    private int numberOfLeg;
    private int height;
    private Leg leg;
    private int tableLong;
    private String color;
    private Desktop desktop;
    private int weight;
    private int width;

    /**
     * Table
     */
    Table(){
        numberOfLeg=4;
        height =5;
        leg=new Leg();
        setLeg(5,"black");
        tableLong = 5;
        color="black";
        desktop=new Desktop();
        setDesktop("black",50);
        weight=5;
        width=5;
    }

    /**
     * Table
     *
     * @param numberOfLeg  number of legs
     * @param height        height
     * @param legHeight     leg height
     * @param desktopSize  size of desktop
     * @param weight       weight
     * @param width        width
     * @param tableLong    long of table
     * @param color        color
     * @param desktopColor desktop color
     * @param legColor     color of leg
     */
    Table(int numberOfLeg, int height, int legHeight,int desktopSize, int weight, int width, int tableLong, String color, String desktopColor, String legColor){
        this.numberOfLeg=numberOfLeg;
        this.height =height;
        this.leg=new Leg();
        setLeg(legHeight,legColor);
        this.tableLong = tableLong;
        this.color=color;
        this.desktop=new Desktop();
        setDesktop(desktopColor,desktopSize);
        this.weight=weight;
        this.width=width;
    }

    /**
     * set of legs
     *
     * @param legHeight height of legs
     * @param color    color
     */
    public void setLeg(int legHeight, String color) {
        System.out.println("setLeg is done.");
        this.leg.setColor(color);
        this.leg.setHeight(legHeight);
    }

    /**
     * set desktop
     *
     * @param color color
     * @param size  size
     */
    public void setDesktop(String color,int size) {
        System.out.println("setDesktop is done.");
        desktop.setColor(color);
        desktop.setSize(size);
    }

    /**
     * to string
     *
     * @return {@link String}
     */
    @Override
    public String toString() {
        System.out.println("Table toString is done.");
        return "table{" +
                "numberOfLeg=" + numberOfLeg +
                ", height=" + height +
                ", leg=" + leg +
                ", color='" + color + '\'' +
                ", desktop=" + desktop +
                ", weight=" + weight +
                ", width=" + width +
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
         * set up height
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
                    ", hight=" + height +
                    '}';
        }
    }

    /**
     * desktop
     *
     * @author liyan
     * @date 2021/10/13
     */
    private class Desktop {
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
            return "desktop{" +
                    "color='" + color + '\'' +
                    ", size=" + size +
                    '}';
        }
    }
}
