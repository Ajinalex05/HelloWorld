package oops.inheritance;

public class Animal {

    private String name;
    private int leg;

    public void Animal(String name, int leg){
        this.name= name;
        this.leg=leg;
    }

    public String getName(){
        return name;
    }
    public void eat(){
        System.out.println("eating in animal");
    }
}
