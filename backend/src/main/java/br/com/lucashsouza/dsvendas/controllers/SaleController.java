package br.com.lucashsouza.dsvendas.controllers;

import br.com.lucashsouza.dsvendas.dto.SaleDTO;
import br.com.lucashsouza.dsvendas.dto.SellerDTO;
import br.com.lucashsouza.dsvendas.entities.Sale;
import br.com.lucashsouza.dsvendas.service.SaleService;
import br.com.lucashsouza.dsvendas.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        Page<SaleDTO> list = service.findAll(pageable);
        return ResponseEntity.ok(list);
    }
}
