package com.nextinstruction;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dbBean")
public class DBBean {

    @Value("${db.user}")
    private String dbuser;

    @Value("${db.password}")
    private String dbpass;

    @Value("${db.schema}")
    private String dbSchema;

    @Value("${db.type}")
    private String dbType;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DBBean{");
        sb.append("dbuser='").append(dbuser).append('\'');
        sb.append(", dbpass='").append(dbpass).append('\'');
        sb.append(", dbSchema='").append(dbSchema).append('\'');
        sb.append(", dbType='").append(dbType).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getDbuser() {
        return dbuser;
    }

    public String getDbpass() {
        return dbpass;
    }

    public String getDbSchema() {
        return dbSchema;
    }

    public String getDbType() {
        return dbType;
    }
}
