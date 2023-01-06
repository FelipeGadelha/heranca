package br.com.felipe.gadelha.heranca.domain.entity

import jakarta.persistence.*

//@Entity
//@Table(name = "users")
//@Inheritance(strategy = InheritanceType.JOINED)
@Embeddable
data class User(
    val name: String,
    val tin: String,
    @ManyToMany(fetch = FetchType.EAGER)
    val profiles: Set<Profile> = emptySet()
)