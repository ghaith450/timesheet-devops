package tn.esprit.spring.services;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import tn.esprit.spring.entities.User;

import java.util.List;
@DisplayName("JUNIT TEST")
@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
//@ContextConfiguration(classes = TestDataSourceConfiguration.class)
class UserServiceImplTest {

    @Autowired
    IUserService us;
    @Test
    @Order(1)
    public void testRetrieveAllUsers() {
        List<User> listUsers = us.retrieveAllUsers();
        Assertions.assertEquals(0, listUsers.size());
    }

}
