public class Laptop {

    private final int laptopBatteryCapacity;
    private final boolean gamingCapability;
    private final String laptopServiceWarranty;
    private final String laptopSize;
    private final String laptopName;

    public Laptop(Builder builder) {
        this.laptopBatteryCapacity = builder.laptopBatteryCapacity;
        this.gamingCapability = builder.gamingCapability;
        this.laptopServiceWarranty = builder.laptopServiceWarranty;
        this.laptopSize = builder.laptopSize;
        this.laptopName = builder.laptopName;


    }


    static class Builder{
        private int laptopBatteryCapacity;
        private boolean gamingCapability;
        private String laptopServiceWarranty;
        private String laptopSize;
        private String laptopName;

        public Laptop build(){
            return  new Laptop(this);
        }
        public Builder(String laptopName){
            this.laptopName = laptopName;

        }
        public Builder laptopBatteryCapacity(int laptopBatteryCapacity){
            this.laptopBatteryCapacity=laptopBatteryCapacity;
            return this;
        }


        public Builder gamingCapability(boolean gamingCapability){
            this.gamingCapability=gamingCapability;
            return this;
        }

        public Builder laptopServiceWarranty(String laptopServiceWarranty){
            this.laptopServiceWarranty=laptopServiceWarranty;
            return this;
        }


        public Builder laptopSize(String laptopSize){
            this.laptopSize=laptopSize;
            return this;
        }

    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptopBatteryCapacity=" + laptopBatteryCapacity +
                ", gamingCapability=" + gamingCapability +
                ", laptopServiceWarranty='" + laptopServiceWarranty + '\'' +
                ", laptopSize='" + laptopSize + '\'' +
                ", laptopName='" + laptopName + '\'' +
                '}';
    }
}
