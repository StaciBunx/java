package Model;

import java.util.List;

public interface Repository {
    List<Record> getAllRecords() throws Exception;
    void createRecord(Record record) throws Exception;
}
