package jp.ddo.chiroru.testutils.core.resource;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.io.File;
import java.util.Properties;

import org.junit.Test;


public class FileSystemPathPropertyLoaderTest {
    
    @Test
    public void プロパティファイルをロードできる()
            throws Exception {
        FileSystemPathPropertyLoader loader = FileSystemPathPropertyLoader.getInstance();
        String propertyFilePath = (new File(".")).getAbsolutePath() + "\\src\\test\\resources\\jp\\ddo\\chiroru\\testutils\\core\\resource\\test.properties";
        Properties props = loader.load(propertyFilePath);
        assertThat(props.getProperty("key1"), is("value1"));
        assertThat(props.getProperty("key2"), is("value2"));
    }
}
