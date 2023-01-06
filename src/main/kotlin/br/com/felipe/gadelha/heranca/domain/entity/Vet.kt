package br.com.felipe.gadelha.heranca.domain.entity

import jakarta.persistence.Entity

@Entity
data class Vet(
    override var id: Long? = null,
    val crmv: String,
    override val name: String,
    override val tin: String,
    override var profiles: Set<Profile> = mutableSetOf()
    ): User(
    id = id,
    name = name,
    tin = tin,
    profiles = profiles
) {

}