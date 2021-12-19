package JavaCore.Module07.Zoo;

import org.w3c.dom.ls.LSOutput;

public class PopcornStall implements Soundable{
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "It's a Popcorn Stall";
    }

    @Override
    public void sound(){
        System.out.println("Hey! The best popcorn is here!");
    }
}
