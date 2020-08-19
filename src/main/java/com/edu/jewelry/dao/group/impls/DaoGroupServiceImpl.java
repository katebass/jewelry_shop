package com.edu.jewelry.dao.group.impls;

import com.edu.jewelry.dao.group.interfaces.IDaoGroup;
import com.edu.jewelry.datastorage.DataFake;
import com.edu.jewelry.model.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DaoGroupServiceImpl implements IDaoGroup {

    @Autowired
    DataFake dataFake;

    @Override
    public Group create(Group group) {
        return null;
    }

    @Override
    public Group get(String id) {
        return null;
    }

    @Override
    public Group update(Group group) {
        return null;
    }

    @Override
    public Group delete(String id) {
        return null;
    }

    @Override
    public List<Group> getAll() {
        return dataFake.getGroups();
    }
}
