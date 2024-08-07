package beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojobeans.Account;

public class BarMainTestLifeCycle {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("beanscopeandlifecycle/beans-lifecycleBar.xml");

        applicationContext.close();

    }
}
