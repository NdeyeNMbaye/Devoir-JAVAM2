package com.groupeisi.achatenlignems.controller;

import com.groupeisi.achatenlignems.dto.ProduitsDto;
import com.groupeisi.achatenlignems.service.ProduitsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produits")
@RequiredArgsConstructor
public class ProduitsController {

    private final ProduitsService produitsService;

    @GetMapping
    public ResponseEntity<List<ProduitsDto>> findAll() {
        return ResponseEntity.ok(produitsService.findAll());
    }

    @GetMapping("/{ref}")
    public ResponseEntity<ProduitsDto> findById(@PathVariable String ref) {
        return ResponseEntity.ok(produitsService.findById(ref));
    }

    @PostMapping
    public ResponseEntity<ProduitsDto> save(@RequestBody ProduitsDto produitsDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(produitsService.save(produitsDto));
    }

    @PutMapping("/{ref}")
    public ResponseEntity<ProduitsDto> update(@PathVariable String ref, @RequestBody ProduitsDto produitsDto) {
        return ResponseEntity.ok(produitsService.update(ref, produitsDto));
    }

    @DeleteMapping("/{ref}")
    public ResponseEntity<Void> delete(@PathVariable String ref) {
        produitsService.delete(ref);
        return ResponseEntity.noContent().build();
    }
}