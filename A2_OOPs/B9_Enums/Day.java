package A2_OOPs.B9_Enums;

public enum Day {

    // constants
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

    private final int dayNumber;

    Day(int dayNumber) {
        this.dayNumber = dayNumber; 
    }

    public int getDayNumber() {
        return this.dayNumber;
    }

}
