package entry.level.task.domain.usecase;

import entry.level.task.domain.model.PairInteger;

import java.util.List;

public interface PairIntegerUseCase {
    List<PairInteger> getPairIntegerSumOf(List<String> valuesList, Integer targetValue);
}
