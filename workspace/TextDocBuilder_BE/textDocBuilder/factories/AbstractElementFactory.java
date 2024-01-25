package textDocBuilder.factories;

import textDocBuilder.enums.ElementTypes;
import textDocBuilder.interfaces.IElement;

public abstract class AbstractElementFactory
{
	public IElement createElement(ElementTypes type)
	{
		IElement element = getElement(type);
		// additional preparation steps can be added here
		return element;
	}

	protected abstract IElement getElement(ElementTypes type);
}
