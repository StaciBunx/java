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
        // validateRecord(record);
        repository.createRecord(record);
    }

    // private void validateRecord(Record record) throws Exception {
    //     int length = 6;
    //     try

    //     }
    }
