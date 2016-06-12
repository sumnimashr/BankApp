package com.abc.myproject.web.controller;


import com.abc.myproject.service.AllService;
import com.abc.myproject.vo.PhoneResponse;
import com.abc.myproject.vo.PhoneSaveObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "")
public class PhoneController {

    @Autowired
    AllService allService;

    @RequestMapping(method = RequestMethod.POST, value = "/phone")
    public PhoneResponse savePhone(@RequestBody PhoneSaveObject phoneSaveObject) {
        PhoneResponse response = allService.savePhone(phoneSaveObject);
        return response;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/phone/{id}")
    public PhoneResponse getPhone(@PathVariable long id) {
        PhoneResponse response = allService.getPhone(id);
        return response;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/phone/{id}")
    public PhoneResponse updatePhone(@RequestBody PhoneSaveObject phoneSaveObject, @PathVariable long id) {
        PhoneResponse response = allService.updatePhone(phoneSaveObject, id);
        return response;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/phone/{id}")
    public String deletePhone(@PathVariable long id) {
        String response = allService.deletePhone(id);
        return response;
    }

}
