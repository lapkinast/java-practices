package ru.mirea.lab6.task10;

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

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Brand getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Laptop " + brand.getName() +":\n processor(Type: " +
                processor.getName() + ", Core: " + processor.getCore() + ", Clock rate: " + processor.getClockRate() + " Ghz),\n" +
                " memory(" + memory.getDiskSpace() + " GB " + memory.getType() + "),\n " +
                "monitor(Type: " + monitor.getMatrixType()+ ", " + monitor.getScreenSize() + " inch)\n";
    }
}
