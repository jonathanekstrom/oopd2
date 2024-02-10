package clients;

import com.application.api.DocumentApi;
import com.application.builder.DocumentDirector;
import com.application.factory.*;
import com.domain.MarkupType;
import com.domain.documents.Document;

public class Client
{
	public static void main(String[] args)
	{
		run();
	}

	private static void run()
	{
		MarkupFactory fac1 = new ComponentFactory(MarkupType.HTML);
		MarkupFactory fac2 = new ComponentFactory(MarkupType.INTERNAL);
		
		DocumentApi api2 = new DocumentApi(fac1, new DocumentDirector());
		Document graduationDocument2 = api2.buildGraduationDocument();
		Document taxesDocument2 = api2.buildTaxesDocument();
		Document letterDocument2 = api2.buildLetterDocument();
		
		DocumentApi api = new DocumentApi(fac2, new DocumentDirector());
		Document graduationDocument = api.buildGraduationDocument();
		Document taxesDocument = api.buildTaxesDocument();
		Document letterDocument = api.buildLetterDocument();

		taxesDocument.show();
		graduationDocument.show();
		letterDocument.show();
		
		graduationDocument2.show();
		taxesDocument2.show();
		letterDocument2.show();
	}
}
