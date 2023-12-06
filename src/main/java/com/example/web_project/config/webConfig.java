package com.example.web_project.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.example")
public class webConfig implements WebMvcConfigurer {
    @Bean
    public InternalResourceViewResolver jspViewResolver() {
        InternalResourceViewResolver resolver= new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
    @Bean
    public FilterRegistrationBean siteMeshFilter() {
        FilterRegistrationBean filter = new FilterRegistrationBean();
        MySiteMeshFilter siteMeshFilter = new MySiteMeshFilter();
        filter.setFilter(siteMeshFilter);
        return filter;
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("/resources/")
                .addResourceLocations("/resources/static/")
                .addResourceLocations("/resources/static/assets/")
                .addResourceLocations("/resources/static/assets/image/")
                .addResourceLocations("/resources/static/css/")
                .addResourceLocations("/resources/static/js/")
                .addResourceLocations("/resources/static/media/")
                .addResourceLocations("/resources/templates/");
        registry.addResourceHandler("/static/**")
                .addResourceLocations("/resources/static/")
                .addResourceLocations("/resources/static/assets/")
                .addResourceLocations("/resources/static/css/")
                .addResourceLocations("/resources/static/js/")
                .addResourceLocations("/resources/static/media/");
        registry.addResourceHandler("favicon.ico")
                .addResourceLocations("/resources/favicon.ico");
        registry.addResourceHandler("WEB_INF/**")
                .addResourceLocations("WEB_INF/**")
                .addResourceLocations("WEB_INF/decorators/")
                .addResourceLocations("WEB_INF/common/");
        registry.addResourceHandler("auth/**")
                .addResourceLocations("WEB_INF/views/auth/");

//        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
//        registry.addResourceHandler("/js/**").addResourceLocations("/js/");
    }
}
