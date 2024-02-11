package com.application.builder;

import com.application.factory.BaseComponentFactory;
import com.domain.documents.BaseDocument;

public abstract class BaseDocumentBuilder<T>
{
	protected BaseDocument document;
	protected BaseComponentFactory factory;

	protected BaseDocumentBuilder(BaseComponentFactory factory)
	{
		this.factory = factory;
	}

	public abstract T addHeader();

	public abstract T addParagraph();

	public abstract T addList();

	public BaseDocument build()
	{
		return document;
	};
}
