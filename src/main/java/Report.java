public class Report {

    private int topPerformersThreshold;
    private boolean useExprienceMultiplier;
    private int periodLimit;

    public Report(int topPerformersThreshold, boolean useExprienceMultiplier, int periodLimit) {
        this.setTopPerformersThreshold(topPerformersThreshold);
        this.setUseExprienceMultiplier(useExprienceMultiplier);
        this.setPeriodLimit(periodLimit);
    }

    public int getTopPerformersThreshold() {
        return topPerformersThreshold;
    }

    public void setTopPerformersThreshold(int topPerformersThreshold) {
        this.topPerformersThreshold = topPerformersThreshold;
    }

    public boolean isUseExprienceMultiplier() {
        return useExprienceMultiplier;
    }

    public void setUseExprienceMultiplier(boolean useExprienceMultiplier) {
        this.useExprienceMultiplier = useExprienceMultiplier;
    }

    public int getPeriodLimit() {
        return periodLimit;
    }

    public void setPeriodLimit(int periodLimit) {
        this.periodLimit = periodLimit;
    }
}
