//package javabasedconfiguration;
//
//import org.springframework.context.annotation.Bean;
//import pojobeans.AccountRepository;
//import pojobeans.AccountRepositoryImpl;
//import pojobeans.AccountService;
//import pojobeans.AccountServiceImpl;
//
//import javax.management.MXBean;
//
//public class BeanConfiguration {
//    @Bean
//    public AccountService accountService(){
//        AccountServiceImpl bean = new AccountServiceImpl();
//        bean.setAccountRepository(accountDAO());
//        return bean;
//    }
//
//    @Bean
//    public AccountRepository accountDAO(){
//        AccountRepositoryImpl bean = new AccountRepositoryImpl();
//        return bean;
//    }
//
//}
