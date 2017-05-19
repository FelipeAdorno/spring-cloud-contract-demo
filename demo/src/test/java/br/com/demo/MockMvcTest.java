package br.com.demo;

import br.com.demo.api.PaymentRestService;
import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public class MockMvcTest {

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new PaymentRestService());
    }
}
