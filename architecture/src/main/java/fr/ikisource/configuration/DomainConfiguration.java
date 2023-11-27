package fr.ikisource.configuration;

import ddd.DomainService;
import ddd.Stub;
import fr.ikisource.book.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

@Configuration
//@EnableTransactionManagement
@ComponentScan(
        basePackageClasses = {Book.class},
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {DomainService.class, Stub.class})})

public class DomainConfiguration {

//    @Bean
//    public PlatformTransactionManager transactionManager() {
//        // Configure your transaction manager (e.g., DataSourceTransactionManager)
//
//        return null;
//    }
}
