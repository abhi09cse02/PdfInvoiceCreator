package com.practise.pdf.invoice.creator.main;

import com.practise.pdf.invoice.creator.model.AddressDetails;
import com.practise.pdf.invoice.creator.model.HeaderDetails;
import com.practise.pdf.invoice.creator.model.Product;
import com.practise.pdf.invoice.creator.model.ProductTableHeader;
import com.practise.pdf.invoice.creator.service.CodingErrorPdfInvoiceCreator;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PdfInvoiceCreator {
	public static void main(String[] args) throws FileNotFoundException {
		    LocalDate ld = LocalDate.now();
		    String pdfName = ld + ".pdf";
			CodingErrorPdfInvoiceCreator cepdf = new CodingErrorPdfInvoiceCreator(pdfName);
			cepdf.createDocument();
			
			// Create Header start
			HeaderDetails header = new HeaderDetails();
			header.setInvoiceNo("RK3562332").setInvoiceDate(LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))).build();
			cepdf.createHeader(header);
			// Header End

			// Create Address start
			AddressDetails addressDetails = new AddressDetails();
			addressDetails.setBillingCompany("Nidhi Technology Pvt. Ltd.").setBillingName("Abhijeet Kumar\n")
					.setBillingAddress("Ganpati Bhandhar \n Gandhi Maidan, Near Petrol Pump \n Patna, Pin:- 800001")
					.setBillingEmail("abhi**cse**02@gmail.com").setShippingName("Abhijeet Kumar\n")
					.setShippingAddress("Ganpati Bhandhar \n Gandhi Maidan, Near Petrol Pump \n Patna, Pin:- 800001")
					.build();
			cepdf.createAddress(addressDetails);
			// Address end

			// Product Start
			ProductTableHeader productTableHeader = new ProductTableHeader();
			cepdf.createTableHeader(productTableHeader);
			List<Product> productList = cepdf.getDummyProductList();
			productList = cepdf.modifyProductList(productList);
			cepdf.createProduct(productList);
			// Product End

			// Term and Condition Start
			List<String> termAndConditionsList = new ArrayList<>();
			termAndConditionsList.add("1. The Seller shall not be liable to the Buyer directly or indirectly for any loss or damage suffered by the Buyer.");
			termAndConditionsList.add("2. The Seller warrants the product for ten (10) days from the date of shipment");
			String imagePath = "src/main/resources/1682080999193.jpg";
			cepdf.createTermsAndCondition(termAndConditionsList, false, imagePath);
			// Term and condition end
		System.out.println("pdf genrated");
	}
}