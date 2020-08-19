package com.edu.jewelry.dao.group.interfaces;

import com.edu.jewelry.model.Group;

import java.util.List;

public interface IDaoGroup {
    Group create(Group group);
    Group get(String id);
    Group update(Group group);
    Group delete(String id);
    List<Group> getAll();
}
