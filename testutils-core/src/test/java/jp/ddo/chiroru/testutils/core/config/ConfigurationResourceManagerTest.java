package jp.ddo.chiroru.testutils.core.config;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class ConfigurationResourceManagerTest {

    @Test
    public void コンフィグレーションリソース定義ＸＭＬの内容をロードできる()
            throws Exception {
        ConfigurationResourceManager manager = ConfigurationResourceManager.getManager();
        String path1 = manager.getResourcePath("resource1");
        assertThat(path1, is("file1"));
        String path2 = manager.getResourcePath("resource2");
        assertThat(path2, is("file2"));
    }
}
