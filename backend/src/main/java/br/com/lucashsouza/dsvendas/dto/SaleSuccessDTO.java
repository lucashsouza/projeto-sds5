package br.com.lucashsouza.dsvendas.dto;

import br.com.lucashsouza.dsvendas.entities.*;

import java.io.*;

public class SaleSuccessDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sellerName;
    private long visited;
    private long deals;

    public SaleSuccessDTO() {
    }

    public SaleSuccessDTO(Seller seller, long visited, long deals) {
        sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public long getVisited() {
        return visited;
    }

    public void setVisited(long visited) {
        this.visited = visited;
    }

    public long getDeals() {
        return deals;
    }

    public void setDeals(long deals) {
        this.deals = deals;
    }
}
