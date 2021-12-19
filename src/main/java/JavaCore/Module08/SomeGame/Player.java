package JavaCore.Module08.SomeGame;

public class Player extends Human {
    //    Backpack backpack;// alternate
    Backpack backpack = new Backpack();

    public Player(String name) {
        super(name + " the Player");
//        backpack = new Backpack();// alternate
    }

    class Backpack {
        String staff = "";

        private void put(String newStaff) {
            staff += newStaff + ", ";
        }

        public String toString() {
            if (staff.equals("")) {
                return "the backpack is empty";
            }
            return staff.substring(0, staff.length() - 1) + " in the backpack";
        }
    }

    public void take(String newStaff) {
        backpack.put(newStaff);
    }
}