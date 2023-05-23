package com.dynamictable.dynamictable.utls;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class CheckTableExist {

    private final JdbcTemplate jdbcTemplate;


    public CheckTableExist(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public Boolean checkTableIsExists(String tableName) {
        // Check if the table exists
        String checkTableExistsQuery = "SELECT EXISTS (SELECT 1 FROM information_schema.tables WHERE table_name = ?)";
        boolean tableExists = jdbcTemplate.queryForObject(checkTableExistsQuery, Boolean.class, tableName);
        return tableExists;
    }


    public void createPaymentMethodsTable(String tablename )
    {
        System.out.println("Table created successfully.");

        // String createTableQuery = "CREATE TABLE " + tablename + " (id SERIAL PRIMARY KEY, customerid VARCHAR(255) NOT NULL, type VARCHAR(255) NOT NULL, cardNumber VARCHAR(255) NOT NULL,expirationMonth VARCHAR(255) NOT NULL, expirationYear VARCHAR(255) NOT NULL, cvv VARCHAR(255) NOT NULL, billindaddressid INT NOT NULL, payload TEXT NOT NULL)";
        String createTableQuery = "CREATE TABLE payment_methods (id VARCHAR(36) PRIMARY KEY,customerid VARCHAR(255) NOT NULL,type VARCHAR(255) NOT NULL,cardNumber VARCHAR(255) NOT NULL,expirationMonth VARCHAR(255) NOT NULL,expirationYear VARCHAR(255) NOT NULL,cvv VARCHAR(255) NOT NULL,billindaddressid INT NOT NULL,payload TEXT NOT NULL)";
        jdbcTemplate.execute(createTableQuery);
        System.out.println("Table created successfully."); 
    }



}






