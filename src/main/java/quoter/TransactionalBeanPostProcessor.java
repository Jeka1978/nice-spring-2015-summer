package quoter;

import org.springframework.aop.support.AopUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.util.ClassUtils;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jeka on 06/07/2016.
 */

public class TransactionalBeanPostProcessor implements BeanPostProcessor {
    @Autowired
    private ConfigurableListableBeanFactory factory;


    private Map<String, Class> map = new HashMap<>();
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> beanClass = bean.getClass();
        if (beanClass.isAnnotationPresent(Benchmark.class)) {
            map.put(beanName, beanClass);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        /*BeanDefinition beanDefinition = factory.getBeanDefinition(beanName);
        String beanClassName = beanDefinition.getBeanClassName();
        Class<?> beanClass = ClassUtils.resolveClassName(beanClassName, ClassLoader.getSystemClassLoader());
//        Class beanClass = map.get(beanName);
        if (beanClass!=null) {
            return Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                    beanClass.getInterfaces(),(proxy, method, args) -> {
                        System.out.println("trans open");
                        Object retVal = method.invoke(bean, args);
                        System.out.println("trans closed");
                        return retVal;
                    });
        }*/
        return bean;
    }
}












