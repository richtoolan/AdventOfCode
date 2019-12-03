package days;

import utils.InputLineToObject;
import utils.InputToList;

import java.io.*;
import java.util.List;

public class AdventOfCodeOne {

    public static int calculateFuel(double mass) {

        double sum = (Math.floor(mass/3.0)-2.0);

        if(sum<= 0){
            return 0;
        }

        return (int)sum + calculateFuel(sum);
    }

    public static void main(String args[]) throws IOException {
        InputToList<Double> inputToList = new InputToList<>();

        InputLineToObject<Double> converter = Double::parseDouble;

        List<Double> listOfModules = inputToList.getListFromInputPath("src/main/resources/adventOfCodeOneInput.txt", converter);


        Double nextModule;
        int totalFuel = 0;

        listOfModules.stream().map(AdventOfCodeOne::calculateFuel).

        while((nextModule = listOfModules.iterator().next()) != null) {
            totalFuel += AdventOfCodeOne.calculateFuel(nextModule);
        }

        System.out.println(totalFuel);
    }

    private static BufferedReader getBufferedReaderForPath(String path) throws FileNotFoundException {
        File testInput = new File(path);
        return new BufferedReader(new FileReader(testInput));
    }
}

