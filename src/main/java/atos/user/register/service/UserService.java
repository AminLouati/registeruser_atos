package atos.user.register.service;

import java.time.LocalDate;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atos.user.register.model.User;
import atos.user.register.repository.UserRepository;

//
@Service
public class UserService {
   
   @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        // Exemple : Verifiez si l'utilisateur est majeur (18 ans ou plus)
        LocalDate aujourdHui = LocalDate.now();
        if (user.getBirthdate().plusYears(18).isAfter(aujourdHui)) {
            throw new IllegalArgumentException("Seuls les adultes peuvent s'inscrire.");
        }

        if (!user.getCountryOfResidence().equalsIgnoreCase("France")) {
            throw new IllegalArgumentException("Seuls les résidents français sont autorisés à s'inscrire.");
        }
         System.out.println("Données d'enregistrement fiables.");
        // Enregistrez l'utilisateur dans la base de donnï¿½es
        return userRepository.save(user);
    }

    public User getUserById(Long idUser) {
        return userRepository.findById(idUser)
                .orElseThrow(() -> new EntityNotFoundException("Utilisateur non trouvé"));
    }
}

