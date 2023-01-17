package Controllers;

import Model.Repository;
import Model.Record;

import java.util.List;

public class RecordController {
    private final Repository repository;

    public RecordController(Repository repository) {
        this.repository = repository;
    }

    public void saveRecord(Record record) throws Exception {
        try {
            repository.createRecord(record);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}