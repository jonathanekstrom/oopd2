package com.domain.components;

import com.domain.MarkupType;

public class Paragraph implements IComponent
{
	private MarkupType type;

	public Paragraph(MarkupType type)
	{
		this.type = type;
	}

	@Override
	public void render()
	{
		switch (type)
		{
		case HTML:
			System.out.println("<p>Paragraph</p>");
			break;
		case INTERNAL:
			System.out.println("PARAGRAPH");
			break;
		default:
			break;
		}
	}
}
