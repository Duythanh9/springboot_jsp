package com.example.luyentap1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Luyentap1Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Luyentap1Application.class, args);
//        SanPhamRepo repo = ctx.getBean(SanPhamRepo.class);
//        System.out.println(repo.findAll());
    }

}
//<%@ taglib prefix="c" uri="jakarta.tags.core" %>
//<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
// Properties
//
//spring.mvc.view.prefix=/views/
//spring.mvc.view.suffix=.jsp
//spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=SOF203;encrypt=true;trustServerCertificate=true;
//        spring.datasource.username=sa
//        spring.datasource.password=Aa@123456
//        spring.datasource.driverClassName=com.microsoft.sqlserver.jdbc.SQLServerDriver
//        logging.level.org.hibernate.SQL=DEBUG
//        logging.level.org.hibernate.type.descriptor.sql.BasicBinder=TRACE
//        spring.jpa.hibernate.ddl-auto=none
//        spring.jpa.show-sql=true
//        spring.jpa.properties.hibernate.format_sql=true
//        spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
//
//
//pom.xml
//<dependency>
//<groupId>org.springframework.boot</groupId>
//<artifactId>spring-boot-starter-data-jpa</artifactId>
//<version>3.2.3</version>
//</dependency>
//
//<dependency>
//<groupId>com.microsoft.sqlserver</groupId>
//<artifactId>mssql-jdbc</artifactId>
//<version>12.3.0.jre17-preview</version>
//</dependency>
//
//<!-- https://mvnrepository.com/artifact/org.hibernate.validator/hibernate-validator -->
//<dependency>
//<groupId>org.hibernate.validator</groupId>
//<artifactId>hibernate-validator</artifactId>
//<version>7.0.5.Final</version>
//</dependency>
//
//<!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-tomcat -->
//<dependency>
//<groupId>org.springframework.boot</groupId>
//<artifactId>spring-boot-starter-tomcat</artifactId>
//<version>3.2.5</version>
//</dependency>
//
//<!-- https://mvnrepository.com/artifact/org.apache.tomcat.embed/tomcat-embed-jasper -->
//<dependency>
//<groupId>org.apache.tomcat.embed</groupId>
//<artifactId>tomcat-embed-jasper</artifactId>
//<version>10.1.23</version>
//</dependency>
//
//<dependency>
//<groupId>jakarta.servlet.jsp.jstl</groupId>
//<artifactId>jakarta.servlet.jsp.jstl-api</artifactId>
//<version>3.0.0</version>
//</dependency>
//
//<dependency>
//<groupId>org.glassfish.web</groupId>
//<artifactId>jakarta.servlet.jsp.jstl</artifactId>
//<version>3.0.1</version>
//</dependency>


