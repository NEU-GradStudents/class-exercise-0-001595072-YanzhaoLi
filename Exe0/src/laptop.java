public class laptop {
    private int screen;
    private String cpu;
    private String gpu;
    private int memory;
    private int disk;
    private int Battery;
    private keyborad kb;
    private speaker speaker;
    laptop(){
        screen=17;
        cpu="Core i7";
        gpu="GTX 1070";
        memory=16;
        disk=1;
        Battery=20000;
        kb=new keyborad();
        setKeyborad("yes");
        speaker=new speaker();
        setSpeaker("Bang & Oludsen");
    }

    laptop(String cpu, String gpu, String keyboradLight, String speakerBrand, int screen, int memory, int disk, int Battery){
        this.screen=screen;
        this.cpu=cpu;
        this.gpu=gpu;
        this.memory=memory;
        this.disk=disk;
        this.Battery=Battery;
        this.kb=new keyborad();
        setKeyborad(keyboradLight);
        this.speaker=new speaker();
        setSpeaker(speakerBrand);
    }

    public void setKeyborad(String light) {
        kb.setLight(light);
    }

    public void setSpeaker(String speakerBrand) {
        speaker.setBrand(speakerBrand);
    }

    @Override
    public String toString() {
        return "laptop{" +
                "screen=" + screen +
                ", cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", memory=" + memory +
                ", disk=" + disk +
                ", Battery=" + Battery +
                ", kb=" + kb +
                ", speaker=" + speaker +
                '}';
    }

    private class keyborad {
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
}
