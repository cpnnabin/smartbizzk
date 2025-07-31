package SmartBizzk.SmartBizzk.service;

import SmartBizzk.SmartBizzk.entity.Settings;
import java.util.List;

public interface SettingsService {
    List<Settings> getAllSettings();
    Settings getSettingsById(Long id);
    Settings saveSettings(Settings settings);
    void deleteSettings(Long id);
}
