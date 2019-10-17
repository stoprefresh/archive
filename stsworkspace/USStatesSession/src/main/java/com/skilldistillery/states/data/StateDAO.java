package com.skilldistillery.states.data;

public interface StateDAO {
  public State getStateByName(String name);
  public State getStateByAbbreviation(String abbreviation);
  void addState(State state);
  public State getNextState(State state);
  public State getLastState(State state);
}
