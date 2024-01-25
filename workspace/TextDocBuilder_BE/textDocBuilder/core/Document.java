package textDocBuilder.core;

import java.util.ArrayList;
import java.util.List;

import textDocBuilder.interfaces.IDocument;
import textDocBuilder.interfaces.IElement;
import textDocBuilder.interfaces.IElementIterator;

// Composite class for the elements within a document
public class Document implements IDocument
{
	private List<IElement> elements = new ArrayList<>();

	@Override
	public IElementIterator getIterator()
	{
		return new ElementIterator();
	}

	public void addElement(IElement component)
	{
		elements.add(component);
	}

	private class ElementIterator implements IElementIterator
	{
		private int currentIndex = 0;

		@Override
		public boolean hasNext()
		{
			return currentIndex < elements.size();
		}

		@Override
		public IElement next()
		{
			if (!hasNext())
			{
				return null;
			}

			IElement element = elements.get(currentIndex);
			currentIndex++;
			return element;
		}
	}
}