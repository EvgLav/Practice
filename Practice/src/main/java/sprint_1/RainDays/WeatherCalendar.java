package sprint_1.RainDays;

class WeatherCalendar {
    String month;
    int numberOfDays;
    int rainyDays;
    int year;
    boolean isRainyMonth;

    // Увеличить переменную rainyDays на единицу
    public void addRainyDay() {
            rainyDays += 1;
    }

    public boolean meaningRainiDay () {
        if (rainyDays >= 10) {
            isRainyMonth = true;

        }
        return false;
    }

    public void setRainyMonth(boolean rainyMonth) {
        isRainyMonth = rainyMonth;
    }
}