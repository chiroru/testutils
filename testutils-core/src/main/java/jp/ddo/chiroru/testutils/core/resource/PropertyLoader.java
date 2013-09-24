package jp.ddo.chiroru.testutils.core.resource;

import java.io.IOException;
import java.util.Properties;

public interface PropertyLoader {

    Properties load(String path) throws IOException;
}
