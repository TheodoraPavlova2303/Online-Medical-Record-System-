package net.summerProject.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


//this class configures the password encryption and the pages' authorized and not-authorized access
//this source is used to configure the Spring Security authentication and validation - 
//https://github.com/RameshMF/spring-boot-tutorial/tree/master/login-registration-springboot-hibernate-jsp-auth  

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true, proxyTargetClass = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
    // this method lists the pages which will displayed from the http request 
    // some pages can be accessed by all users
    // and some can be accessed only by authenticated users
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                    .csrf()
                    .disable()
                    .authorizeRequests()
                    .antMatchers("/resources/**", "/registration").permitAll().and()
                    .authorizeRequests().antMatchers("/h2-console/**").permitAll()
                    .antMatchers("/medicalFormCreate", "/medicalFormView").authenticated()
                    .anyRequest().authenticated()
                    .and()
                .formLogin()
                    .loginPage("/login")
                    .permitAll()
                    .and()
                .logout()
                    .permitAll();
        http     .csrf().ignoringAntMatchers("/h2-console/**");
        http     .headers().frameOptions().sameOrigin();
                
    }
    
     // this method is encrypting the password of the user 
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());
    }
}