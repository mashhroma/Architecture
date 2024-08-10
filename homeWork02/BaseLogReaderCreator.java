package homeWork02;

import homeWork02.Readers.LogReader;

public abstract class BaseLogReaderCreator {

  protected LogReader createLogReader(LogType logType, Object data, Integer currentPosition) {
    LogReader logReader = createLogReaderInstance(logType);
    logReader.setDataSource(data);
    logReader.setCurrentPosition(currentPosition);

    return logReader;
    }

  protected abstract LogReader createLogReaderInstance(LogType logType);
  
}