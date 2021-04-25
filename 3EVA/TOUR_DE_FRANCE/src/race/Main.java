package race;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<CyclingStage> stagesVoid = FileUtils.loadStats();

        Scanner sc = new Scanner(System.in);

        String optionMenu = "";

        do {
            System.out.println("1 - Add Stage");
            System.out.println("2 - Show Winner");
            System.out.println("3 - Top Winner");
            System.out.println("0 - Exit");

            optionMenu = sc.nextLine();

            switch (optionMenu) {

                case "1":
                    System.out.println("Enter (yyyy-mm-dd)");

                    String date = sc.nextLine();

                    System.out.println("Enter km");

                    float kilometres = Float.parseFloat(sc.nextLine());

                    System.out.println("Enter winner name");

                    String winner = sc.nextLine();

                    CyclingStage c = new CyclingStage(date, kilometres, winner);

                    if (!isOnStages(c, stagesVoid)) {
                        stagesVoid.add(c);
                        FileUtils.saveStats(stagesVoid);
                    } else
                        System.out.println("Error, date already exist");
                    break;
                case "2":
                    List<CyclingStage> winners = new ArrayList<>();

                    for (CyclingStage stageC : stagesVoid) {

                        if (!isOnWinners(stageC, winners))

                            winners.add(stageC);
                    }
                    for (CyclingStage stage : winners) {

                        System.out.println(stage.getWinner());
                    }
                    break;

                case "3":
                    System.out.println(findTopWinner(stagesVoid));
                    break;

                case "0":

                    break;

                default:
                    System.out.println("No valid option");
                    break;
            }
        }
        while (!optionMenu.equals("0"));
    }

    public static boolean isOnStages(CyclingStage stage, List<CyclingStage> stages) {
        boolean found = false;

        for (CyclingStage c : stages) {
            if (c.getDate().equals(stage.getDate())) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static boolean isOnWinners(CyclingStage stage, List<CyclingStage> winners) {
        boolean found = false;

        for (CyclingStage c : winners) {
            if (c.getWinner().equals(stage.getWinner())) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static String findTopWinner(List<CyclingStage> stages) {
        HashMap<String, Integer> winners = new HashMap<String, Integer>();

        for (CyclingStage c : stages) {
            if (!winners.containsKey(c.getWinner())){
                winners.put(c.getWinner(), 1);
            }
            else {
                winners.put(c.getWinner(), winners.get(c.getWinner()) + 1);
            }
        }

    Map.Entry<String, Integer> maxEntry = null;

    for(Map.Entry<String, Integer> entry : winners.entrySet()){
        if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
            maxEntry = entry;
        }

    }
    return maxEntry.getKey();
    }
}

