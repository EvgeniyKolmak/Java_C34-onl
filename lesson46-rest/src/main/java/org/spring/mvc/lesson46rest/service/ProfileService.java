package org.spring.mvc.lesson46rest.service;

import org.spring.mvc.lesson46rest.dto.ProfileDto;
import org.spring.mvc.lesson46rest.exc.ProfileNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfileService {

    private List<ProfileDto> profiles = new ArrayList<>();

    public ProfileDto getByUsername(String username) {
        return profiles.stream()
                .filter(profileDto -> profileDto.getName().equalsIgnoreCase(username))
                .findFirst()
                .orElseThrow(() -> new ProfileNotFoundException(username));
    }

    public List<ProfileDto> getAllProfiles() {
        return profiles;
    }

    public ProfileDto saveProfile(ProfileDto profileDto) {
        profiles.add(profileDto);
        return profileDto;
    }

    public void deleteProfile(String username) {
        profiles
                .removeIf(profileDto -> profileDto.getName().equalsIgnoreCase(username));
    }

    public ProfileDto updateProfile(String username, ProfileDto profileDto) {
        var exist = profiles
                .stream()
                .filter(p -> p.getName().equalsIgnoreCase(username))
                .findFirst()
                .get();

        exist.setName(profileDto.getName());
        exist.setAge(profileDto.getAge());
        exist.setIsAdmin(profileDto.getIsAdmin());

        return exist;
    }

}
