package bean;

import org.springframework.context.annotation.Bean;

public class UserConfiguration {
    @Bean
    public User getUser() {
        return new User("11", 33);
    }
}
