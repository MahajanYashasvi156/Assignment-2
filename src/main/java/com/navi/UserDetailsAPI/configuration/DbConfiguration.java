package com.navi.UserDetailsAPI.configuration;

import com.navi.UserDetailsAPI.repository.UserRepository;
import com.navi.UserDetailsAPI.repository.UserRepositoryImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The DbConfiguration class is a Spring Configuration class that defines the beans for the repository classes.
 * It is responsible for configuring and providing instances of the ChatRepository and UserRepository implementations.
 *
 * This class uses the @Configuration annotation, indicating that it contains bean definitions that will be processed
 * by the Spring IoC (Inversion of Control) container to create and manage bean instances.
 */
@Configuration
public class DbConfiguration {
    /**
     * Creates and configures a UserRepository bean.
     *
     * @return An instance of UserRepository representing the UserRepositoryImpl implementation.
     */
    @Bean
    public UserRepository userRepository() {
        return new UserRepositoryImp();
    }
}