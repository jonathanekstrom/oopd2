package clients;

import textDocBuilder.abstractions.TextDocBuilder;
import textDocBuilder.interfaces.*;

public class Client
{
	public static void main(String[] args)
	{
		ITextDocBuilder api = new TextDocBuilder();
		
		api.addHeader();
		api.addParagraph();
		api.addTable();
		api.addList();
		
		api.renderDocument();
	}
}
