package com.application.commands;

import com.domain.components.IComponent;
import com.domain.documents.BaseDocument;

public class AddComponent implements ICommand
{

	private BaseDocument doc;
	private IComponent comp;

	public AddComponent(BaseDocument doc, IComponent comp)
	{
		this.doc = doc;
		this.comp = comp;
	}

	@Override
	public void execute()
	{
		this.doc.add(comp);

	}

	@Override
	public void undo()
	{
		
	}

}
