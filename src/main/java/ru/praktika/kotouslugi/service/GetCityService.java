package ru.praktika.kotouslugi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.dao.GetCityRepository;
import ru.praktika.kotouslugi.model.GetCity;
import java.util.*;
@Service
public class GetCityService {

    @Autowired
    private GetCityRepository getCityRepository;

    public List<GetCity> getCitiesList() {
        List<GetCity> getCityList = new ArrayList<>();
        Iterable<GetCity> getCities = getCityRepository.findAll();
        getCities.forEach(getCityList::add);
        return getCityList;
    }
}
