import java.io.IOException;
import java.io.PrintWriter;

public class writeFinal {
     public static void editFile(runCollections runs) {
        try (PrintWriter out = new PrintWriter("redone.txt")) {
            for (run r : runs.runs) {
                if (r instanceof trainingRun) {
                    trainingRun tr = (trainingRun) r;
                    out.println("Training Run: ");
                    out.println(tr.getDetails());
                    out.println("");
                } else if (r instanceof raceRun) {
                    raceRun rr = (raceRun) r;
                    out.println("Race Run:");
                    out.println(rr.getDetails());
                                        out.println("");

                }   
            }
            out.println("Total Runs: " + runs.runs.size());
            out.println("Longest Run By Distance: " + runs.runs.get(runs.runs.size() - 1).runDist + " km");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
