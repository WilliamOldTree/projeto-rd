package br.com.qsd.politeismo.ecommerce.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import br.com.qsd.politeismo.ecommerce.repository.ClienteRepository;

@EnableWebSecurity
@Configuration
public class SecurityConfigurations extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private AutenticacaoService autenticacaoService;
	
	@Autowired
	private TokenService tokenService;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(autenticacaoService).passwordEncoder(new BCryptPasswordEncoder());
	}
	
	@Override
	@Bean
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
//		.antMatchers(HttpMethod.GET , "/produtos").permitAll()
//		.antMatchers(HttpMethod.GET , "/produtos/*").permitAll()
//		.antMatchers(HttpMethod.GET , "/categorias").permitAll()
//		.antMatchers(HttpMethod.GET , "/categorias/*").permitAll()
//		.antMatchers(HttpMethod.POST , "/clientes").permitAll()
//		.antMatchers(HttpMethod.POST , "/auth").permitAll()
//		.antMatchers(HttpMethod.GET , "/pedidos/*").permitAll()
//		.antMatchers(HttpMethod.GET , "/pedidos").permitAll()
//		.antMatchers(HttpMethod.POST , "/pedidos").permitAll()
//		.antMatchers(HttpMethod.GET , "/itensPedido/*").permitAll()
//		.antMatchers(HttpMethod.GET , "/itensPedido").permitAll()
//		.antMatchers(HttpMethod.POST , "/itensPedido").permitAll()
		
		
		.antMatchers(HttpMethod.GET , "/*").permitAll()
		.antMatchers(HttpMethod.POST , "/*").permitAll()
		.antMatchers(HttpMethod.GET , "/pedidos/*").permitAll()
		.antMatchers(HttpMethod.GET , "/pedidos").permitAll()
		.antMatchers(HttpMethod.POST , "/pedidos/*/*").permitAll()
		.antMatchers(HttpMethod.POST , "/pedidos").permitAll()
		.antMatchers(HttpMethod.POST , "/pedidos/novo").permitAll()
		.antMatchers(HttpMethod.GET , "/itensPedido/*").permitAll()
		.antMatchers(HttpMethod.GET , "/itensPedido/*/*").permitAll()
		.antMatchers(HttpMethod.GET , "/itensPedido").permitAll()
		.antMatchers(HttpMethod.POST , "/itensPedido/*").permitAll()
		
		
		.anyRequest().authenticated().and().cors()
		.and().csrf().disable()
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and().addFilterBefore(new AutenticacaoViaTokenFilter(tokenService , clienteRepository) , UsernamePasswordAuthenticationFilter.class);
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/h2-console/**");
	}
	
}
