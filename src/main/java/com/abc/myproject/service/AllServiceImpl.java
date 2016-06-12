package com.abc.myproject.service;

import com.abc.myproject.entity.PhoneEntity;
import com.abc.myproject.repositories.PhoneRepository;
import com.abc.myproject.vo.PhoneResponse;
import com.abc.myproject.vo.PhoneSaveObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllServiceImpl implements AllService {

    @Autowired
    PhoneRepository phoneRepository;

    @Override
    public PhoneResponse savePhone(PhoneSaveObject phoneSaveObject) {
        PhoneEntity phoneEntity = new PhoneEntity();
        phoneEntity.setName(phoneSaveObject.getName());
        phoneEntity.setBrand(phoneSaveObject.getBrand());
        phoneEntity.setSize(phoneSaveObject.getSize());


        phoneRepository.save(phoneEntity);
        PhoneResponse response = new PhoneResponse(phoneEntity.getId(), phoneEntity.getName(), phoneEntity.getBrand(), phoneEntity.getSize());


        return response;
    }

    @Override
    public PhoneResponse getPhone(long id) {

        PhoneEntity phoneEntity = phoneRepository.findOne(id);
        PhoneResponse response = new PhoneResponse(phoneEntity.getId(), phoneEntity.getName(), phoneEntity.getBrand(), phoneEntity.getSize());

        return response;
    }

    @Override
    public String deletePhone(long id) {
        phoneRepository.delete(id);
        return "deleted";
    }

    @Override
    public PhoneResponse updatePhone(PhoneSaveObject phoneSaveObject, long id) {
        PhoneEntity phoneEntity = phoneRepository.findOne(id);
        phoneEntity.setName(phoneSaveObject.getName());
        phoneEntity.setBrand(phoneSaveObject.getBrand());
        phoneEntity.setSize(phoneSaveObject.getSize());
        phoneRepository.save(phoneEntity);
        PhoneResponse response = new PhoneResponse(phoneEntity.getId(), phoneEntity.getName(), phoneEntity.getBrand(), phoneEntity.getSize());

        return response;
    }
}
