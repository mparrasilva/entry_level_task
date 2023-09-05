package entry.level.task.domain.model;

public class PairInteger {

    public PairInteger(String positionOne, String positionTwo) {
        this.positionOne = Integer.parseInt(positionOne);
        this.positionTwo = Integer.parseInt(positionTwo);
    }

    Integer positionOne;
    Integer positionTwo;

    public Integer getPositionOne() {
        return positionOne;
    }

    public void setPositionOne(Integer positionOne) {
        this.positionOne = positionOne;
    }

    public Integer getPositionTwo() {
        return positionTwo;
    }

    public void setPositionTwo(Integer positionTwo) {
        this.positionTwo = positionTwo;
    }

}
