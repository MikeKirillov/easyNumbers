package JavaCore.Module07.Selftask;

public abstract class MotorVehicle extends Vehicle {
    public int exhaustSoundLvl;

    public MotorVehicle(String brand, String model, int hp, int topSpeed) {
        super(brand, model, hp, topSpeed);
        System.out.println(getFullName() + " was built!");
    }

    public int getExhaustSoundLvl() {
        return exhaustSoundLvl;
    }

    public void setExhaustSoundLvl(int exhaustSoundLvl){
        this.exhaustSoundLvl = exhaustSoundLvl;
    }
}
