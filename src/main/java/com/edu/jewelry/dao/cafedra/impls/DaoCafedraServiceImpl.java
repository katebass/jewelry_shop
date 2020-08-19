package com.edu.jewelry.dao.cafedra.impls;

import com.edu.jewelry.dao.cafedra.interfaces.IDaoCafedra;
import com.edu.jewelry.datastorage.DataFake;
import com.edu.jewelry.model.Cafedra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DaoCafedraServiceImpl implements IDaoCafedra {

    @Autowired
    DataFake dataFake;

    @Override
    public Cafedra create(Cafedra cafedra) {
        return null;
    }

    @Override
    public Cafedra get(String id) {
        return null;
    }

    @Override
    public Cafedra update(Cafedra cafedra) {
        return null;
    }

    @Override
    public Cafedra delete(String id) {
        return null;
    }

    @Override
    public List<Cafedra> getAll() {
        return dataFake.getCafedras();
    }
}
