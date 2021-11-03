package br.com.lucashsouza.dsvendas.service;

import br.com.lucashsouza.dsvendas.dto.SellerDTO;
import br.com.lucashsouza.dsvendas.entities.Seller;
import br.com.lucashsouza.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll() {
        List<Seller> result =  repository.findAll();
        return result.stream().map(seller -> new SellerDTO(seller)).collect(Collectors.toList());
    }
}
