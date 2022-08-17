package com.example.demo.Service;


import com.example.demo.Entity.Adres;
import com.example.demo.Entity.Arac;
import com.example.demo.Entity.Firma;
import com.example.demo.Repository.AdresRepository;
import com.example.demo.Repository.AracJPARepository;
import com.example.demo.Repository.FirmaRepository;
import com.example.demo.Request.AracRequest;
import com.example.demo.Request.FirmaRequest;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service


public class AracServiceImpl implements AracService{


    @Autowired
    AracJPARepository aracRepository;


    @Override
    public Optional<Arac> findById(Integer id) {
        return aracRepository.findById(id);
    }










}
