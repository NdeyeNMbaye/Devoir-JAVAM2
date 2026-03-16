package com.groupeisi.achatenlignems.controller;

import com.groupeisi.achatenlignems.dto.UserAccountDto;
import com.groupeisi.achatenlignems.service.UserAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserAccountController {

    private final UserAccountService userAccountService;

    @GetMapping
    public ResponseEntity<List<UserAccountDto>> findAll() {
        return ResponseEntity.ok(userAccountService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserAccountDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(userAccountService.findById(id));
    }

    @PostMapping
    public ResponseEntity<UserAccountDto> save(@RequestBody UserAccountDto userAccountDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userAccountService.save(userAccountDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserAccountDto> update(@PathVariable Long id, @RequestBody UserAccountDto userAccountDto) {
        return ResponseEntity.ok(userAccountService.update(id, userAccountDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        userAccountService.delete(id);
        return ResponseEntity.noContent().build();
    }
}