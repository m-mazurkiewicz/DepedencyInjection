package mmazurkiewicz.springframework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware{

    public LifeCycleDemoBean() {
        System.out.println("In the LifeCycleBean constructor");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("The LifecycleBean has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("LifecycleBean has its properties set");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean factory has been set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context has benn set");
    }

    @PostConstruct
    public void PostConstruct(){
        System.out.println("Post Construct method has benn called");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("The Predestroy method has been called");
    }

    public void beforeInit(){
        System.out.println("Before Init - Called by bean post processor");
    }

    public void afterInit(){
        System.out.println("After init called by Bean post processor");
    }
}
