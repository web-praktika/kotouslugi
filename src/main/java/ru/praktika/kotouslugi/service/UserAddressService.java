package ru.praktika.kotouslugi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.dao.UserAddressRepository;
import ru.praktika.kotouslugi.model.CreateUser;
import ru.praktika.kotouslugi.model.UserAdress;
import java.util.*;
@Service
public class UserAddressService {

    @Autowired
    private UserAddressRepository userAddressRepository;

    public List<UserAdress> getAddressList() {
        List<UserAdress> userAdressesList = new ArrayList<>();
        Iterable<UserAdress> userAdresses = userAddressRepository.findAll();
        userAdresses.forEach(userAdressesList::add);
        return userAdressesList;
    }

    public void saveUserAddress(UserAdress userAdress) {
        userAddressRepository.save(userAdress);
    }
}
