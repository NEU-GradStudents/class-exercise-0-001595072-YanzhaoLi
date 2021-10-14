/**
 * apartment
 *
 * @author Yanzhao Li
 * @date 2021/10/13
 */
public class Appartment {
    private boolean bedroom;
    private boolean kitchen;
    private boolean DinningRoom;
    private boolean bathroom;
    private int numBedroom;
    private int numDoor;
    private Speaker speaker;
    private Computer computer;

    /**
     * apartment
     */
    Appartment(){
        bedroom=true;
        kitchen=true;
        DinningRoom=true;
        bathroom=true;
        numBedroom=3;
        numDoor=3;
        speaker=new Speaker();
        setSpeaker("JBL");
        computer=new Computer();
        setComputer("HP");
    }

    /**
     * apartment
     *
     * @param bedroom       bedroom
     * @param kitchen       kitchen
     * @param DinningRoom   restaurant
     * @param bathroom      bathroom
     * @param numBedroom    num of bedroom
     * @param numDoor       num of door
     * @param speakerBrand  speakers brand
     * @param computerBrand computers brand
     */
    Appartment(boolean bedroom, boolean kitchen, boolean DinningRoom, boolean bathroom, int numBedroom, int numDoor, String speakerBrand, String computerBrand){
        this.bedroom=bedroom;
        this.kitchen=kitchen;
        this.DinningRoom=DinningRoom;
        this.bathroom=bathroom;
        this.numBedroom=numBedroom;
        this.numDoor=numDoor;
        speaker=new Speaker();
        this.setSpeaker(speakerBrand);
        computer=new Computer();
        this.setComputer(computerBrand);
    }

    /**
     * set speaker
     *
     * @param brand brand
     */
    public void setSpeaker(String brand) {
        this.speaker.setBrand(brand);
        System.out.println("setSpeaker is done.");
    }

    /**
     * set computer
     *
     * @param brand brand
     */
    public void setComputer(String brand) {
        this.computer.setBrand(brand);
        System.out.println("setComputer is done.");
    }

    /**
     * to string
     *
     * @return {@link String}
     */
    @Override
    public String toString() {
        System.out.println("Appartment toString is done.");
        return "appartment{" +
                "bedroom=" + bedroom +
                ", kitchen=" + kitchen +
                ", DinningRoom=" + DinningRoom +
                ", bathroom=" + bathroom +
                ", numBedroom=" + numBedroom +
                ", numDoor=" + numDoor +
                ", speaker=" + speaker +
                ", computer=" + computer +
                '}';
    }

    /**
     * speaker
     *
     * @author Yanzhao Li
     * @date 2021/10/13
     */
    private class Speaker {
        private String brand;

        /**
         * set brand
         *
         * @param brand brand
         */
        public void setBrand(String brand) {
            this.brand = brand;
        }

        /**
         * to string
         *
         * @return {@link String}
         */
        @Override
        public String toString() {
            return "speaker{" +
                    "brand='" + brand + '\'' +
                    '}';
        }
    }

    /**
     * computer
     *
     * @author Yanzhao Li
     * @date 2021/10/13
     */
    private class Computer {
        private String brand;

        /**
         * set brand
         *
         * @param brand brand
         */
        public void setBrand(String brand) {
            this.brand = brand;
        }

        /**
         * to string
         *
         * @return {@link String}
         */
        @Override
        public String toString() {
            return "computer{" +
                    "brand='" + brand + '\'' +
                    '}';
        }
    }
}
