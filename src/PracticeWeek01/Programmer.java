package PracticeWeek01;

public class Programmer {// task06
    String name, company, position;

    public Programmer(String name, String company){
        this.name = name;
        this.company = company;
        this.position = "intern";
    }

    public String getPosition(){
        return position;
    }

    public void setPosition() {
        this.position = position;
    }

    public void work(){
        switch (position) {
            case "intern":
                position = "junior";
                break;
            case "junior":
                position = "middle";
                break;
            case "middle":
                position = "senior";
                break;
            default:
                position = "lead";
                break;
        }
    }

    public static void main(String[] args) {

    }
}
