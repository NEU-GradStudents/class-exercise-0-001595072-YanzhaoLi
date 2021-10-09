public class Table {
    private int numberOfLeg;
    private int hight;
    private Leg leg;
    private int tableLong;
    private String color;
    private Desktop desktop;
    private int weight;
    private int width;
    Table(){
        numberOfLeg=4;
        hight=5;
        leg=new Leg();
        setLeg(5,"black");
        tableLong = 5;
        color="black";
        desktop=new Desktop();
        setDesktop("black",50);
        weight=5;
        width=5;
    }
    Table(int numberOfLeg, int hight, int legHight,int desktopSize, int weight, int width, int tableLong, String color, String desktopColor, String legColor){
        this.numberOfLeg=numberOfLeg;
        this.hight=hight;
        this.leg=new Leg();
        setLeg(legHight,legColor);
        this.tableLong = tableLong;
        this.color=color;
        this.desktop=new Desktop();
        setDesktop(desktopColor,desktopSize);
        this.weight=weight;
        this.width=width;
    }

    public void setLeg(int legHight, String color) {
        System.out.println("setLeg is done.");
        this.leg.setColor(color);
        this.leg.setHight(legHight);
    }

    public void setDesktop(String color,int size) {
        System.out.println("setDesktop is done.");
        desktop.setColor(color);
        desktop.setSize(size);
    }

    @Override
    public String toString() {
        System.out.println("Table toString is done.");
        return "table{" +
                "numberOfLeg=" + numberOfLeg +
                ", hight=" + hight +
                ", leg=" + leg +
                ", color='" + color + '\'' +
                ", desktop=" + desktop +
                ", weight=" + weight +
                ", width=" + width +
                '}';
    }

    private class Leg {
        private String color;
        private int hight;

        public void setColor(String color) {
            this.color = color;
        }

        public void setHight(int hight) {
            this.hight = hight;
        }

        @Override
        public String toString() {
            return "leg{" +
                    "color='" + color + '\'' +
                    ", hight=" + hight +
                    '}';
        }
    }

    private class Desktop {
        private String color;
        private int size;

        public void setColor(String color) {
            this.color = color;
        }

        public void setSize(int size) {
            this.size = size;
        }

        @Override
        public String toString() {
            return "desktop{" +
                    "color='" + color + '\'' +
                    ", size=" + size +
                    '}';
        }
    }
}
