package pro.mohammadamir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static java.util.Collections.emptyList;

@SpringBootApplication
@EnableSwagger2
public class Application {

    public static void main(String[] args) {
        SpringApplication.run (Application.class, args);
    }

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("pro.mohammadamir.controller.rest"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(
                    new ApiInfo (
                        "Test App",
                        "Test App",
                        "v1.0",
                        "Terms Of Service",
                        new Contact ("Mohammad Amir","http://MohammadAmir.PRO","ME@MohammadAmir.PRO"),
                        "Apache License Version 2.0",
                        "http://www.apache.org/licenses/LICENSE-2.0",
                        emptyList()
                    )
                );
    }
}
