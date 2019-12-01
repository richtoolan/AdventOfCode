import java.io.*;

public class AdventOfCodeOne {

    public static int calculateFuel(double mass) {

        double sum = (Math.floor(mass/3.0)-2.0);

        if(sum<= 0){
            return 0;
        }

        return (int)sum + calculateFuel(sum);
    }

    public static void main(String args[]) throws IOException {
        File testInput = new File("src/main/resources/adventOfCodeOneInput.txt");
        BufferedReader testInputReader = new BufferedReader(new FileReader(testInput));

        String nextModule;
        int totalFuel = 0;

        while((nextModule = testInputReader.readLine()) != null) {
            totalFuel += AdventOfCodeOne.calculateFuel(Double.parseDouble(nextModule));
        }

        System.out.println(totalFuel);
    }
}

