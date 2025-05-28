public class run {
    // date stored in YYYYMMDD format
    public double runDate;
    // in km
    public double runDist;
    // run time in seconds
    public double runTime;

    public double getPace() {
        return (runTime * 60) / (runDist/1000);
    }
    public double getRunDate() {
        return runDate;
    } 
    public run(double runDate, double runDist, double runTime) {
        this.runDate = runDate;
        this.runDist = runDist;
        this.runTime = runTime;
    }
}

 class trainingRun extends run {
    // dist in km
    public double targetDist;
    
    public double getTargetDist() {
        return targetDist;
    }

    public String notes;

    public void printNotes() {
        System.out.println("Run Notes: " + notes);
    }
    public trainingRun(double runDate, double runDist, double runTime, double targetDist, String notes) {
        super(runDate, runDist, runTime);
        this.targetDist = targetDist;
        this.notes = notes;
    }
    public String getDetails(){
                String dateString = dateConverter.convert(runDate);

        return "Run Date: " + dateString + ", Distance: " + runDist + " km, Time: " + runTime + " seconds, Target Distance: " + targetDist + " km, Pace: " + getPace() + "km/s Notes: " + notes;
    }
    public void printDetails() {
        System.out.println("Target Distance: " + targetDist + " km, Notes: " + notes);
    }
}
class raceRun extends run {
    public double placement;
    
    public String raceName;
    public raceRun(double runDate, double runDist, double runTime, double placement, String raceName) {
        super(runDate, runDist, runTime);
        this.placement = placement;
        this.raceName = raceName;
    }
    public void printDetails() {
        System.out.println("Race Name: " + raceName + ", Placement: " + placement);
    }
    public String getDetails() {
        String dateString = dateConverter.convert(runDate);
        return "Run Date: " + dateString + ", Distance: " + runDist + " km, Time: " + runTime + " seconds, Pace: " + getPace() + "km/s, Placement: " + placement;
    }
}