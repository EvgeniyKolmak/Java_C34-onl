package org.spring.mvc.lesson46rest.web;

import lombok.RequiredArgsConstructor;
import org.spring.mvc.lesson46rest.dto.ProfileDto;
import org.spring.mvc.lesson46rest.service.ProfileService;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/profile")
@RequiredArgsConstructor
public class ProfileController {

    private final ProfileService service;

    @GetMapping
    public ProfileDto getProfile(@RequestParam(name = "username") String name) {
        return service.getByUsername(name);
    }

    @GetMapping("/all")
    public List<ProfileDto> getAllProfiles() {
        return service.getAllProfiles();
    }

    @PostMapping
    public ResponseEntity<ProfileDto> saveProfile(@RequestBody ProfileDto profileDto) {
        var result = service.saveProfile(profileDto);

        return ResponseEntity.status(201).header("testKey", "testValue")
                .body(result);
    }

    @DeleteMapping
    public void deleteProfile(@RequestParam(name = "username") String name) {
        service.deleteProfile(name);
    }

    @PutMapping
    public ProfileDto updateProfile(@RequestParam(name = "username") String username,  @RequestBody ProfileDto profileDto) {
        return service.updateProfile(username, profileDto);
    }

}
