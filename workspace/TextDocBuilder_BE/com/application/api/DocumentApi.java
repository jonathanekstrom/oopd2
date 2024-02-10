package com.application.api;

import com.application.builder.DocumentBuilder;
import com.application.builder.DocumentDirector;
import com.application.builder.GraduationBuilder;
import com.application.builder.LetterBuilder;
import com.application.builder.TaxesBuilder;
import com.application.factory.MarkupFactory;
import com.domain.documents.Document;

public class DocumentApi
{
	private MarkupFactory factory;
	private DocumentDirector director;

	public DocumentApi(MarkupFactory factory, DocumentDirector director)
	{
		this.factory = factory;
		this.director = director;
	}

	public Document buildGraduationDocument()
	{
		DocumentBuilder<GraduationBuilder> builder = new GraduationBuilder(factory);
		return director.buildGraduationDocument(builder);
	}

	public Document buildTaxesDocument()
	{
		DocumentBuilder<TaxesBuilder> builder = new TaxesBuilder(factory);
		return director.buildTaxesDocument(builder);
	}

	public Document buildLetterDocument()
	{
		DocumentBuilder<LetterBuilder> builder = new LetterBuilder(factory);
		return director.buildLetterDocument(builder);
	}
}
