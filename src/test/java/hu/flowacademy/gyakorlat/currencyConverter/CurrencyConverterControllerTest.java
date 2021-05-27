package hu.flowacademy.gyakorlat.currencyConverter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CurrencyConverterControllerTest {
    @Test
    public void testConvertCurrency() {
        // given
        ICurrencyConverterService mockService = mock(ICurrencyConverterService.class);
        when(mockService.convert(any(Currency.class), any(Currency.class), anyDouble())).thenReturn(1.0);
        CurrencyConverterController controller = new CurrencyConverterController(mockService);

        // when
        double convert = controller.convertCurrency(Currency.EUR, Currency.HUF, 2000);

        // then
        verify(mockService).convert(eq(Currency.EUR), eq(Currency.HUF), eq(2000.0));
    }
}
