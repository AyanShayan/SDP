public class Main {
    public static void main(String[] args) {
        Laptop gameLaptop = new Laptop.Builder()
                .setCPU("Intel i9")
                .setRAM(32)
                .setStorage(1000)
                .enableDedicatedGPU(true)
                .enableTouchscreen(false)
                .build();

        Laptop ultrabook = new Laptop.Builder()
                .setCPU("Intel i5")
                .setRAM(16)
                .setStorage(512)
                .enableDedicatedGPU(false)
                .enableTouchscreen(true)
                .build();

        Laptop budgetLaptop = new Laptop.Builder()
                .setCPU("AMD Ryzen 5")
                .setRAM(8)
                .setStorage(256)
                .enableDedicatedGPU(false)
                .enableTouchscreen(false)
                .build();

        System.out.println(gameLaptop);
        System.out.println(ultrabook);
        System.out.println(budgetLaptop);
    }
}
