public class Desktop {
    private String cooler;
    private String cpu;
    private String gpu;
    private int memory;
    private int disk;
    private int Battery;
    private Desktop.Keyborad kb;
    private Desktop.Speaker speaker;
    Desktop(){
        cooler="water";
        cpu="Core i7";
        gpu="GTX 1070";
        memory=16;
        disk=1;
        Battery=20000;
        kb=new Desktop.Keyborad();
        setKeyborad("yes");
        speaker=new Desktop.Speaker();
        setSpeaker("Bang & Oludsen");
    }

    Desktop(String cooler,String cpu, String gpu, String keyboradLight, String speakerBrand, int memory, int disk, int Battery){
        this.cooler=cooler;
        this.cpu=cpu;
        this.gpu=gpu;
        this.memory=memory;
        this.disk=disk;
        this.Battery=Battery;
        this.kb=new Desktop.Keyborad();
        setKeyborad(keyboradLight);
        this.speaker=new Desktop.Speaker();
        setSpeaker(speakerBrand);
    }

    public void setKeyborad(String light) {
        kb.setLight(light);
        System.out.println("setKeyborad is done.");
    }

    public void setSpeaker(String speakerBrand) {
        speaker.setBrand(speakerBrand);
        System.out.println("setSpeaker is done.");
    }

    @Override
    public String toString() {
        System.out.println("Desktop toString is done.");
        return "laptop{" +
                "screen=" + cooler +
                ", cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", memory=" + memory +
                ", disk=" + disk +
                ", Battery=" + Battery +
                ", kb=" + kb +
                ", speaker=" + speaker +
                '}';
    }

    private class Keyborad {
        private String light;

        public void setLight(String light) {
            this.light = light;
        }

        @Override
        public String toString() {
            return "keyBorad{" +
                    "light='" + light + '\'' +
                    '}';
        }
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
}
