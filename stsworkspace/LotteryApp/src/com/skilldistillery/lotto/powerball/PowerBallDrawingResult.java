package com.skilldistillery.lotto.powerball;

import java.util.List;

public class PowerBallDrawingResult {
  private List<Integer> winners;
  private Integer powerBall;
  public List<Integer> getWinners() {
    return winners;
  }
  public void setWinners(List<Integer> winners) {
    this.winners = winners;
  }
  public Integer getPowerBall() {
    return powerBall;
  }
  public void setPowerBall(Integer powerBall) {
    this.powerBall = powerBall;
  }
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Power Ball Drawing Result [ Winners: ").append(winners).append("  ||   Power Ball: ").append(powerBall)
        .append(" ]");
    return builder.toString();
  }
  public PowerBallDrawingResult(List<Integer> winners, Integer powerBall) {
    super();
    this.winners = winners;
    this.powerBall = powerBall;
  }

}
