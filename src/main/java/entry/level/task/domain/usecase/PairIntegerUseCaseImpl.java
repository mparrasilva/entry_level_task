package entry.level.task.domain.usecase;

import entry.level.task.domain.model.PairInteger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class PairIntegerUseCaseImpl implements PairIntegerUseCase {


    @Override
    public List<PairInteger> getPairIntegerSumOf(List<String> valuesList, Integer targetValue){
        AtomicReference<List<String>> auxValuesList = new AtomicReference<>(valuesList);
        List<PairInteger> pairIntegerList = new ArrayList<>();
        valuesList.forEach( x -> {
            auxValuesList.set(
                    auxValuesList.get().stream()
                            .filter(y -> !y.equals(x))
                            .collect(Collectors.toList())
            );

            auxValuesList.get().forEach(y -> {
                if( (Integer.parseInt(x) + Integer.parseInt(y)) == targetValue){
                    pairIntegerList.add( new PairInteger( x, y ));
                }
            });
        });

        return pairIntegerList;
    }

}
