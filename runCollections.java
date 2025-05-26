import java.util.ArrayList;
public class runCollections {
    ArrayList<run> runs = new ArrayList<>();
    public void addRun(run newRun) {
        runs.add(newRun);
    }
    public void addRunString(String runString) {
        String[] parts = runString.split(", ");
        double runDate = Double.parseDouble(parts[1]);
        double runDist = Double.parseDouble(parts[2]);
        double runTime = Double.parseDouble(parts[3]);
        // Check if the first part is training or racing
        System.out.println(parts[0]);
        if (parts[0].contains("training")){
            double targetDist = Double.parseDouble(parts[3]);
            String notes = parts[4];

            run newTrainingRun = new trainingRun(runDate, runDist, runTime, targetDist, notes);
            runs.add(newTrainingRun);
            System.out.println(runs + "hi")    ;
            System.out.println("Run Added");
        } else if (parts[0].contains("race")) {
            double placement = Double.parseDouble(parts[3]);
            String raceName = parts[4];
            run newRaceRun = new raceRun(runDate, runDist, runTime, placement, raceName);
            runs.add(newRaceRun);
            System.out.println("Run Added");


        }
    }
    public void printRuns() {
        System.out.println("Total Runs");
        for (run r : runs) {
            System.out.println("Run Date: " + r.getRunDate() + ", Distance: " + r.runDist + " km, Time: " + r.runTime + " seconds, Pace: " + r.getPace() + " min/km");
            
        }
    }
    public void sortRunsByDistance(){
        
    }

}
