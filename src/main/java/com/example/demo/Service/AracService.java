package com.example.demo.Service;

import com.example.demo.Entity.Adres;
import com.example.demo.Entity.Arac;
import com.example.demo.Entity.Firma;
import com.example.demo.Repository.AracJPARepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



public interface AracService {


      Optional<Arac> findById(Integer id);

}
