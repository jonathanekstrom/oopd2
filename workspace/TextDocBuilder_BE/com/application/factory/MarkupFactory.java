package com.application.factory;

import com.domain.MarkupType;
import com.domain.components.Header;
import com.domain.components.List;
import com.domain.components.Paragraph;

public abstract class MarkupFactory
{
	protected MarkupType type;

	public MarkupFactory(MarkupType type)
	{
		this.type = type;
	}

	public abstract Header createHeader();

	public abstract Paragraph createParagraph();

	public abstract List createList();
}
