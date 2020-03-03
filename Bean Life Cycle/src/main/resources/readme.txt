
1) Instantiate
2) populate properties
3) BeanNameAware -> setBeanName(String beanName)
4) BeanFactoryAware -> setBeanFactory(BeanFactory beanFactory)
5) ApplicationContextAware -> setApplicationContext(ApplicationContext applicationContext)
6) Pre-Initialization of bean
7) Initialization of beanFactory
8) BeanPostProcessor -> postProcessBeforeInitialization
9) Custom Init method or afterPropertySet() of InitializingBean
10) BeanPostProcessor -> postProcessAfterInitialization


Closing application context
1) Destroy method of disposable bean
2) custom destroy method of each bean