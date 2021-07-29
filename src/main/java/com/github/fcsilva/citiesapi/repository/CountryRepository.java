package com.github.fcsilva.citiesapi.repository;

import com.github.fcsilva.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
