package com.project.airportM.DbMan;

import com.project.airportM.Entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.io.File;

public class HibernateUtil {
    private static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory(){
        File file = new File("");
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .loadProperties(new File("E:\\İndirilenler\\springboot-javafx-support-master\\airportManagement\\src\\main\\resources\\application.properties")).build();

        Metadata metadata = new MetadataSources(registry)
                .addAnnotatedClass(Airline.class)
                .addAnnotatedClass(City.class)
                .addAnnotatedClass(Flight.class)
                .addAnnotatedClass(Role.class)
                .addAnnotatedClass(User.class)
                .getMetadataBuilder()
                .applyImplicitNamingStrategy( ImplicitNamingStrategyJpaCompliantImpl.INSTANCE )
                .build();

        return  metadata.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
