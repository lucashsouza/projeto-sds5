package br.com.lucashsouza.dsvendas.service;

import br.com.lucashsouza.dsvendas.dto.SaleDTO;
import br.com.lucashsouza.dsvendas.entities.Sale;
import br.com.lucashsouza.dsvendas.repositories.SaleRepository;
import br.com.lucashsouza.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result =  repository.findAll(pageable);
        return result.map(sale -> new SaleDTO(sale));
    }
}
