public class LivingRoom {
    private boolean TV;
    private boolean sofa;
    private boolean table;
    private int size;
    private int hight;
    private int numLight;
    private Window window;
    private Door door;
    LivingRoom(){
        TV=true;
        sofa=true;
        table=true;
        size=50;
        hight=3;
        numLight=5;
        window=new Window();
        setWindow(3);
        door=new Door();
        setDoor(3);
    }

    LivingRoom(boolean TV, boolean sofa, boolean table, int size, int hight, int numLight, int numWindow, int numDoor){
        this.TV=TV;
        this.sofa=sofa;
        this.table=table;
        this.size=size;
        this.hight=hight;
        this.numLight=numLight;
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
        System.out.println("LivingRoom toString is done.");
        return "livingRoom{" +
                "TV=" + TV +
                ", sofa=" + sofa +
                ", table=" + table +
                ", size=" + size +
                ", hight=" + hight +
                ", numLight=" + numLight +
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
