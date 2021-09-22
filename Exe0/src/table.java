public class table {
    private int numberOfLeg;
    private int hight;
    private leg leg;
    private int tableLong;
    private String color;
    private desktop desktop;
    private int weight;
    private int width;
    table(){
        numberOfLeg=4;
        hight=5;
        leg=new leg();
        setLeg(5,"black");
        tableLong = 5;
        color="black";
        desktop=new desktop();
        setDesktop("black",50);
        weight=5;
        width=5;
    }
    table(int numberOfLeg, int hight, int legHight,int desktopSize, int weight, int width, int tableLong, String color, String desktopColor, String legColor){
        this.numberOfLeg=numberOfLeg;
        this.hight=hight;
        this.leg=new leg();
        setLeg(legHight,legColor);
        this.tableLong = tableLong;
        this.color=color;
        this.desktop=new desktop();
        setDesktop(desktopColor,desktopSize);
        this.weight=weight;
        this.width=width;
    }

    public void setLeg(int legHight, String color) {
        this.leg.setColor(color);
        this.leg.setHight(legHight);
    }

    public void setDesktop(String color,int size) {
        desktop.setColor(color);
        desktop.setSize(size);
    }

    @Override
    public String toString() {
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

    private class leg {
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

    private class desktop {
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
