public class Bathroom {
    private boolean shower;
    private boolean toilet;
    private boolean tub;
    private boolean ceramicTile;
    private int numCeramicTile;
    private boolean Mirror;
    private Window window;
    private Door door;
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

    public void setDoor(int numDoor) {
        this.door.setNumDoor(numDoor);
        System.out.println("setDoor is done.");
    }

    public void setWindow(int numWindow) {
        this.window.setNumWindow(numWindow);
        System.out.println("setWindow is done.");
    }

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

    private class Window {
        private int numWindow;

        public void setNumWindow(int numWindow) {
            this.numWindow = numWindow;
        }

        @Override
        public String toString() {
            return "window{" +
                    "numWindow=" + numWindow +
                    '}';
        }
    }

    private class Door {
        private int numDoor;

        public void setNumDoor(int numDoor) {
            this.numDoor = numDoor;
        }

        @Override
        public String toString() {
            return "door{" +
                    "numDoor=" + numDoor +
                    '}';
        }
    }
}
