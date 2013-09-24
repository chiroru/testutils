package jp.ddo.chiroru.testutils.core.jdbc;

public class JDBCConnectionInfo {

    private String url;

    private String driverName;

    private String username;

    private String password;

    private String schemaName;

    public JDBCConnectionInfo(
            String url,
            String driverName,
            String username,
            String password,
            String schemaName) {
        this.url = url;
        this.driverName = driverName;
        this.username = username;
        this.password = password;
        this.schemaName = schemaName;
    }

    public String getUrl() {
        return url;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSchemaName() {
        return schemaName;
    }
}
