package com.nextinstruction;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("config")
public class ConfigBean {
    @Value("${db.schema}")
    private String dbSchema;
    @Value("${db.user}")
    private String dbUser;
    @Value("${db.password}")
    private String dbPassword;
    @Value("${app.name}")
    private String appName;
    @Value("${db.type}")
    private String dbType;

    @PostConstruct
    public void validateConfig() {
        System.out.println("Config Validated...");
    }

    public String getDbSchema() {
        return dbSchema;
    }

    public String getDbUser() {
        return dbUser;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public String getAppName() {
        return appName;
    }

    public String getDbType() {
        return dbType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConfigBean{");
        sb.append("dbSchema='").append(dbSchema).append('\'');
        sb.append(", dbUser='").append(dbUser).append('\'');
        sb.append(", dbPassword='").append(dbPassword).append('\'');
        sb.append(", appName='").append(appName).append('\'');
        sb.append(", dbType='").append(dbType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
