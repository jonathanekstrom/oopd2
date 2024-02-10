package com.domain.components;

import com.domain.MarkupType;

public class Header implements IComponent
{
	private MarkupType type;

	public Header(MarkupType type)
	{
		this.type = type;
	}

	@Override
	public void render()
	{
		switch (type)
		{
		case HTML:
			System.out.println("<h1>header</h1>");
			break;
		case INTERNAL:
			System.out.println("HEADER");
			break;
		default:
			break;
		}
	}
}
