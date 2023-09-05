package entry.level.task.infrastructure.adapter.commandline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class InputLineImpl implements InputLine{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public List<String> readInputList(  ) throws IOException {
        System.out.println("Enter Values List: ");
        String str = br.readLine();

        return Arrays.asList( str.split(",") );
    }

    @Override
    public Integer readTargetValue(  ) throws IOException {
        System.out.println("Enter Target Value: ");
        String targetValue = br.readLine();

        return Integer.parseInt( targetValue );
    }

}
