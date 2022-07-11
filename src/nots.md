 1. First JVM gets loaded  
 1. Main method gets executed
 1. ApplicationContext is loaded
 1. ApplicationContext reads xml configuration file
 1. ApplicationContext pre-loads one object for each bean in the config file if bean in not marked as         
             lazy-init="true"
 1.  
 l. azy-init="true" This informs springContainer not to pre-load object for this bean
 1. By default Spring early loads objects in memory.
 1. For lazy-init beans object is created only when the getBean() method is called.
 1. For pre-init beans getBean() returns the reference of the pre-loaded object
 1. By default only one object for every bean is created (singleton)
 1. singleton: Atleast one object for every class but not more than one object
 1. Spring for lazy-init beans creates a singleton object on firstcall ofgetBeans() method
      and then uses that object for future getBean() method calls
	------
## Prototype
Prototype bean are by default lazy-init 
prototype are not singleton
A new object is created for prototype when getBean()method is called event time 

```java
   <bean id="act" class="com.chainsys.projectA.beans.Actor" scope="prototype"></bean>

```
## Bean with parameterize constructor

```java
  <bean id="film" class="com.chainsys.projectA.beans.Movie">
  	<constructor-arg type="java.lang.String" value="sami"/>
  	<constructor-arg type="java.lang.String" value="praveen"/>
  </bean>
```

```

