package entry.level.task.infrastructure.adapter.commandline;

import entry.level.task.domain.model.PairInteger;

import java.util.List;

public interface OutputResult {
    void print(List<PairInteger> pairResultList);
}
