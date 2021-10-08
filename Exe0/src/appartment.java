public class appartment {
    private boolean bedroom;
    private boolean kitchen;
    private boolean DinningRoom;
    private boolean bathroom;
    private int numBedroom;
    private int numDoor;
    private speaker speaker;
    private computer computer;

    appartment(){
        bedroom=true;
        kitchen=true;
        DinningRoom=true;
        bathroom=true;
        numBedroom=3;
        numDoor=3;
        speaker=new speaker();
        setSpeaker("JBL");
        computer=new computer();
        setComputer("HP");
    }
    appartment(boolean bedroom, boolean kitchen, boolean DinningRoom, boolean bathroom, int numBedroom, int numDoor, String speakerBrand, String computerBrand){
        this.bedroom=bedroom;
        this.kitchen=kitchen;
        this.DinningRoom=DinningRoom;
        this.bathroom=bathroom;
        this.numBedroom=numBedroom;
        this.numDoor=numDoor;
        speaker=new speaker();
        this.setSpeaker(speakerBrand);
        computer=new computer();
        this.setComputer(computerBrand);
    }
    public void setSpeaker(String brand) {
        this.speaker.setBrand(brand);
        System.out.println("setSpeaker is done.");
    }

    public void setComputer(String brand) {
        this.computer.setBrand(brand);
        System.out.println("setComputer is done.");
    }

    @Override
    public String toString() {
        System.out.println("toString is done.");
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

    private class speaker {
        private String brand;

        public void setBrand(String brand) {
            this.brand = brand;
        }

        @Override
        public String toString() {
            return "speaker{" +
                    "brand='" + brand + '\'' +
                    '}';
        }
    }

    private class computer {
        private String brand;

        public void setBrand(String brand) {
            this.brand = brand;
        }

        @Override
        public String toString() {
            return "computer{" +
                    "brand='" + brand + '\'' +
                    '}';
        }
    }
}
