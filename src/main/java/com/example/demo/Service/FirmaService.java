package com.example.demo.Service;

import com.example.demo.Entity.Adres;
import com.example.demo.Entity.Firma;
import com.example.demo.Repository.AdresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface FirmaService {

    Optional<Firma> findById(Integer id);

}
