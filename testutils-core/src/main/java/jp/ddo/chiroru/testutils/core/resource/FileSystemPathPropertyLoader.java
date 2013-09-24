package jp.ddo.chiroru.testutils.core.resource;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileSystemPathPropertyLoader
        extends CachingPropertyLoader
        implements PropertyLoader {

    private final static FileSystemPathPropertyLoader instance = new FileSystemPathPropertyLoader();

    public static FileSystemPathPropertyLoader getInstance() {
        return instance;
    }

    @Override
    protected InputStream getResourceAsStream(String path) {
        BufferedInputStream bis;
        try {
            bis = new BufferedInputStream(new FileInputStream(path));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Can't load the file[" + path + "].");
        }
        return bis;
    }
}
