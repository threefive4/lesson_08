package ua.lviv.lgs;

public enum Months {
    JANUARY(31, Seasons.WINTER),
    FEBRUARY(28, Seasons.WINTER),
    MARCH(31, Seasons.SPRING),
    APRIL(30, Seasons.SPRING),
    MAY(31, Seasons.SPRING),
    JUNE(30, Seasons.SUMMER),
    JULY(31, Seasons.SUMMER),
    AUGUST(30, Seasons.SUMMER),
    SEPTEMBER(31, Seasons.FALL),
    OCTOBER(30, Seasons.FALL),
    NOVEMBER(31, Seasons.FALL),
    DECEMBER(30, Seasons.WINTER);

    private int days;
    private Seasons season;

    Months(int days, Seasons season) {
        this.days = days;
        this.season = season;
    }

    public int getDays() {
        return days;
    }

    public Seasons getSeason() {
        return season;
    }
}
