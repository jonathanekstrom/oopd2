package com.application.builder;

import com.application.factory.BaseComponentFactory;
import com.domain.components.IComponent;
import com.domain.documents.Taxes;

public class TaxesBuilder extends BaseDocumentBuilder<TaxesBuilder>
{
	public TaxesBuilder(BaseComponentFactory factory)
	{
		super(factory);
		super.document = new Taxes();
	}

	@Override
	public TaxesBuilder addHeader()
	{
		IComponent header = factory.createHeader();
		document.add(header);
		return this;
	}

	@Override
	public TaxesBuilder addParagraph()
	{
		IComponent paragraph = factory.createParagraph();
		document.add(paragraph);
		return this;
	}

	@Override
	public TaxesBuilder addList()
	{
		IComponent list = factory.createList();
		document.add(list);
		return this;
	}
}
