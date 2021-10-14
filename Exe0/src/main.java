/**
 * main
 *
 * @author Yanzhao Li
 * @date 2021/10/13
 */
public class main {
    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args) {
        Appartment a1=new Appartment();
        Appartment a2=new Appartment(true,true,true,true,10,10,"aa","aa");
        Appartment a3=new Appartment(false,false,false,false,5,5,"dad","awsdas");
        LivingRoom li1=new LivingRoom();
        LivingRoom li2=new LivingRoom(true,true,true,5,5,5,5,5);
        LivingRoom li3=new LivingRoom(false,false,false,10,10,10,10,10);
        Bathroom ba1=new Bathroom();
        Bathroom ba2=new Bathroom(true,true,true,true,true,3,3,3);
        Bathroom ba3=new Bathroom(false,false,false,false,false,4,4,4);
        Bedroom be1=new Bedroom();
        Bedroom be2=new Bedroom(true,true,true,true,true,3,"AA","aa");
        Bedroom be3=new Bedroom(false,false,false,false,false,5,"BB","bb");
        Car ca1=new Car();
        Car ca2=new Car(3,3,3,3,"AA","AA","aa","aa");
        Car ca3=new Car(4,4,4,4,"BB","BB","bb","bb");
        Desktop d1=new Desktop();
        Desktop d2=new Desktop("AA","AA","AA","AA","AA",3,3,3);
        Desktop d3=new Desktop("BB","BB","BB","BB","BB",5,5,5);
        Smartphone s1=new Smartphone();
        Smartphone s2=new Smartphone(3,3,3,3,true,"a","a","a","a");
        Smartphone s3=new Smartphone(5,5,5,5,false,"b","b","b","b");
        Laptop l1=new Laptop();
        Laptop l2=new Laptop("A","A","A","A",3,3,3,3);
        Laptop l3=new Laptop("B","B","B","B",5,5,5,5);
        Chair c1=new Chair();
        Chair c2=new Chair(1,1,1,1,1,1,1,"a","a","a","a");
        Chair c3=new Chair(3,3,3,3,3,3,3,"b","b","b","b");
        Table t1=new Table();
        Table t2=new Table(1,1,1,1,1,1,1,"a","a","a");
        Table t3=new Table(3,3,3,3,3,3,3,"b","b","b");
        System.out.println("a1: "+a1);
        System.out.println("a2: "+a2);
        System.out.println("a3: "+a3);
        System.out.println("li1: "+li1);
        System.out.println("li2: "+li2);
        System.out.println("li3: "+li3);
        System.out.println("ba1: "+ba1);
        System.out.println("ba2: "+ba2);
        System.out.println("ba3: "+ba3);
        System.out.println("be1: "+be1);
        System.out.println("be2: "+be2);
        System.out.println("be3: "+be3);
        System.out.println("ca1: "+ca1);
        System.out.println("ca2: "+ca2);
        System.out.println("ca3: "+ca3);
        System.out.println("d1: "+d1);
        System.out.println("d2: "+d2);
        System.out.println("d3: "+d3);
        System.out.println("s1: "+s1);
        System.out.println("s2: "+s2);
        System.out.println("s3: "+s3);
        System.out.println("l1: "+l1);
        System.out.println("l2: "+l2);
        System.out.println("l3: "+l3);
        System.out.println("c1: "+c1);
        System.out.println("c2: "+c2);
        System.out.println("c3: "+c3);
        System.out.println("t1: "+t1);
        System.out.println("t2: "+t2);
        System.out.println("t3: "+t3);
    }
}
