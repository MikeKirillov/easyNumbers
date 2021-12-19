package JavaCore.Module08.SelfTask;

public class Xbox {// outer class
    private String name = "Xbox";
    private String model;
    private int year;
    private boolean hasBluetooth, hasWiFi, isWorking;

    public Xbox(String model, int year) {
        this.model = model;
        this.year = year;
        if (year >= 2020 || (model.equals("Series S") || model.equals("Series X"))) {
            hasBluetooth = true;
            hasWiFi = true;
        }
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public boolean isHasWiFi() {
        return hasWiFi;
    }

    public String getName() {
        return name;
    }

    public boolean getWorkingState() {
        return isWorking;
    }

    @Override
    public String toString() {
        class Features {// local inner class

            String bluetooth() {
                if (!isHasBluetooth())
                    return "bluetooth - no";
                else
                    return "bluetooth - yes";
            }

            String wifi() {
                if (!isHasWiFi())
                    return "wifi - no";
                else
                    return "wifi - yes";
            }
        }

        Features features = new Features();

        return "name: " + getName() + "\n" +
                "model: " + getModel() + "\n" +
                "year: " + getYear() + "\n" +
                "other features: " + features.bluetooth() + ", " + features.wifi();
    }

    public void turnPower(String mode) {
        class PowerMode {// method local class

            PowerMode(String mode) {
                if (!Xbox.this.isWorking && mode.equalsIgnoreCase("on"))
                    Xbox.this.isWorking = true;
                else if (Xbox.this.isWorking && mode.equalsIgnoreCase("off"))
                    Xbox.this.isWorking = false;
            }
        }
        PowerMode powerMode = new PowerMode(mode);
    }

    ;

    class Controller {// inner class
        private boolean isWireless, compatible;

        public Controller(boolean isWireless) {
            this.isWireless = isWireless;
            compatible = isWireless;// if Controller is wireless then its compatible to Xbox
        }

        @Override
        public String toString() {
            if (compatible)
                return "current controller is compatible to your Xbox! \nhave fun playing games \ndon't forget to visit Xbox Games Store";
            else
                return "yikes! \nseems like your controller ain't compatible to Xbox :( \ntry another one";
        }
    }
}
