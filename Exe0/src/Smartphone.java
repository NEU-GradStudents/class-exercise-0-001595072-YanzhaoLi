/**
 * SmartPhone
 *
 * @author Yanzhao Li
 * @date 2021/10/13
 */
public class Smartphone {
    private String brand;
    private int Battery;
    private int memory;
    private int screen;
    private String color;
    private Boolean faceRecognition;
    private Charger charger;
    private Cpu cpu;

    /**
     * set smartphone
     */
    Smartphone(){
        brand="apple";
        Battery=5000;
        memory=5000;
        screen=6;
        color="gold";
        faceRecognition=true;
        charger =new Charger();
        setChager(5);
        cpu=new Cpu();
        setCpu("apple","A12");
    }

    /**
     * set Smartphone
     *
     * @param Battery         battery
     * @param memory          memory
     * @param screen          screen
     * @param power           power
     * @param faceRecognition face recognition
     * @param cpuBrand        brand of cpu
     * @param color           color
     * @param brand           brand
     * @param type            type
     */
    Smartphone( int Battery, int memory, int screen,int power, Boolean faceRecognition, String cpuBrand, String color, String brand, String type){
        this.brand=brand;
        this.Battery=Battery;
        this.memory=memory;
        this.screen=screen;
        this.color=color;
        this.faceRecognition=faceRecognition;
        this.charger =new Charger();
        this.setChager(power);
        this.cpu=new Cpu();
        this.setCpu(cpuBrand,type);
    }

    /**
     * set chager
     *
     * @param power power
     */
    public void setChager(int power) {
        this.charger.setPower(power);
        System.out.println("setChager is done.");
    }

    /**
     * set up cpu
     *
     * @param cpuBrand brand of cpu
     * @param type     type
     */
    public void setCpu(String cpuBrand, String type) {
        this.cpu.setCpuBrand(cpuBrand);
        this.cpu.setType(type);
        System.out.println("setCpu is done.");
    }

    /**
     * to string
     *
     * @return {@link String}
     */
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
                ", charger=" + charger +
                ", cpu=" + cpu +
                '}';
    }

    /**
     * Charger
     *
     * @author Yanzhao Li
     * @date 2021/10/13
     */
    private class Charger {
        private int power;

        /**
         * 集权力
         *
         * @param power power
         */
        public void setPower(int power) {
            this.power = power;
        }

        /**
         * to string
         *
         * @return {@link String}
         */
        @Override
        public String toString() {
            return "charger{" +
                    "power=" + power +
                    '}';
        }
    }

    /**
     * cpu
     *
     * @author Yanzhao Li
     * @date 2021/10/13
     */
    private class Cpu {
        private String cpuBrand;
        private String type;

        /**
         * set up brand of cpu
         *
         * @param cpuBrand brand of cpu
         */
        public void setCpuBrand(String cpuBrand) {
            this.cpuBrand = cpuBrand;
        }

        /**
         * set type
         *
         * @param type type
         */
        public void setType(String type) {
            this.type = type;
        }

        /**
         * to string
         *
         * @return {@link String}
         */
        @Override
        public String toString() {
            return "cpu{" +
                    "cpuBrand='" + cpuBrand + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

}
