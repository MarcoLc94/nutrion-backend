package com.nutrion.nutrionbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nutrion.nutrionbackend.domain.QrCode;

public interface QrRepository extends JpaRepository<QrCode, Long> {
    List<QrCode> findByUserId(Long userId);
    
}
