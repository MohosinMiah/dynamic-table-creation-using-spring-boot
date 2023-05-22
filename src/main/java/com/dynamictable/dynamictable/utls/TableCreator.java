// package com.dynamictable.dynamictable.utls;

// import java.beans.Statement;
// import java.sql.Connection;
// import java.sql.SQLException;

// import org.hibernate.Session;
// import org.hibernate.SessionFactory;
// import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
// import org.hibernate.engine.spi.SessionFactoryImplementor;
// import org.hibernate.metamodel.spi.MetamodelImplementor;
// import org.hibernate.persister.entity.EntityPersister;
// import org.hibernate.service.ServiceRegistry;
// import org.springframework.stereotype.Component;

// import jakarta.persistence.EntityManager;
// import jakarta.persistence.PersistenceContext;

// @Component
// public class TableCreator {

//     @PersistenceContext
//     private EntityManager entityManager;

//     public void createTableFromClass(Class<?> entityClass) {
//         Session session = entityManager.unwrap(Session.class);
//         SessionFactoryImplementor sessionFactory = (SessionFactoryImplementor) session.getSessionFactory();
//         ServiceRegistry serviceRegistry = sessionFactory.getServiceRegistry();
//         MetamodelImplementor metamodel = sessionFactory.getMetamodel();
//         EntityPersister entityPersister = metamodel.entityPersister(entityClass);

//         String ddlScript = ((Object) entityPersister).getCreateTableCommand().getCommand();

//         try (Connection connection = serviceRegistry.getService(ConnectionProvider.class).getConnection()) {
//             Statement statement = (Statement) connection.createStatement();
//             statement.execute();
//             System.out.println("Table created successfully.");
//         } catch (SQLException e) {
//             e.printStackTrace();
//         }
//     }
// }

