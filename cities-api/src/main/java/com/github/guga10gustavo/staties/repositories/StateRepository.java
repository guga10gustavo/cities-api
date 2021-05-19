package com.github.guga10gustavo.staties.repositories;

import com.github.guga10gustavo.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
