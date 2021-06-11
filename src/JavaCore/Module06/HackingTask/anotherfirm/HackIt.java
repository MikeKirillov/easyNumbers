package JavaCore.Module06.HackingTask.anotherfirm;

public class HackIt {
    public static void main(String[] args) {
        Hack hack = new Hack();
        hack.getSecret();
    }
}

class Hack extends Secret {
    @Override
    public void getSecret() {
        super.getSecret();
    }
}