package br.com.felipe.gadelha.heranca.domain.repository

import br.com.felipe.gadelha.heranca.domain.entity.Vet
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface VetRepository: JpaRepository<Vet, Long> {

}