package com.application.factory;

import com.domain.MarkupType;
import com.domain.components.Header;
import com.domain.components.List;
import com.domain.components.Paragraph;

public class ComponentFactory extends MarkupFactory
{
	public ComponentFactory(MarkupType type)
	{
		super(type);
	}

	@Override
	public Header createHeader()
	{
		return new Header(type);
	}

	@Override
	public Paragraph createParagraph()
	{
		return new Paragraph(type);
	}

	@Override
	public List createList()
	{
		return new List(type);
	}
}
