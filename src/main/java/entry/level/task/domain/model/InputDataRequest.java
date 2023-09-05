package entry.level.task.domain.model;

import java.util.List;

public class InputDataRequest {


    List<String> valuesList;


    Integer targetValue;
    public List<String> getValuesList() {
        return valuesList;
    }

    public void setValuesList(List<String> valuesList) {
        this.valuesList = valuesList;
    }

    public Integer getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(Integer targetValue) {
        this.targetValue = targetValue;
    }

}
