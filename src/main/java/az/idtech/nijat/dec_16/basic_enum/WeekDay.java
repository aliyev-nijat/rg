package az.idtech.nijat.dec_16.basic_enum;

public enum WeekDay {

    SUNDAY(true),
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true);

    private final boolean isWeekend;

    WeekDay(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public void showAbout() {
        System.out.println(isWeekend ? "weekend" : "weekday");
    }
}
