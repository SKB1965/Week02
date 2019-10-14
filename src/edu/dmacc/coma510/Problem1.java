package edu.dmacc.coma510;

public class Problem1 {
    public static void main(String[] args) {

        double numberOfPlateAppearances = 100;
        double numberOfWalks = 4;
        int numberOfHits = 24;

        double calculatedBattingAverage = numberOfHits / (numberOfPlateAppearances - numberOfWalks);

        System.out.println(calculatedBattingAverage); // 0.25
    }
}
