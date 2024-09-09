import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.Banco;

public class BancoTest {
    private Banco banco;

    @Test
    public void testeSaldoInicial(){
        banco = new Banco("victor", 500);
        assertEquals(500.00, banco.getBalance());
    }

    @Test
    public void testeDepositoValido(){
        banco = new Banco("victor", 500);
        banco.deposit(500);
        assertEquals(1000, banco.getBalance());
    }

    @Test
    public void testeDepositoInvalido(){
        Banco banco = new Banco("victor", 500);
        banco.deposit(-35);
        assertEquals(500, banco.getBalance());
    }

    @Test
    public void testeSaqueBemSucesso(){
        banco = new Banco("victor", 500);
        boolean result = banco.withdraw(400);
        assertTrue(result);
        assertEquals(100, banco.getBalance());
    }

    @Test
    public void testeSaqueFalho(){
        banco = new Banco("victor", 500);
        boolean result = banco.withdraw(700);
        assertFalse(result);
        assertEquals(500, banco.getBalance());
    }


    @Test
    public void testeSaqueFalhoValorNegativo(){
        banco = new Banco("victor", 500);
        boolean result = banco.withdraw(-165);
        assertFalse(result);
        assertEquals(500, banco.getBalance());
    }

    
}
