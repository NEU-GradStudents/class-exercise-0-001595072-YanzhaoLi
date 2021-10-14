/**
 * desktop
 *
 * @author liyan
 * @date 2021/10/13
 */
public class Desktop {
    private String cooler;
    private String cpu;
    private String gpu;
    private int memory;
    private int disk;
    private int Battery;
    private Keyboard kb;
    private Desktop.Speaker speaker;

    /**
     * desktop
     */
    Desktop(){
        cooler="water";
        cpu="Core i7";
        gpu="GTX 1070";
        memory=16;
        disk=1;
        Battery=20000;
        kb=new Keyboard();
        setKeyborad("yes");
        speaker=new Desktop.Speaker();
        setSpeaker("Bang & Oludsen");
    }

    /**
     * 桌面
     *
     * @param cooler        cooler
     * @param cpu           cpu
     * @param gpu           gpu
     * @param keyboardLight keyboard light
     * @param speakerBrand  speaker brand
     * @param memory        memory
     * @param disk          disk
     * @param Battery       battery
     */
    Desktop(String cooler,String cpu, String gpu, String keyboardLight, String speakerBrand, int memory, int disk, int Battery){
        this.cooler=cooler;
        this.cpu=cpu;
        this.gpu=gpu;
        this.memory=memory;
        this.disk=disk;
        this.Battery=Battery;
        this.kb=new Keyboard();
        setKeyborad(keyboardLight);
        this.speaker=new Desktop.Speaker();
        setSpeaker(speakerBrand);
    }

    /**
     * set up keyboard
     *
     * @param light light
     */
    public void setKeyborad(String light) {
        kb.setLight(light);
        System.out.println("setKeyborad is done.");
    }

    /**
     * set speaker
     *
     * @param speakerBrand speaker brand
     */
    public void setSpeaker(String speakerBrand) {
        speaker.setBrand(speakerBrand);
        System.out.println("setSpeaker is done.");
    }

    /**
     * to string
     *
     * @return {@link String}
     */
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

    /**
     * keyboard
     *
     * @author Yanzhao Li
     * @date 2021/10/13
     */
    private class Keyboard {
        private String light;

        /**
         * set light
         *
         * @param light light
         */
        public void setLight(String light) {
            this.light = light;
        }

        /**
         * to string
         *
         * @return {@link String}
         */
        @Override
        public String toString() {
            return "keyBorad{" +
                    "light='" + light + '\'' +
                    '}';
        }
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
}
