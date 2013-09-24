package jp.ddo.chiroru.testutils.core.config;

import java.io.IOException;
import java.util.Properties;

import jp.ddo.chiroru.testutils.core.resource.ClassPathPropertyLoader;

public class ConfigurationResourceManager {

    private static ConfigurationResourceManager instance = new ConfigurationResourceManager();

    private final static String CONFIGURATION_RESOUCE_DEFINITION_FILE_PATH = "ConfigurationResource.xml";

    private Properties props = null;

    private ConfigurationResourceManager() {
        ClassPathPropertyLoader loader = ClassPathPropertyLoader.getInstance();
        try {
            props = loader.load(CONFIGURATION_RESOUCE_DEFINITION_FILE_PATH);
        } catch (IOException e) {
            throw new RuntimeException("Can't load the file[" + CONFIGURATION_RESOUCE_DEFINITION_FILE_PATH + "].");
        }
    }

    public static ConfigurationResourceManager getManager() {
        return instance;
    }

    public String getResourcePath(String id) {
        return props.getProperty(id);
    }
}
