package cn.com.taiji;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled=true,jsr250Enabled=true,prePostEnabled=true) 
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
		//增加用户
		auth.inMemoryAuthentication().withUser("user").password("user").roles("USER")
		.and().withUser("root").password("root").roles("ADMIN")
		.and().withUser("manager").password("manager").roles("MANAGER");
	}

	protected void configure(HttpSecurity http) throws Exception {

		http
		.authorizeRequests().antMatchers("/webjars/**","/js/**", "/signup", "/about","/bootstrap3/**").permitAll()
		.antMatchers("/admin/**")
		.hasIpAddress("10.0.44.67")
		.anyRequest().authenticated().and().logout()
		.and()
		.formLogin()
		.loginPage("/login")
		.permitAll().successForwardUrl("/home");
		http.csrf().disable();
		
	}

}
