package it.euris.ires.testDoubles;

public class LoggerImpl implements ILogger {

  @Override
  public void append(String text) {
    throw new RuntimeException();
  }
}
