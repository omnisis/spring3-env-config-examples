package com.nextinstruction;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("appBean")
public class AppBean {

    @Value("${app.name}")
    private String appName;

    public String getAppName() {
        return appName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AppBean{");
        sb.append("appName='").append(appName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
