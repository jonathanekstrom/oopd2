package com.application.builder;

import com.domain.documents.Document;

public class DocumentDirector
{
	public Document buildGraduationDocument(DocumentBuilder<GraduationBuilder> builder)
	{
		return builder.addHeader().addParagraph().addParagraph().addParagraph().addList().build();
	}

	public Document buildLetterDocument(DocumentBuilder<LetterBuilder> builder)
	{
		return builder.addHeader().addList().addParagraph().addList().addParagraph().addParagraph().addList().build();
	}

	public Document buildTaxesDocument(DocumentBuilder<TaxesBuilder> builder)
	{
		return builder.addHeader().addParagraph().addParagraph().addList().addParagraph().build();
	}
}
