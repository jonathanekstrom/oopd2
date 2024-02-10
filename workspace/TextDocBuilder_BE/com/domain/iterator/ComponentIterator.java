package com.domain.iterator;

import java.util.List;

import com.domain.components.IComponent;

public class ComponentIterator implements IIterator<IComponent>
{
	private List<IComponent> items;
	private int position = 0;

	public ComponentIterator(List<IComponent> items)
	{
		this.items = items;
	}

	@Override
	public boolean hasNext()
	{
		return position < items.size();
	}

	@Override
	public IComponent getNext()
	{
		if (this.hasNext())
		{
			return items.get(position++);
		}
		return null;
	}
}
