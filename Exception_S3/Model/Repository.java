package Model;

import java.util.List;

public interface Repository {
    List<Record> getAllRecords();
    void createRecord(Record record) throws Exception;
}
