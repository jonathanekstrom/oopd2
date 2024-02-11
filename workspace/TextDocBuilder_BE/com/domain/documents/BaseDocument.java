package com.domain.documents;

import java.util.ArrayList;
import java.util.List;

import com.domain.components.IComponent;
import com.domain.iterator.ComponentIterator;
import com.domain.iterator.IIterator;

public abstract class BaseDocument
{
	private String type;
	private List<IComponent> components = new ArrayList<>();

	public BaseDocument(String type)
	{
		this.type = type;
	}

	public void add(IComponent component)
	{
		this.components.add(component);
	}

	public List<IComponent> getComponents()
	{
		return this.components;
	}
	
	@Override
	public String toString() {
		return this.type;
	}
	
	public void show()
	{
		IIterator<IComponent> iterator = new ComponentIterator(components);
		System.out.println("-----Document Start-----");
		while (iterator.hasNext())
		{
			iterator.getNext().render();
		}
		System.out.println("-----Document End-----");
	}
}
