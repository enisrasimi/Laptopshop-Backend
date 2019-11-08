package com.example.springapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="products")

public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;


    @Column(name="product_name")
    private String productName;
    @Column(name="description")
    private String description;
    @Column(name="price")
    private double price;
    @Column(name="imagePath")
    private String imagePath;
    @Column(name="ram")
    private String ram;
    @Column(name="cpu")
    private String cpu;
    @Column(name="graphics")
    private String graphics;
    @Column(name="size")
    private String size;
    @Column(name="ssd")
    private String ssd;




    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name="category_id")
    private Category category;

}
