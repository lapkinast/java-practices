package ru.mirea.lab4.task1;

public enum Season {
    WINTER(-6),
    SPRING(6),
    SUMMER(18),
    AUTUMN(6);

    private final int avrTemp;

    Season(int avrTemp) {
        this.avrTemp = avrTemp;
    }

    public int getAvrTemp() {
        return avrTemp;
    }

    public String getDescription(){
       if (this == SUMMER) {
            return "Warm season";
        }
        return "Cold season";
    }
}
