# Spring 项目学习

## Javaweb集成Spring框架

1.修改web.xml

	<!--整合spring-->
	<listener>
        <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
    </listener>

    <context-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>classpath:applicationContext.xml</param-value>
    </context-param>
    
2.创建applicationContent.xml

    
    <?xml version="1.0" encoding="UTF-8"?>
       <beans xmlns="http://www.springframework.org/schema/beans"

       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"

       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd"

       default-lazy-init="false" default-autowire="byName">

       <!--开启注解-->
       <context:component-scan base-package="com.azxx"/>
       <!--加载配置文件-->
       <context:property-placeholder location="classpath*:/appConfig.properties" />
     </beans>
     
3.测试


```sequence
Alice->Bob: Hello Bob, how are you?
Note right of Bob: Bob thinks
Bob–>Alice: I am good thanks!
```
### 整合SpringMVC
### 整合SpringTest
### 整合SpringJDBC
### 整合Mybatis
### 整合Spring Batch
### 整合Spring Security/Apache Shiro
### 整合Spring Session
