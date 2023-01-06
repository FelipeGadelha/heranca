package br.com.felipe.gadelha.heranca.domain.jpa

import br.com.felipe.gadelha.heranca.HerancaApplication
import br.com.felipe.gadelha.heranca.domain.entity.Profile
import br.com.felipe.gadelha.heranca.domain.entity.Proprietor
import br.com.felipe.gadelha.heranca.domain.entity.User
import br.com.felipe.gadelha.heranca.domain.entity.Vet
import br.com.felipe.gadelha.heranca.domain.repository.ProfileRepository
import br.com.felipe.gadelha.heranca.domain.repository.ProprietorRepository
import br.com.felipe.gadelha.heranca.domain.repository.VetRepository
import org.springframework.boot.WebApplicationType
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.context.ApplicationContext


object AddKitchen {
    @JvmStatic
    fun main(args: Array<String>) {
        val applicationContext: ApplicationContext = SpringApplicationBuilder(
            HerancaApplication::class.java
        )
            .web(WebApplicationType.NONE)
            .run(*args)
        val vetRepository: VetRepository = applicationContext.getBean(VetRepository::class.java)
        val proprietorRepository: ProprietorRepository = applicationContext.getBean(ProprietorRepository::class.java)
        val profileRepository: ProfileRepository = applicationContext.getBean(ProfileRepository::class.java)

        val profileVet = Profile(null, "VET")
        val profileUser = Profile(null, "USER")

        profileRepository.save(profileVet)
        profileRepository.save(profileUser)

//        user = User(name = "Isabella", tin = "tin", mutableSetOf(profileVet)),

        val vet = Vet(
            id = null,
            name = "Isabella",
            tin = "tin",
            profiles = mutableSetOf(profileVet),
            crmv = "tin"
        )
        vetRepository.save(vet)

        System.err.println("vet: $vet")

        val proprietor = Proprietor(
            id = null,
            name = "Isabella",
            tin = "tin",
            profiles = mutableSetOf(profileUser),
            animal = "pug",
        )
        proprietorRepository.save(proprietor)

        System.err.println("proprietario: $proprietor")
    }
}