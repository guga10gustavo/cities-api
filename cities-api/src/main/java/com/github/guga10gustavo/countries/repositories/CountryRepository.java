package com.github.guga10gustavo.countries.repositories;

import com.github.guga10gustavo.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
