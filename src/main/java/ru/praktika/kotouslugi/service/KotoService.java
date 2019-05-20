package ru.praktika.kotouslugi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.praktika.kotouslugi.dao.KotoServiceRepository;
import ru.praktika.kotouslugi.model.KotoServiceEntity;
import ru.praktika.kotouslugi.request.RequestId;

import java.util.LinkedList;
import java.util.List;

@Service
public class KotoService {

    @Autowired
    private KotoServiceRepository kotoServiceRepository;

    /**
     * Получение списка всех сервисов
     *
     * @return - список сервисов
     */
    public List<KotoServiceEntity> listServices() {
        List<KotoServiceEntity> entityList = new LinkedList<>();
        Iterable<KotoServiceEntity> serviceEntities = kotoServiceRepository.findAll();
        serviceEntities.forEach(entityList::add);
        return entityList;
    }

    /**
     * Получение сервиса по его id
     *
     * @param request - запрос с id сервиса
     * @return искомый сервис
     */
    public KotoServiceEntity getServiceById(RequestId request) {
        KotoServiceEntity result = null;
        KotoServiceEntity serviceEntity = kotoServiceRepository.findByServiceId(request.getId());
        if (serviceEntity != null)
            result = serviceEntity;
        return result;
    }
}
