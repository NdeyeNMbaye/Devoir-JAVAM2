package com.groupeisi.achatenlignems.controller;

import com.groupeisi.achatenlignems.dto.VentesDto;
import com.groupeisi.achatenlignems.service.VentesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ventes")
@RequiredArgsConstructor
public class VentesController {

    private final VentesService ventesService;

    @GetMapping
    public ResponseEntity<List<VentesDto>> findAll() {
        return ResponseEntity.ok(ventesService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<VentesDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(ventesService.findById(id));
    }

    @PostMapping
    public ResponseEntity<VentesDto> save(@RequestBody VentesDto ventesDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ventesService.save(ventesDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<VentesDto> update(@PathVariable Long id, @RequestBody VentesDto ventesDto) {
        return ResponseEntity.ok(ventesService.update(id, ventesDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        ventesService.delete(id);
        return ResponseEntity.noContent().build();
    }
}