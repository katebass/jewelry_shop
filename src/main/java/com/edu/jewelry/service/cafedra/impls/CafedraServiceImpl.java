package com.edu.jewelry.service.cafedra.impls;

import com.edu.jewelry.datastorage.DataFake;
import com.edu.jewelry.model.Cafedra;
import com.edu.jewelry.repository.CafedraRepository;
import com.edu.jewelry.repository.GroupRepository;
import com.edu.jewelry.service.cafedra.interfaces.ICafedraBusinessInterface;
import com.edu.jewelry.service.cafedra.interfaces.ICafedraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CafedraServiceImpl implements ICafedraService, ICafedraBusinessInterface {

//    @Autowired
//    DaoCafedraServiceImpl daoCafedraService;
    @Autowired
    CafedraRepository cafedraRepository;
    @Autowired
    GroupRepository groupRepository;
    @Autowired
    DataFake dataFake;

    @Override
    public Cafedra create(Cafedra cafedra) {
        cafedra.setCreatedAt(LocalDateTime.now());
        cafedra.setUpdatedAt(LocalDateTime.now());
        return cafedraRepository.save(cafedra);
    }

    @Override
    public Cafedra get(String id) {
        return cafedraRepository.findById(id).orElse(null);
    }

    @Override
    public Cafedra delete(String id) {
        Cafedra cafedra = this.get(id);
        cafedraRepository.deleteById(cafedra.getId());
        return cafedra;
    }

    @Override
    public Cafedra update(Cafedra cafedra) {
        cafedra.setUpdatedAt(LocalDateTime.now());
        return cafedraRepository.save(cafedra);
    }


    @Override
    public List<Cafedra> getAll() {
//        return daoCafedraService.getAll();
        return cafedraRepository.findAll();
    }

    public void refresh() {
        cafedraRepository.deleteAll();
        cafedraRepository.saveAll(dataFake.getCafedras());
        groupRepository.deleteAll();
        groupRepository.saveAll(dataFake.getGroups());
    }

    @Override
    public List<Cafedra> searchByName(String str) {
        // по-тупому
//        public List<Cafedra> searchByName(String str) {
//        return this.getAll()
//                .stream()
//                .filter(item -> item.getName().equals(str))
//                .collect(Collectors.toList());

        //по-умному
        return cafedraRepository.findAllByName(str);
//        return cafedraRepository.findAllByNameAndDescription(str);
    }

    @Override
    public List<Cafedra> searchByString(String str) {
        // по-тупому
//        return this.getAll()
//                .stream()
//                .filter(item -> item.getName().contains(str))
//                .collect(Collectors.toList());

        // по-умному
        return cafedraRepository.findAllByNameContains(str);
    }

    @Override
    public Cafedra findBestCafedra() {
        return null;
    }

    @Override
    public List<Cafedra> sortByName(String name, String order) {
        return this.getAll().
                stream()
                .sorted(Comparator.comparing(Cafedra::getName).reversed())
                .collect(Collectors.toList());
    }
}
