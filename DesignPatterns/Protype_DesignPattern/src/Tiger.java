public class Tiger extends  Animal{
    private int colorCode;

    public int getColorCode() {
        return colorCode;
    }

    public void setColorCode(int colorCode) {
        this.colorCode = colorCode;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "colorCode=" + colorCode +
                '}';
    }
}
