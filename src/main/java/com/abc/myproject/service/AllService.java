package com.abc.myproject.service;

import com.abc.myproject.vo.PhoneResponse;
import com.abc.myproject.vo.PhoneSaveObject;

public interface AllService {

    PhoneResponse savePhone(PhoneSaveObject phoneSaveObject);

    PhoneResponse getPhone(long id);

    String deletePhone(long id);

    PhoneResponse updatePhone(PhoneSaveObject phoneSaveObject, long id);
}
