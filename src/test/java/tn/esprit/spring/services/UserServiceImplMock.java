package tn.esprit.spring.services;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.UserRepository;
import org.springframework.test.context.ContextConfiguration;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@DisplayName("MOCKITO TEST")
@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)
//@ContextConfiguration(classes = TestDataSourceConfiguration.class)
class UserServiceImplMock {
    @Mock
    UserRepository userRepository;
    @InjectMocks
    UserServiceImpl userService;

    User user = new User("f1", "l1", new Date(), Role.ADMINISTRATEUR);

    @Test
    public void testRetrieveUser() {
        Mockito.when(userRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(user));
        User user1 = userService.retrieveUser("2");
        Assertions.assertNotNull(user1);
    }


}
