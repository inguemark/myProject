package com.inguemark.myproject.web;

import com.inguemark.myproject.service.CustomService;
import com.inguemark.myprojectconf.MyProjectConfiguration;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = NONE, classes = MyProjectConfiguration.class)
public class CustomerControllerTest {

    @Autowired
    private CustomerController customerController;

    @MockBean
    private CustomService customService;

    @Test
    public void test_hello ()
    {
        final String HELLO_WORL_TEST = "NON !";
        // fonctionne aussi avec un mockito plus classique
        BDDMockito.given(customService.afficherMessageBienvenue()).willReturn(HELLO_WORL_TEST);
        Assertions.assertThat(customerController.home()).isEqualTo(HELLO_WORL_TEST);

    }

    @Test
    public void test_uuid ()
    {
        final String UUID = java.util.UUID.randomUUID().toString();
        BDDMockito.given(customService.afficherUuid()).willReturn(UUID);
        Assertions.assertThat(customerController.uuid()).isEqualTo(UUID);
    }


}