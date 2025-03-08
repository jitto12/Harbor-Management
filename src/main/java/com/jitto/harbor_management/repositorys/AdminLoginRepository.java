package com.jitto.harbor_management.repositorys;

import com.jitto.harbor_management.models.AdminLoginModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminLoginRepository extends JpaRepository<AdminLoginModel, Integer> {
    AdminLoginModel findByUserName(String userName);
}
