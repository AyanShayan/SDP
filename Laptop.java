
public class Laptop {
    private final String cpu;
    private final int ram;
    private final int storage;
    private final boolean hasDedicatedGPU;
    private final boolean hasTouchscreen;

    private Laptop(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.hasDedicatedGPU = builder.hasDedicatedGPU;
        this.hasTouchscreen = builder.hasTouchscreen;
    }

    @Override
    public String toString() {
        return "Laptop {" +
                "CPU='" + cpu + '\'' +
                ", RAM=" + ram + "GB" +
                ", Storage=" + storage + "GB" +
                ", Dedicated GPU=" + hasDedicatedGPU +
                ", Touchscreen=" + hasTouchscreen +
                '}';
    }


    public static class Builder {
        private String cpu;
        private int ram;
        private int storage;
        private boolean hasDedicatedGPU;
        private boolean hasTouchscreen;

        public Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRAM(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder enableDedicatedGPU(boolean value) {
            this.hasDedicatedGPU = value;
            return this;
        }

        public Builder enableTouchscreen(boolean value) {
            this.hasTouchscreen = value;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }
}

