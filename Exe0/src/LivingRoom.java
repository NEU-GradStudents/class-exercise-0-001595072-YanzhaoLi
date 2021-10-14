/**
 * livingRoom
 *
 * @author liyan
 * @date 2021/10/13
 */
public class LivingRoom {
    private boolean TV;
    private boolean sofa;
    private boolean table;
    private int size;
    private int height;
    private int numLight;
    private Window window;
    private Door door;

    /**
     * livingRoom
     */
    LivingRoom(){
        TV=true;
        sofa=true;
        table=true;
        size=50;
        height =3;
        numLight=5;
        window=new Window();
        setWindow(3);
        door=new Door();
        setDoor(3);
    }

    /**
     * livingRoom
     *
     * @param TV        TV
     * @param sofa      sofa
     * @param table     table
     * @param size      size
     * @param height    height
     * @param numLight  num of light
     * @param numWindow num of window
     * @param numDoor   num of door
     */
    LivingRoom(boolean TV, boolean sofa, boolean table, int size, int height, int numLight, int numWindow, int numDoor){
        this.TV=TV;
        this.sofa=sofa;
        this.table=table;
        this.size=size;
        this.height =height;
        this.numLight=numLight;
        window=new Window();
        this.setWindow(numWindow);
        door=new Door();
        this.setDoor(numDoor);
    }

    /**
     * set door
     *
     * @param numDoor num of door
     */
    public void setDoor(int numDoor) {
        this.door.setNumDoor(numDoor);
        System.out.println("setDoor is done.");
    }

    /**
     * set window
     *
     * @param numWindow num of window
     */
    public void setWindow(int numWindow) {
        this.window.setNumWindow(numWindow);
        System.out.println("setWindow is done.");
    }

    /**
     * to string
     *
     * @return {@link String}
     */
    @Override
    public String toString() {
        System.out.println("LivingRoom toString is done.");
        return "livingRoom{" +
                "TV=" + TV +
                ", sofa=" + sofa +
                ", table=" + table +
                ", size=" + size +
                ", hight=" + height +
                ", numLight=" + numLight +
                ", window=" + window +
                ", door=" + door +
                '}';
    }

    /**
     * window
     *
     * @author Yanzhao Li
     * @date 2021/10/13
     */
    private class Window {
        private int numWindow;

        /**
         * set num of window
         *
         * @param numWindow num窗口
         */
        public void setNumWindow(int numWindow) {
            this.numWindow = numWindow;
        }

        /**
         * to string
         *
         * @return {@link String}
         */
        @Override
        public String toString() {
            return "window{" +
                    "numWindow=" + numWindow +
                    '}';
        }
    }

    /**
     * door
     *
     * @author Yanzhao Li
     * @date 2021/10/13
     */
    private class Door {
        private int numDoor;

        /**
         * set num of door
         *
         * @param numDoor num of door
         */
        public void setNumDoor(int numDoor) {
            this.numDoor = numDoor;
        }

        /**
         * to string
         *
         * @return {@link String}
         */
        @Override
        public String toString() {
            return "door{" +
                    "numDoor=" + numDoor +
                    '}';
        }
    }
}
