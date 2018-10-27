package answers;

public class Question4 {

    public static int selectionFailedTradedesks(String[][] rows, int numberMachines) {
        // TODO Auto-generated method stub
        int mintime = Integer.MAX_VALUE;
        int j = rows[0].length - numberMachines;
        int tempmin = 0;
        for (String[] row : rows) {
            for (int i = 0; i <= j; i++) {
                tempmin = 0;
                for (int k = 0; k < numberMachines; k++) {
                    try {
                        tempmin += Integer.parseInt(row[i + k]);
                    } catch (Exception e) {
                        tempmin = 0;
                        k=numberMachines;
                    }
                }
                if (tempmin != 0) {
                    mintime = Math.min(mintime, tempmin);
                }
            }
        }
        return mintime;
    }
}
