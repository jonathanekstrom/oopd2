package textDocBuilder.elements;

import textDocBuilder.interfaces.IElement;

public class Table implements IElement
{
	@Override
	public void render()
	{
		System.out.println("I'm a Table");
	}
}