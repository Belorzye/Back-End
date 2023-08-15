package com.dh.dao.impl;

import com.dh.config.ConfiguracaoJDBC;
import com.dh.dao.IDao;
import com.dh.model.Filial;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FilialDao implements IDao<Filial> {

    private final static Logger log = Logger.getLogger(FilialDao.class);

    private ConfiguracaoJDBC configuracaoJDBC;

    public FilialDao(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Filial salvar(Filial filial) throws SQLException {
        log.info("Salvando nova filial: " + filial.toString());

        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;

        String query = String.format("INSERT INTO filiais (NOME, RUA, NUMERO, CIDADE, ESTADO, CINCOESTRELAS) " +
                        "VALUES ('%s', '%s', '%s', '%s', '%s', '%s')", filial.getNome(), filial.getRua(), filial.getNumero(),
                filial.getCidade(), filial.getEstado(), filial.isCincoEstrelas());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                filial.setId(generatedKeys.getInt(1));
                log.info("Recuperando id da filial: " + filial.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            statement.close();
            connection.close();
        }
        return filial;
    }
}
