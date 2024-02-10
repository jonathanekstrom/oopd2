package com.application.builder;

import com.application.factory.MarkupFactory;
import com.domain.documents.Document;

public abstract class DocumentBuilder<T>
{
	protected Document document;
	protected MarkupFactory factory;

	protected DocumentBuilder(MarkupFactory factory)
	{
		this.factory = factory;
	}

	public abstract T addHeader();

	public abstract T addParagraph();

	public abstract T addList();

	public Document build()
	{
		return document;
	};
}
