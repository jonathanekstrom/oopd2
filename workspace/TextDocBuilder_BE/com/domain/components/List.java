package com.domain.components;

import java.util.ArrayList;

import com.domain.MarkupType;

public class List implements IComponent
{

	private java.util.List<String> items = new ArrayList<String>();
	private MarkupType type;

	public List(MarkupType type)
	{
		this.type = type;
		this.items.add("This");
		this.items.add("Is");
		this.items.add("A");
		this.items.add("List");
	}

	@Override
	public void render()
	{
		StringListIterator iterator = new StringListIterator();

		switch (type)
		{
		case HTML:
			System.out.println("<ul>");
			while (iterator.hasNext())
			{
				System.out.println("<li>" + iterator.getNext() + "</li>");
			}
			System.out.println("</ul>");
			break;
		case INTERNAL:
			while (iterator.hasNext())
			{
				System.out.println("* " + iterator.getNext());
			}
			break;
		default:
			break;
		}
	}

	private class StringListIterator
	{
		private int position = 0;

		public boolean hasNext()
		{
			return position < items.size();
		}

		public String getNext()
		{
			if (this.hasNext())
			{
				return items.get(position++);
			}
			return null;
		}
	}
}
