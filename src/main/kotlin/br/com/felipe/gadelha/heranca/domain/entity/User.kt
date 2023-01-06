package br.com.felipe.gadelha.heranca.domain.entity

import jakarta.persistence.*

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
abstract class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id: Long? = null,
    open val name: String,
    open val tin: String,
    @ManyToMany(fetch = FetchType.EAGER)
    open var profiles: Set<Profile> = emptySet()
) {
}