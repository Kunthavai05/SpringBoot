package com.Pdf.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Pdf.Entity.Pdf;



public interface PdfRepository extends JpaRepository<Pdf,UUID> {

}
