package com.jitto.harbor_management.repositorys;

import com.jitto.harbor_management.models.LoginRegisterModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRegisterRepository extends JpaRepository<LoginRegisterModel, Integer> {
    LoginRegisterModel findByUsername(String username);

    LoginRegisterModel findByPhoneNumber(long phoneNumber);
}
