package com.nextinstruction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppDriver {

    public static void main(String[] args) throws Exception {
        final ApplicationContext ctx =
                new ClassPathXmlApplicationContext(new String[]{"classpath:appconfig/spring/core-context.xml"});
        final AppBean appBean = ctx.getBean(AppBean.class);
        final DBBean dbBean = ctx.getBean(DBBean.class);
        final ConfigBean configBean = ctx.getBean(ConfigBean.class);
        final ExampleBean exampleBean = ctx.getBean(ExampleBean.class);


        System.out.println(configBean);
        System.out.println(appBean);
        System.out.println(dbBean);
        System.out.println(exampleBean);
    }
}
