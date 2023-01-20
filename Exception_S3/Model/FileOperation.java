package Model;
import java.util.List;

public interface FileOperation {
    void saveAll(List<String> lines);
    List<String> readAll();
    String setFileName(Record record);
}
