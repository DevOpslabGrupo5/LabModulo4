package com.devops.dxc.devops.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UtilTest {

    private Util useCases;

    @BeforeEach
    void setup() {
        useCases = new Util();
    }

    @Test
    void testDiezxciento() {
        assertEquals(10, useCases.diezxciento(100));
    }

    @Test
    void testGetDxc() throws KeyManagementException, NoSuchAlgorithmException {
        assertEquals(1000000, useCases.getDxc(1000000));
    }

    @Test
    void testGetUf() throws KeyManagementException, NoSuchAlgorithmException {
        assertTrue(useCases.getUf() > 30000);
    }

    @Test
    void testImpuesto() {
        assertEquals(0, useCases.impuesto(1000000));
    }

    @Test
    void testSaldoAhorro() {
        assertEquals(90, useCases.saldoAhorro(100));
    }
}
