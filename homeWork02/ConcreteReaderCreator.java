package homeWork02;

import homeWork02.Readers.DataBaseReader;
import homeWork02.Readers.LogReader;
import homeWork02.Readers.OperationSystemLogEventReader;
import homeWork02.Readers.PoemReader;
import homeWork02.Readers.TextFileReader;

public class ConcreteReaderCreator extends BaseLogReaderCreator {

  @Override
  protected LogReader createLogReaderInstance(LogType logType) {
   return switch (logType) {
    case Poem -> new PoemReader();
    case Text -> new TextFileReader();
    case Database -> new DataBaseReader();
    case System -> new OperationSystemLogEventReader();
  };
  }
}
