package com.practise.pdf.invoice.creator.model;

import com.itextpdf.kernel.color.Color;
import com.practise.pdf.invoice.creator.util.ConstantUtil;

public class HeaderDetails {
	String invoiceTitle = ConstantUtil.INVOICE_TITLE;
	String invoiceNoText = ConstantUtil.INVOICE_NO_TEXT;
	String invoiceDateText = ConstantUtil.INVOICE_DATE_TEXT;
	String invoiceNo = ConstantUtil.EMPTY;
	String invoiceDate = ConstantUtil.EMPTY;
	Color borderColor = Color.GRAY;

	public HeaderDetails setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
		return this;
	}

	public HeaderDetails setInvoiceNoText(String invoiceNoText) {
		this.invoiceNoText = invoiceNoText;
		return this;
	}

	public HeaderDetails setInvoiceDateText(String invoiceDateText) {
		this.invoiceDateText = invoiceDateText;
		return this;
	}

	public HeaderDetails setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
		return this;
	}

	public HeaderDetails setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
		return this;
	}

	public HeaderDetails setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	public HeaderDetails build() {
		return this;
	}

	public String getInvoiceTitle() {
		return invoiceTitle;
	}

	public String getInvoiceNoText() {
		return invoiceNoText;
	}

	public String getInvoiceDateText() {
		return invoiceDateText;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public String getInvoiceDate() {
		return invoiceDate;
	}

	public Color getBorderColor() {
		return borderColor;
	}
}