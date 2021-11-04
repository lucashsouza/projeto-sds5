package br.com.lucashsouza.dsvendas.repositories;

import br.com.lucashsouza.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
