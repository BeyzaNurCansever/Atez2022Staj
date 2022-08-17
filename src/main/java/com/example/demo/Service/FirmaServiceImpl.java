package com.example.demo.Service;

import com.example.demo.Entity.Adres;
import com.example.demo.Entity.Arac;
import com.example.demo.Entity.Firma;
import com.example.demo.Repository.AdresRepository;
import com.example.demo.Repository.FirmaRepository;
import com.example.demo.Request.AracRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FirmaServiceImpl implements FirmaService {

    @Autowired
    FirmaRepository firmaRepository;

    @Override
    public Optional<Firma> findById(Integer id) {
        return firmaRepository.findById(id);
    }

}
