package br.com.felipe.gadelha.heranca.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Proprietor(
    override var id: Long? = null,
    val animal: String,
    override val name: String,
    override val tin: String,
    override var profiles: Set<Profile> = mutableSetOf()
): User(id, name, tin, profiles)