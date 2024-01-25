package textDocBuilder.elements;

import textDocBuilder.interfaces.IElement;

public class List implements IElement
{
	@Override
	public void render()
	{
		System.out.println("I'm a List");
	}
}
