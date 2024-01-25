package textDocBuilder.factories;

import textDocBuilder.elements.Header;
import textDocBuilder.elements.List;
import textDocBuilder.elements.Paragraph;
import textDocBuilder.elements.Table;
import textDocBuilder.enums.ElementTypes;
import textDocBuilder.interfaces.IElement;

public class ConcreteElementFactory extends AbstractElementFactory
{
	@Override
	protected IElement getElement(ElementTypes type)
	{
		switch (type)
		{
		case PARAGRAPH:
			return new Paragraph();
		case HEADER:
			return new Header();
		case TABLE:
			return new Table();
		case LIST:
			return new List();
		default:
			break;
		}

		return null;
	}

}
