package com.edu.jewelry.service.group.impls;

import com.edu.jewelry.dao.group.impls.DaoGroupServiceImpl;
import com.edu.jewelry.model.Group;
import com.edu.jewelry.service.group.interfaces.IGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements IGroupService {
    @Autowired
    DaoGroupServiceImpl daoGroupService;

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
        return daoGroupService.getAll();
    }
}
