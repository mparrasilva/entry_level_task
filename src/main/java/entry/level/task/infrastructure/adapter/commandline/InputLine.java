package entry.level.task.infrastructure.adapter.commandline;

import java.io.IOException;
import java.util.List;

public interface InputLine {


    List<String> readInputList(  ) throws IOException;

    Integer readTargetValue(  ) throws IOException;
}
