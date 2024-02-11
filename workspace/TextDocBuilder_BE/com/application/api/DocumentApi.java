package com.application.api;

import com.application.builder.BaseDocumentBuilder;
import com.application.builder.DocumentDirector;
import com.application.builder.GraduationBuilder;
import com.application.builder.LetterBuilder;
import com.application.builder.TaxesBuilder;
import com.application.factory.BaseComponentFactory;
import com.domain.documents.BaseDocument;

public class DocumentApi
{
	private BaseComponentFactory factory;
	private DocumentDirector director;

	public DocumentApi(BaseComponentFactory factory, DocumentDirector director)
	{
		this.factory = factory;
		this.director = director;
	}

	public BaseDocument buildGraduationDocument()
	{
		BaseDocumentBuilder<GraduationBuilder> builder = new GraduationBuilder(factory);
		return director.buildGraduationDocument(builder);
	}

	public BaseDocument buildTaxesDocument()
	{
		BaseDocumentBuilder<TaxesBuilder> builder = new TaxesBuilder(factory);
		return director.buildTaxesDocument(builder);
	}

	public BaseDocument buildLetterDocument()
	{
		BaseDocumentBuilder<LetterBuilder> builder = new LetterBuilder(factory);
		return director.buildLetterDocument(builder);
	}
}
