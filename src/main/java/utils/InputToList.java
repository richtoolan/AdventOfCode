package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InputToList<T> {

    public List<T> getListFromInputPath(String path, InputLineToObject<T> converter) throws IOException {
        BufferedReader testInputReader = getBufferedReaderForPath(path);

        String nextModule;

        List<T> values = new ArrayList<>();

        while((nextModule = testInputReader.readLine()) != null) {
            values.add(converter.convert(nextModule));
        }

        return values;
    }

    private static BufferedReader getBufferedReaderForPath(String path) throws FileNotFoundException {
        File testInput = new File(path);
        return new BufferedReader(new FileReader(testInput));
    }
}
