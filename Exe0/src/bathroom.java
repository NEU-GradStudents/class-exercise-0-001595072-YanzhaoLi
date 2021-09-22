public class bathroom {
    private boolean shower;
    private boolean toilet;
    private boolean tub;
    private boolean ceramicTile;
    private int numCeramicTile;
    private boolean Mirror;
    private window window;
    private door door;
    bathroom(){
        shower=true;
        toilet=true;
        tub=true;
        ceramicTile=true;
        numCeramicTile=200;
        Mirror=true;
        window=new window();
        setWindow(1);
        door=new door();
        setDoor(1);
    }
    bathroom(boolean shower, boolean toilet, boolean tub, boolean ceramicTile, boolean Mirror, int numCeramicTile, int numWindow, int numDoor){
        this.shower=shower;
        this.toilet=toilet;
        this.tub=tub;
        this.ceramicTile=ceramicTile;
        this.numCeramicTile=numCeramicTile;
        this.Mirror=Mirror;
        window=new window();
        this.setWindow(numWindow);
        door=new door();
        this.setDoor(numDoor);
    }

    public void setDoor(int numDoor) {
        this.door.setNumDoor(numDoor);
    }

    public void setWindow(int numWindow) {
        this.window.setNumWindow(numWindow);
    }

    @Override
    public String toString() {
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

    private class window {
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

    private class door {
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
