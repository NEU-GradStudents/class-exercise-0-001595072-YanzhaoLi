public class Chair {
    private int height;
    private int weight;
    private int numberOfLeg;
    private String color;
    private int numberOfRamRest;
    private Leg leg;
    private ArmRest arm;
    private BackRest back;
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

    Chair(int height, int weight, int numberOfLeg, int numberOfRamRest, int legHeigth, int armSize, int backSize, String legColor, String color, String armColor,  String backColor){
        this.height=height;
        this.weight=weight;
        this.numberOfLeg=numberOfLeg;
        this.color=color;
        this.numberOfRamRest=numberOfRamRest;
        this.leg=new Leg();
        setLeg(legColor,legHeigth);
        this.arm=new ArmRest();
        setArm(armColor,armSize);
        this.back=new BackRest();
        setBack(backColor,backSize);
    }
    private void setBack(String color, int size) {
        System.out.println("setBack is done.");
        back.setColor(color);
        back.setSize(size);
    }

    private void setArm(String color, int size) {
        System.out.println("setArm is done.");
        arm.setColor(color);
        arm.setSize(size);
    }

    private void setLeg(String color, int height) {
        System.out.println("setLeg is done.");
        leg.setColor(color);
        leg.setHeight(height);
    }

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

    private class Leg {
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

    private class ArmRest {
        private String color;
        private int size;

        public void setColor(String color) {
            this.color = color;
        }

        public void setSize(int size) {
            this.size = size;
        }
    }

    private class BackRest {
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
