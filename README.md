# spring-security-demo

This is spring boot application to demonstrate spring-security usages

## Further reference documentations
* [Spring boot application-properties official documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html)


# Notes
* spring-security generates default login page at using default filter :  [DefaultLoginPageGeneratingFilter.java](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/web/authentication/ui/DefaultLoginPageGeneratingFilter.html) through method : generateLoginPageHtml
* Useful classes:
  *  __UsernamePasswordAuthenticationFilter__ : provides Authentication object from username and password
  * __UsernamePasswordAuthenticationToken__ : implements Authentication
  * __AuthenticationManager__ : interface
  * __ProviderManager__ : implementation of __AuthenticationManager__ provided by spring framework
    * __ProviderManager__ has method __authenticate__ which iterates through all the providers available in spring-security context and returns __Authentication__ object
  * __DaoAuthenticationProvider__ : it is default AuthenticationProvider to perform authentication. 
  * __InMemoryUserDetailsManager__ : default manager used by spring framework for in-memory user details

## Spring Security Internal Flow
![Spring Security internal flow](https://raw.githubusercontent.com/chinmayjaiswal/spring-security-demo/main/images/spring_security_internal_flow.png)


## Notes Section 2:
* By default, Spring Security Framework protects all the paths present inside the web application. This behaviour is due to : __SpringBootWebSecurityConfiguration#defaultSecurityFilterChain(HttpSecurity http)__ method.
* 
