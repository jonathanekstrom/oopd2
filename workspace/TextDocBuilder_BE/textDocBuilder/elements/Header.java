package textDocBuilder.elements;

import textDocBuilder.interfaces.IElement;

public class Header implements IElement
{

	public Header()
	{

	}

	@Override
	public void render()
	{
		System.out.println("I'm a Header with fontSize ");
	}

}