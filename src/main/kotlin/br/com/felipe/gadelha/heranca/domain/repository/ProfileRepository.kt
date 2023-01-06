package br.com.felipe.gadelha.heranca.domain.repository

import br.com.felipe.gadelha.heranca.domain.entity.Profile
import org.springframework.data.jpa.repository.JpaRepository

interface ProfileRepository: JpaRepository<Profile, Long> {

}
