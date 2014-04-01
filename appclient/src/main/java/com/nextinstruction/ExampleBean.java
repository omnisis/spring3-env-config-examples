package com.nextinstruction;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExampleBean {

    @Value("#{config.appName}")
    private String customProp;


    public String getCustomProp() {
        return customProp;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ExampleBean{");
        sb.append("customProp='").append(customProp).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
