package com.groupeisi.achatenlignems.controller;

import com.groupeisi.achatenlignems.dto.AchatsDto;
import com.groupeisi.achatenlignems.service.AchatsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/achats")
@RequiredArgsConstructor
public class AchatsController {

    private final AchatsService achatsService;

    @GetMapping
    public ResponseEntity<List<AchatsDto>> findAll() {
        return ResponseEntity.ok(achatsService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AchatsDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(achatsService.findById(id));
    }

    @PostMapping
    public ResponseEntity<AchatsDto> save(@RequestBody AchatsDto achatsDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(achatsService.save(achatsDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AchatsDto> update(@PathVariable Long id, @RequestBody AchatsDto achatsDto) {
        return ResponseEntity.ok(achatsService.update(id, achatsDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        achatsService.delete(id);
        return ResponseEntity.noContent().build();
    }
}