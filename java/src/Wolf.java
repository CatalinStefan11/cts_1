public class Wolf implements Runner {

    private static final int WOLF_SPEED = 30;

    public Wolf() {

    }


    @Override
    public String toString() {
        return super.toString() + "Wolf{" +
                "WOLF_SPEED=" + WOLF_SPEED +
                '}';
    }


    @Override
    public int getSpeed() {
        return WOLF_SPEED;
    }
}
