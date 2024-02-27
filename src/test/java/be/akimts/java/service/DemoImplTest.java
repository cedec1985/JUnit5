package be.akimts.java.service;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DemoImplTest {

    @BeforeAll
    static void init(){
        System.out.println("DEMO> before all:");
        // initialization of the test environment:
        // example: open connection to fake DB
    }

    @BeforeEach
    void initTest(){
        System.out.println("DEMO-- before each:");
        // example: add data to fake DB
    }

    @AfterEach
    void tearUpTest(){
        System.out.println("DEMO-- after each:");
        // example: remove data inserted by the test in fake DB
    }

    @AfterAll
    static void tearUp(){
        System.out.println("DEMO> after all:");
        // example: destray fake DB/close connection fake DB
    }

    @Test
    void returns5() {
        Demo demo = (Demo) new DemoImpl();
        assertEquals(demo.returns5(), 5);
    }
}
