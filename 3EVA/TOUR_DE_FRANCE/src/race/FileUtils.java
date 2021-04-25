package race;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.*;


public class FileUtils {

    public static List<CyclingStage> loadStats(){

        List<CyclingStage> stagesVoid = new ArrayList<>();

        if (! (new File("stats.txt").exists())) {
            System.out.println("Error");
            return stagesVoid;
        }

        try {
                BufferedReader inputFile = new BufferedReader(
                        new FileReader(new File("stats.txt"))
                );

                String line = inputFile.readLine();
                while (line != null){
                    String[] data = line.split(";");
                    stagesVoid.add(new CyclingStage(data[0], Float.parseFloat(data[1]), data[2]));
                    line = inputFile.readLine();
                }
                inputFile.close();
        }
        catch (IOException fileError){
                System.out.println(fileError.getMessage());
        }
        return stagesVoid;
    }

    public static void saveStats(List<CyclingStage> stagesVoid){

        PrintWriter printWriter = null;
        Collections.sort(stagesVoid);

        try{
            printWriter = new PrintWriter("stats.txt");

            for (CyclingStage c : stagesVoid){
                printWriter.println(c.getDate() + ";" + c.getKilometres() + ";" + c.getWinner());
            }

            System.out.println("al toque mi pana");
        }
        catch (IOException fileError) {
            System.out.println(fileError.getMessage());
        }
        finally {
            if (printWriter != null){
                printWriter.close();
            }
        }

    }
}
