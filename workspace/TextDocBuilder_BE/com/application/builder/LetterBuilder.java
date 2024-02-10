package com.application.builder;

import com.application.factory.MarkupFactory;
import com.domain.components.IComponent;
import com.domain.documents.Letter;

public class LetterBuilder extends DocumentBuilder<LetterBuilder>
{
	public LetterBuilder(MarkupFactory factory)
	{
		super(factory);
		super.document = new Letter();
	}

	@Override
	public LetterBuilder addHeader()
	{
		IComponent header = factory.createHeader();
		document.add(header);
		return this;
	}

	@Override
	public LetterBuilder addParagraph()
	{
		IComponent paragraph = factory.createParagraph();
		document.add(paragraph);
		return this;
	}

	@Override
	public LetterBuilder addList()
	{
		IComponent list = factory.createList();
		document.add(list);
		return this;
	}
}
