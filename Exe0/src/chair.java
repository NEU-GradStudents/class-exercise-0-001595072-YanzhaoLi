public class chair {
    private int height;
    private int weight;
    private int numberOfLeg;
    private String color;
    private int numberOfRamRest;
    private leg leg;
    private armRest arm;
    private backRest back;
    chair(){
        height=5;
        weight=5;
        numberOfLeg=5;
        color="black";
        numberOfRamRest=2;
        leg=new leg();
        setLeg("black",5);
        arm=new armRest();
        setArm("black",5);
        back=new backRest();
        setBack("black",5);
    }

    chair(int height, int weight, int numberOfLeg, int numberOfRamRest, int legHeigth, int armSize, int backSize, String legColor, String color, String armColor,  String backColor){
        this.height=height;
        this.weight=weight;
        this.numberOfLeg=numberOfLeg;
        this.color=color;
        this.numberOfRamRest=numberOfRamRest;
        this.leg=new leg();
        setLeg(legColor,legHeigth);
        this.arm=new armRest();
        setArm(armColor,armSize);
        this.back=new backRest();
        setBack(backColor,backSize);
    }
    private void setBack(String color, int size) {
        back.setColor(color);
        back.setSize(size);
    }

    private void setArm(String color, int size) {
        arm.setColor(color);
        arm.setSize(size);
    }

    private void setLeg(String color, int height) {
        leg.setColor(color);
        leg.setHeight(height);
    }

    @Override
    public String toString() {
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

    private class leg {
        private String color;
        private int height;

        public void setColor(String color) {
            this.color = color;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        @Override
        public String toString() {
            return "leg{" +
                    "color='" + color + '\'' +
                    ", height=" + height +
                    '}';
        }
    }

    private class armRest {
        private String color;
        private int size;

        public void setColor(String color) {
            this.color = color;
        }

        public void setSize(int size) {
            this.size = size;
        }
    }

    private class backRest {
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
            return "backRest{" +
                    "color='" + color + '\'' +
                    ", size=" + size +
                    '}';
        }
    }
}
