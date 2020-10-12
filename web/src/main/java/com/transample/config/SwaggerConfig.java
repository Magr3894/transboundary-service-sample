package com.transample.config;/*
 * @Author: panc
 * @Date:2020/10/12 14:04*/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * swagger配置
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        // 构建文档
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        // 文档信息
        return docket.apiInfo(apiInfo())
                // 查询
                .select()
                // 注解包的路径
                .apis(RequestHandlerSelectors.basePackage("com.transample.controller"))
                // 任何路径
//            .paths(PathSelectors.any())
                .build();

    }

    /* *
     * @Author lsc
     * <p> 文档信息</p>
     * @Param []
     * @Return springfox.documentation.service.ApiInfo
     */
    private ApiInfo apiInfo() {
        // 文档对象构建器
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        // 文档标题

        return apiInfoBuilder.title("村淘案例api展示")
                // 描述信息
                .description("案例后端api")
                // 版本号
                .version("v1")
                // 联系人
                .build();

    }
}

