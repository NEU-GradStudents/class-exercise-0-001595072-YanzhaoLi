public class Bedroom {
    private boolean bed;
    private boolean table;
    private boolean light;
    private boolean AC;
    private boolean picture;
    private int numWindow;
    private Speaker speaker;
    private Computer computer;
    Bedroom(){
        bed=true;
        table=true;
        light=true;
        AC=true;
        picture=true;
        numWindow=2;
        speaker=new Speaker();
        setSpeaker("JBL");
        computer=new Computer();
        setComputer("HP");
    }
    Bedroom(boolean bed, boolean table, boolean light, boolean AC, boolean picture, int numWindow, String speakerBrand, String computerBrand){
        this.bed=bed;
        this.table=table;
        this.light=light;
        this.AC=AC;
        this.picture=picture;
        this.numWindow=numWindow;
        this.speaker=new Speaker();
        setSpeaker(speakerBrand);
        this.computer=new Computer();
        setComputer(computerBrand);
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
        System.out.println("Bedroom toString is done.");
        return "bedroom{" +
                "bed=" + bed +
                ", table=" + table +
                ", light=" + light +
                ", AC=" + AC +
                ", picture=" + picture +
                ", numWindow=" + numWindow +
                ", speaker=" + speaker +
                ", computer=" + computer +
                '}';
    }

    private class Speaker {
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

    private class Computer {
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
