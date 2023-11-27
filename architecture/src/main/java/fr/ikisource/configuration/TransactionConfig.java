package fr.ikisource.configuration;

//@Configuration
public class TransactionConfig {

//    private final PlatformTransactionManager transactionManager;
//
//    @Autowired
//    public TransactionConfig(PlatformTransactionManager transactionManager) {
//        this.transactionManager = transactionManager;
//    }

//    @Bean
//    public TransactionInterceptor transactionInterceptor() {
//        TransactionInterceptor interceptor = new TransactionInterceptor();
//        interceptor.setTransactionManager(transactionManager);
//        interceptor.setTransactionAttributeSource(new YourCustomTransactionAttributeSource()); // Define your custom attribute source
//        return interceptor;
//    }

//    @Bean
//    public ProxyFactoryBean yourTransactionalBean(TransactionInterceptor interceptor, TransactionAttributeSource transactionAttributeSource) {
//
//        ProxyFactoryBean factoryBean = new ProxyFactoryBean();
//        factoryBean.setTarget(SimpleBookService.class);
//
//        factoryBean.setInterceptorNames("transactionInterceptor");
//        interceptor.setTransactionAttributeSource(new YourCustomTransactionAttributeSource());
//
////        interceptor.setTransactionAttributeSource(transactionAttributeSource);
//        return factoryBean;
//    }
}
