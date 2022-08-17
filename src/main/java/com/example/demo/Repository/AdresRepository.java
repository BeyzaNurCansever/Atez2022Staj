package com.example.demo.Repository;

import com.example.demo.Entity.Adres;
import com.example.demo.Entity.Firma;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository


public interface AdresRepository extends JpaRepository<Adres,Integer> {

}
