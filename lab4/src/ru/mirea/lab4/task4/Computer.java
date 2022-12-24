package ru.mirea.lab4.task4;

public class Computer {
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private Brand brand;

    public Computer(Processor processor, Memory memory, Monitor monitor, Brand brand) {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.brand = brand;
    }

    public static void main(String[] args) {
        Computer[] computers = {
                new Computer(new Processor("Apple M1", 8, 3.2),
                        new Memory("SSD", 512),
                        new Monitor("IPS", 13.3),
                        Brand.APPLE),
                new Computer(new Processor("AMD Ryzen 9", 8, 4.9),
                        new Memory("SSD", 1000),
                        new Monitor("IPS", 16),
                        Brand.ASUS),
                new Computer(new Processor("Intel Core i7", 4, 2.8),
                        new Memory("SSD", 512),
                        new Monitor("IPS", 14),
                        Brand.LENOVO)
        };

        for (Computer computer : computers){
            System.out.printf("Laptop %s:%n processor(Type: %s, Core: %d, Clock rate: %.1f Ghz),%n" +
                            " memory(%d GB %s),%n monitor(Type: %s, %.1f inch)%n", computer.brand.getName(),
                    computer.processor.getName(), computer.processor.getCore(), computer.processor.getClockRate(),
                    computer.memory.getDiskSpace(), computer.memory.getType(),
                    computer.monitor.getMatrixType(), computer.monitor.getScreenSize());
        }
    }
}
