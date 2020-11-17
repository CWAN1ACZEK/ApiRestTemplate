package com.mcupek.springhttpclient.services;

import com.mcupek.springhttpclient.api.domain.Agify;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @Test
    public void testGetAgify() throws Exception {

        Agify[] agifys = apiService.getAgify(5);

        Assertions.assertEquals(3, agifys.length);
    }
}
