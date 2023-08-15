package com.dh.dao;

import java.sql.SQLException;

public interface IDao <T> {

    //Retorno nomeMetodo(Parametros);
    T salvar(T t) throws SQLException;
}
