package ru.praktika.kotouslugi.service;

import antlr.build.Tool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.dao.CreateCatRepository;
import ru.praktika.kotouslugi.exception.ServiceException;
import ru.praktika.kotouslugi.model.CreateCat;
import ru.praktika.kotouslugi.model.Field;
import ru.praktika.kotouslugi.model.enums.RequisitionStatus;
import java.lang.*;
import java.util.*;


@Service
public class CreateCatService {



    @Autowired
    private CreateCatRepository createCatRepository;

    public void saveCreateCat(CreateCat createCat) {
        createCatRepository.save(createCat);
    }

    public void updateCreateCat(Map<String, Object> createCat) {
        String id = String.valueOf(createCat.get("cat_ID"));
        String Owner_id = String.valueOf(createCat.get("owner_ID"));
        Integer idRequisite = Integer.parseInt(id);
        Integer OWNER_ID = Integer.parseInt(Owner_id);
        CreateCat createCat1 = createCatRepository.findById(idRequisite).orElse(null);
        if(createCat1 != null)
        {
            createCat.forEach((s, o) -> {
                if (s.equals("owner_ID")) {
                    createCat1.setOWNER_ID(Integer.parseInt(o.toString()));
                }
            });

        }

        createCatRepository.save(createCat1);

    }

    public List<CreateCat> getCreateCatList() {
        List<CreateCat> createUserList = new ArrayList<>();
        Iterable<CreateCat> createUsers = createCatRepository.findAll();
        createUsers.forEach(createUserList::add);
        return createUserList;
    }


    public CreateCat getCreateCat(Integer id) {
        return createCatRepository.findById(id).orElse(null);
    }
}
