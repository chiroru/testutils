package jp.ddo.chiroru.testutils.core.jdbc;

public class JDBCConnectionInfoManager {

    private static JDBCConnectionInfoManager instance = new JDBCConnectionInfoManager();
    
    private JDBCConnectionInfo jdbcConnectionInfo;

    private JDBCConnectionInfoManager() {
        
    }

    public static JDBCConnectionInfo getInfo() {
        return instance.jdbcConnectionInfo;
    }
}
