package com.abc.myproject.repositories;


import com.abc.myproject.entity.PhoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface PhoneRepository extends JpaRepository<PhoneEntity, Long> {
}
