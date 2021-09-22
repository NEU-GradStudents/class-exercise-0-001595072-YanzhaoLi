public class livingRoom {
    private boolean TV;
    private boolean sofa;
    private boolean table;
    private int size;
    private int hight;
    private int numLight;
    private window window;
    private door door;
    livingRoom(){
        TV=true;
        sofa=true;
        table=true;
        size=50;
        hight=3;
        numLight=5;
        window=new window();
        setWindow(3);
        door=new door();
        setDoor(3);
    }

    livingRoom(boolean TV, boolean sofa, boolean table, int size, int hight, int numLight, int numWindow, int numDoor){
        this.TV=TV;
        this.sofa=sofa;
        this.table=table;
        this.size=size;
        this.hight=hight;
        this.numLight=numLight;
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
