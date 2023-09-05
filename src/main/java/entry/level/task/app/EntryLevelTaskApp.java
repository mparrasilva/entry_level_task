package entry.level.task.app;

import entry.level.task.domain.model.InputDataRequest;
import entry.level.task.domain.model.PairInteger;
import entry.level.task.domain.usecase.PairIntegerUseCase;
import entry.level.task.domain.usecase.PairIntegerUseCaseImpl;
import entry.level.task.infrastructure.adapter.commandline.InputLine;
import entry.level.task.infrastructure.adapter.commandline.InputLineImpl;
import entry.level.task.infrastructure.adapter.commandline.OutputResult;
import entry.level.task.infrastructure.adapter.commandline.OutputResultImpl;
import lombok.RequiredArgsConstructor;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
public class EntryLevelTaskApp implements TaskApp{

    private final InputLine inputLine;
    private final InputDataRequest inputDataRequest;
    private final PairIntegerUseCase pairIntegerService;
    private final OutputResult outputResult;


    @Override
    public void runApp(){

        try {

            inputDataRequest.setValuesList(inputLine.readInputList());
            inputDataRequest.setTargetValue(inputLine.readTargetValue());

            List<PairInteger> pairsResult = pairIntegerService.getPairIntegerSumOf
                    (inputDataRequest.getValuesList(), inputDataRequest.getTargetValue());

            outputResult.print(pairsResult);

        }catch (IOException ioException)
        {
            System.out.println("Error reading the command line, please try again.");
        }catch (NumberFormatException numberFormatException)
        {
            System.out.println("You have entered a NON number value, check your input!!! ");
        }

    }


    public static void  main( String[] args ) {

        TaskApp app =
                new EntryLevelTaskApp(
                          new InputLineImpl()
                        , new InputDataRequest()
                        , new PairIntegerUseCaseImpl()
                        , new OutputResultImpl());
        app.runApp();

    }

}
