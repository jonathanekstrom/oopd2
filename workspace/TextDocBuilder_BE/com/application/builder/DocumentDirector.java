package com.application.builder;

import com.domain.documents.BaseDocument;

public class DocumentDirector
{
	public BaseDocument buildGraduationDocument(BaseDocumentBuilder<GraduationBuilder> builder)
	{
		return builder.addHeader().addParagraph().addParagraph().addParagraph().addList().build();
	}

	public BaseDocument buildLetterDocument(BaseDocumentBuilder<LetterBuilder> builder)
	{
		return builder.addHeader().addList().addParagraph().addList().addParagraph().addParagraph().addList().build();
	}

	public BaseDocument buildTaxesDocument(BaseDocumentBuilder<TaxesBuilder> builder)
	{
		return builder.addHeader().addParagraph().addParagraph().addList().addParagraph().build();
	}
}
