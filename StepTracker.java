public class StepTracker {
    private int active;
    private int stepCount = 0;
    private int days = 0;
    private int activeDays;
    public StepTracker(int steps) {
        active = steps;
    }
    public void addDailySteps(int steps) {
        stepCount += steps;
        days ++;
        if (steps > active) activeDays++;
    }

    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
        if (days == 0) return 0.0;
        return (double) stepCount / days;
    }


}