package io.pivotal.pal.tracker.oauthserver;

@SpringBootApplication
public class App extends AuthorizationServerConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
