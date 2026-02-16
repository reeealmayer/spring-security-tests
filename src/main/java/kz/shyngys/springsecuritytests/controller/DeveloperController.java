package kz.shyngys.springsecuritytests.controller;

import kz.shyngys.springsecuritytests.model.Developer;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping(value = "/api/v1/developers")
public class DeveloperController {
    private static List<Developer> DEVELOEPRS
            = Stream.of(
            new Developer("first", "first"),
            new Developer("second", "second")).collect(Collectors.toList());

    @GetMapping
    @PreAuthorize("hasAuthority('developers:read')")
    public ResponseEntity<List<Developer>> getAll() {
        return ResponseEntity.ok().body(DEVELOEPRS);
    }

    @PostMapping
    @PreAuthorize("hasAuthority('developers:write')")
    public ResponseEntity<Developer> create(@RequestBody Developer developer) {
        DEVELOEPRS.add(developer);
        return ResponseEntity.ok().body(developer);
    }
}
