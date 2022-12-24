package ru.mirea.lab6.task10;

public class Processor {
    private final String name;
    private final int core;
    private final double clockRate;

    public Processor(String name, int core, double clockRate) {
        this.name = name;
        this.core = core;
        this.clockRate = clockRate;
    }

    public String getName() {
        return name;
    }

    public int getCore() {
        return core;
    }

    public double getClockRate() {
        return clockRate;
    }

    public boolean matchInComponents(String s){
        return name.toLowerCase().contains(s) || String.valueOf(core).contains(s) || String.valueOf(clockRate).equals(s);
    }
}

