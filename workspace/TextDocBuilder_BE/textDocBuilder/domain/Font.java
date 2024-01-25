package textDocBuilder.domain;

import textDocBuilder.enums.FontSizes;
import textDocBuilder.enums.FontTypes;

public class Font
{
	private FontSizes size;
	private FontTypes type;

	public Font(FontSizes size, FontTypes type)
	{
		this.setSize(size);
		this.setType(type);
	}

	public FontTypes getType()
	{
		return type;
	}

	public void setType(FontTypes type)
	{
		this.type = type;
	}

	public FontSizes getSize()
	{
		return size;
	}

	public void setSize(FontSizes size)
	{
		this.size = size;
	}
}