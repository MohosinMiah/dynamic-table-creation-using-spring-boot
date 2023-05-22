package com.dynamictable.dynamictable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dynamictable.dynamictable.payload.PaymentMethodDto;

@RestController
public class HomeController {
    

    @GetMapping("/")
    public String home(){
        return "This is Home Page";
    }

    @PostMapping("/dynamictable")
    public PaymentMethodDto savePaymentMethod( @RequestBody PaymentMethodDto paymentMethodDto )
    {
        return null;
        // import org.hibernate.boot.MetadataSources;
        // import org.hibernate.boot.registry.StandardServiceRegistry;
        // import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
        // import org.hibernate.boot.spi.MetadataImplementor;
        // import org.hibernate.tool.hbm2ddl.SchemaExport;
        

        //         boolean shouldCreateTable = true; // Set your condition here
        
        //         if (shouldCreateTable) {
        //             StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
        //             MetadataSources metadataSources = new MetadataSources(serviceRegistry);
        //             metadataSources.addAnnotatedClass(PaymentMethod.class);
        
        //             MetadataImplementor metadata = (MetadataImplementor) metadataSources.buildMetadata();
        //             SchemaExport schemaExport = new SchemaExport(metadata);
        //             schemaExport.create(true, true);
                    
        //             System.out.println("PaymentMethod table created successfully.");
        //         } else {
        //             System.out.println("Table creation skipped.");
 
        // }




//         import javax.persistence.EntityManager;
// import javax.persistence.PersistenceContext;
// import org.springframework.stereotype.Component;

// @Component
// public class TableChecker {

//     @PersistenceContext
//     private EntityManager entityManager;

//     public boolean isTableExists(String tableName) {
//         String query = "SELECT COUNT(*) FROM information_schema.tables WHERE table_name = :tableName";
//         Long count = (Long) entityManager.createNativeQuery(query)
//                 .setParameter("tableName", tableName)
//                 .getSingleResult();
//         return count != null && count > 0;
//     }
// }

        
        
    }
}
