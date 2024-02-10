package com.application.builder;

import com.application.factory.MarkupFactory;
import com.domain.components.IComponent;
import com.domain.documents.Graduation;

public class GraduationBuilder extends DocumentBuilder<GraduationBuilder>
{

	public GraduationBuilder(MarkupFactory factory)
	{
		super(factory);
		super.document = new Graduation();
	}

	@Override
	public GraduationBuilder addHeader()
	{
		IComponent header = factory.createHeader();
		document.add(header);
		return this;
	}

	@Override
	public GraduationBuilder addParagraph()
	{
		IComponent paragraph = factory.createParagraph();
		document.add(paragraph);
		return this;
	}

	@Override
	public GraduationBuilder addList()
	{
		IComponent list = factory.createList();
		document.add(list);
		return this;
	}
}
