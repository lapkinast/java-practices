package ru.mirea.lab6.task10;

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

    public boolean matchInComponents(String s){
        return type.toLowerCase().contains(s) || String.valueOf(diskSpace).contains(s);
    }
}
