public class bedroom {
    private boolean bed;
    private boolean table;
    private boolean light;
    private boolean AC;
    private boolean picture;
    private int numWindow;
    private speaker speaker;
    private computer computer;
    bedroom(){
        bed=true;
        table=true;
        light=true;
        AC=true;
        picture=true;
        numWindow=2;
        speaker=new speaker();
        setSpeaker("JBL");
        computer=new computer();
        setComputer("HP");
    }
    bedroom(boolean bed, boolean table, boolean light, boolean AC, boolean picture, int numWindow, String speakerBrand, String computerBrand){
        this.bed=bed;
        this.table=table;
        this.light=light;
        this.AC=AC;
        this.picture=picture;
        this.numWindow=numWindow;
        this.speaker=new speaker();
        setSpeaker(speakerBrand);
        this.computer=new computer();
        setComputer(computerBrand);
    }
    public void setSpeaker(String brand) {
        this.speaker.setBrand(brand);
    }

    public void setComputer(String brand) {
        this.computer.setBrand(brand);
    }

    @Override
    public String toString() {
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
