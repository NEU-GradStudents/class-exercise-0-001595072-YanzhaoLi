/**
 * bathroom
 *
 * @author Yanzhao Li
 * @date 2021/10/13
 */
public class Bathroom {
    private boolean shower;
    private boolean toilet;
    private boolean tub;
    private boolean ceramicTile;
    private int numCeramicTile;
    private boolean Mirror;
    private Window window;
    private Door door;

    /**
     * bathroom
     */
    Bathroom(){
        shower=true;
        toilet=true;
        tub=true;
        ceramicTile=true;
        numCeramicTile=200;
        Mirror=true;
        window=new Window();
        setWindow(1);
        door=new Door();
        setDoor(1);
    }

    /**
     * bathroom
     *
     * @param shower         shower
     * @param toilet         toilet
     * @param tub            tub
     * @param ceramicTile    ceramic tile
     * @param Mirror         mirror
     * @param numCeramicTile num of ceramic tile
     * @param numWindow      num of window
     * @param numDoor        num of door
     */
    Bathroom(boolean shower, boolean toilet, boolean tub, boolean ceramicTile, boolean Mirror, int numCeramicTile, int numWindow, int numDoor){
        this.shower=shower;
        this.toilet=toilet;
        this.tub=tub;
        this.ceramicTile=ceramicTile;
        this.numCeramicTile=numCeramicTile;
        this.Mirror=Mirror;
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
        System.out.println("Bathroom toString is done.");
        return "bathroom{" +
                "shower=" + shower +
                ", toilet=" + toilet +
                ", tub=" + tub +
                ", ceramicTile=" + ceramicTile +
                ", numCeramicTile=" + numCeramicTile +
                ", Mirror=" + Mirror +
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
         * set up num of window
         *
         * @param numWindow num of window
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
         * set up num of door
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
