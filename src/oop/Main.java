package oop;

public class Main {
    public static void main(String[] args) {

        Fighter f1=new Fighter("FURKAN",20,100,86,20);
        Fighter f2 =new Fighter("KAAN",15,100,80,30);

        Ring ring=new Ring(f1,f2,80,100);
        ring.run();


    }
}
