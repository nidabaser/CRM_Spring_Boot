package dev.nida.crm.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Barcode", nullable = false)
    private String barcode;

    @Column(name = "Product_Name", nullable = false)
    private String productName;

    @Column(name = "VAT_Rate", nullable = false)
    private int vatRate;

    @Column(name = "Brand_ID", nullable = false)
    private int brandId;

    @Column(name = "Description")
    private String description;

    @Column(name = "Stock_Status", nullable = false)
    private int stockStatus;

    @Column(name = "Purchase_Price", nullable = false)
    private BigDecimal purchasePrice;

    @Column(name = "Sale_Price", nullable = false)
    private BigDecimal salePrice;

    @Column(name = "Unit", nullable = false)
    private String unit;

    @Column(name = "Status", nullable = false)
    private Boolean status;

    @Column(name = "Product_Type_ID", nullable = false)
    private int productTypeId;

    @Column(name = "Product_Photo")
    private String productPhoto;
}
