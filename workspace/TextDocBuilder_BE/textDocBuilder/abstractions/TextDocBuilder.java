package textDocBuilder.abstractions;

import textDocBuilder.core.Document;
import textDocBuilder.enums.ElementTypes;
import textDocBuilder.factories.AbstractElementFactory;
import textDocBuilder.factories.ConcreteElementFactory;
import textDocBuilder.interfaces.IElement;
import textDocBuilder.interfaces.IElementIterator;
import textDocBuilder.interfaces.ITextDocBuilder;

public class TextDocBuilder implements ITextDocBuilder
{
	private AbstractElementFactory elementFactory;
	private Document document;

	public TextDocBuilder()
	{
		this.elementFactory = new ConcreteElementFactory();
		this.document = new Document();
	}

	@Override
	public void addHeader()
	{
		document.addElement(elementFactory.createElement(ElementTypes.HEADER));
	}

	@Override
	public void addParagraph()
	{
		document.addElement(elementFactory.createElement(ElementTypes.PARAGRAPH));
	}

	@Override
	public void addTable()
	{
		document.addElement(elementFactory.createElement(ElementTypes.TABLE));
	}
	
	@Override
	public void addList()
	{
		document.addElement(elementFactory.createElement(ElementTypes.LIST));
	}

	@Override
	public void renderDocument()
	{
		IElementIterator iterator = document.getIterator();
		while (iterator.hasNext())
		{
			IElement element = iterator.next();
			element.render();
		}
	}
}