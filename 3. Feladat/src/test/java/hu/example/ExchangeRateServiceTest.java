package hu.example;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.junit.Assert.assertEquals;

public class ExchangeRateServiceTest {

    @Test
    public void getRateReturnsConfiguredValue() {
        ExchangeRateService rateService =
            mock(ExchangeRateService.class);

        when(rateService.getRate("EUR", "HUF"))
            .thenReturn(400.0);

        assertEquals(
            400.0,
            rateService.getRate("EUR", "HUF"),
            0.001
        );
    }
}

