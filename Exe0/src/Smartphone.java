public class Smartphone {
    private String brand;
    private int Battery;
    private int memory;
    private int screen;
    private String color;
    private Boolean faceRecognition;
    private Chager chager;
    private Cpu cpu;

    Smartphone(){
        brand="apple";
        Battery=5000;
        memory=5000;
        screen=6;
        color="gold";
        faceRecognition=true;
        chager=new Chager();
        setChager(5);
        cpu=new Cpu();
        setCpu("apple","A12");
    }
    Smartphone( int Battery, int memory, int screen,int power, Boolean faceRecognition, String cpuBrand, String color, String brand, String type){
        this.brand=brand;
        this.Battery=Battery;
        this.memory=memory;
        this.screen=screen;
        this.color=color;
        this.faceRecognition=faceRecognition;
        this.chager=new Chager();
        this.setChager(power);
        this.cpu=new Cpu();
        this.setCpu(cpuBrand,type);
    }
    public void setChager(int power) {
        this.chager.setPower(power);
        System.out.println("setChager is done.");
    }

    public void setCpu(String cpuBrand, String type) {
        this.cpu.setCpuBrand(cpuBrand);
        this.cpu.setType(type);
        System.out.println("setCpu is done.");
    }

    @Override
    public String toString() {
        System.out.println("Smartphone toString is done.");
        return "smartphone{" +
                "brand='" + brand + '\'' +
                ", Battery=" + Battery +
                ", memory=" + memory +
                ", screen=" + screen +
                ", color='" + color + '\'' +
                ", faceRecognition=" + faceRecognition +
                ", chager=" + chager +
                ", cpu=" + cpu +
                '}';
    }

    private class Chager {
        private int power;

        public void setPower(int power) {
            this.power = power;
        }

        @Override
        public String toString() {
            return "chager{" +
                    "power=" + power +
                    '}';
        }
    }

    private class Cpu {
        private String cpuBrand;
        private String type;

        public void setCpuBrand(String cpuBrand) {
            this.cpuBrand = cpuBrand;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "cpu{" +
                    "cpuBrand='" + cpuBrand + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

}
