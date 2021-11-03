package br.com.lucashsouza.dsvendas.repositories;

import br.com.lucashsouza.dsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
