package ru.mirea.lab4.task4;

public class Memory {
    private final String type;
    private final int diskSpace;

    public Memory(String type, int diskSpace) {
        this.type = type;
        this.diskSpace = diskSpace;
    }

    public String getType() {
        return type;
    }

    public int getDiskSpace() {
        return diskSpace;
    }
}
