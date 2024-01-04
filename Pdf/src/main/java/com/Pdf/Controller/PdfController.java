package com.Pdf.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.context.Context;

import com.Pdf.Entity.Pdf;
import com.Pdf.Repository.PdfRepository;
import com.Pdf.Services.PdfServices;

@RestController
@RequestMapping("/downloadpdf")
public class PdfController {

	@Autowired
	private PdfServices pdfServices;
	@Autowired
	private PdfRepository pdfRepository;

	@GetMapping("/generate-pdf")
	public ResponseEntity<byte[]> generatePdf(Model model) {
		List<Pdf> dataList = pdfRepository.findAll();
try {
		model.addAttribute("data", dataList);

		Context context = new Context();
		context.setVariables(model.asMap());

		byte[] pdfBytes = pdfServices.generatePdfFromTemplate("pdf", context);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_PDF);
		headers.setContentDispositionFormData("inline", "Employee.pdf");

		return new ResponseEntity<>(pdfBytes, headers, HttpStatus.OK);
	}catch(Exception e) {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

	}
}
}
