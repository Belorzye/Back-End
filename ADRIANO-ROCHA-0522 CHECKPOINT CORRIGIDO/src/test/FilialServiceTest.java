package test;

import com.dh.config.ConfiguracaoJDBC;
import com.dh.dao.impl.FilialDao;
import com.dh.model.Filial;
import com.dh.service.FilialService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.sql.SQLException;

public class FilialServiceTest {

    private FilialService filialService = new FilialService(new FilialDao(new ConfiguracaoJDBC()));

    private Filial filial1, filial2, filial3, filial4, filial5;

    @BeforeEach
    void doBefore() {
        filial1 = new Filial("Hotel 1", "Rua 1", "10", "Cidade 1", "Estado 1", true);
        filial2 = new Filial("Hotel 2", "Rua 2", "11", "Cidade 2", "Estado 2", true);
        filial3 = new Filial("Hotel 3", "Rua 3", "13", "Cidade 3", "Estado 3", false);
        filial4 = new Filial("Hotel 4", "Rua 4", "14", "Cidade 4", "Estado 4", true);
        filial5 = new Filial("Hotel 5", "Rua 5", "16", "Cidade 5", "Estado 5", true);
    }

    @Test
    void deveSalvarFilialComSucesso() throws SQLException {
        filialService.salvar(filial1);
        filialService.salvar(filial2);
        filialService.salvar(filial3);
        filialService.salvar(filial4);
        filialService.salvar(filial5);

        Assertions.assertNotNull(filial1.getId());
        Assertions.assertNotNull(filial2.getId());
        Assertions.assertNotNull(filial3.getId());
        Assertions.assertNotNull(filial4.getId());
        Assertions.assertNotNull(filial5.getId());
    }

}
