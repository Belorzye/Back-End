package com.dh.service;

import com.dh.dao.IDao;
import com.dh.model.Filial;

import java.sql.SQLException;

public class FilialService {

    private IDao<Filial> filialIDao;

    public FilialService(IDao<Filial> filialIDao) {
        this.filialIDao = filialIDao;
    }

    public Filial salvar(Filial filial) throws SQLException {
        return filialIDao.salvar(filial);
    }
}
