package br.com.lucashsouza.dsvendas.repositories;

import br.com.lucashsouza.dsvendas.dto.*;
import br.com.lucashsouza.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query(" SELECT new br.com.lucashsouza.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) " +
           " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();


    @Query(" SELECT new br.com.lucashsouza.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) " +
           " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();
}
