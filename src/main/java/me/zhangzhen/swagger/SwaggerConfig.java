package me.zhangzhen.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * swagger配置
 * @author cdf
 *
 */
@EnableWebMvc  
@EnableSwagger2  
@ComponentScan(basePackages = {"com.fh.controller.swagger"})  
@Configuration
public class SwaggerConfig extends WebMvcConfigurationSupport{
	
	  @Bean  
	    public Docket createRestApi() {  
	        return new Docket(DocumentationType.SWAGGER_2)  
	                .apiInfo(apiInfo())  
	                .select()  
	                .apis(RequestHandlerSelectors.basePackage("com.fh.controller.swagger"))  
	                .paths(PathSelectors.any())  
	                .build();  
	    }  
	  
	    private ApiInfo apiInfo() {  
	        return new ApiInfoBuilder()  
	                .title("幸福钱庄后台管理系统构建RESTful APIs")  
	                .termsOfServiceUrl("www.xxxcom")  
	                .contact("by-shanlin")  
	                .version("1.1")  
	                .build();  
	    }  
}