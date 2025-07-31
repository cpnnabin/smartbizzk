package SmartBizzk.SmartBizzk.service;

import SmartBizzk.SmartBizzk.entity.Record;
import java.util.List;

public interface RecordService {
    List<Record> getAllRecords();
    Record getRecordById(Long id);
    Record saveRecord(Record record);
    void deleteRecord(Long id);
}
