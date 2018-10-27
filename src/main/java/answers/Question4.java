package answers;

public class Question4 {

    public static int selectionFailedTradedesks(String[][] rows, int numberMachines) {
        // TODO Auto-generated method stub
        int mintime = Integer.MAX_VALUE;
        int j = rows[0].length - numberMachines;
        int tempmin = 0;
        for (String[] row : rows) {
            System.out.println(Arrays.toString(row));
            for (int i = 0; i <= j; i++) {
                tempmin = 0;
                for (int k = 0; k < numberMachines; k++) {
                    try {
                        tempmin += Integer.parseInt(row[i + k]);
                    } catch (Exception e) {
                        tempmin = 0;
                    }
                }
                if (tempmin != 0) {
                    mintime = Math.min(mintime, tempmin);
                }
            }
        }
        return mintime;
    }

    public static void main(String[] args) {
        String[][] arr = { { "1", "2", "3", "4" }, { "1", "X", "2", "X" }, { "1", "X", "1", "1" } };
        System.out.println(selectionFailedTradedesks(arr, 4));
    }

}
