package beanlifecycle;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class Bar {

    @PostConstruct
    public void init() throws Exception{
        System.out.println("Init method is called (Annotation Method)");
    }

    @PreDestroy
    public void destroy() throws Exception{
        System.out.println("Destroy method is called (Annotation Method)");
    }
}
