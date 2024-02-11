package clients;

import com.application.api.DocumentApi;
import com.application.builder.DocumentDirector;
import com.application.factory.*;
import com.domain.MarkupType;
import com.domain.documents.BaseDocument;

public class Client
{
	public static void main(String[] args)
	{
		run();
	}

	private static void run()
	{
		BaseComponentFactory fac1 = new ComponentFactory(MarkupType.HTML);
		BaseComponentFactory fac2 = new ComponentFactory(MarkupType.INTERNAL);
		
		DocumentApi api2 = new DocumentApi(fac1, new DocumentDirector());
		BaseDocument graduationDocument2 = api2.buildGraduationDocument();
		BaseDocument taxesDocument2 = api2.buildTaxesDocument();
		BaseDocument letterDocument2 = api2.buildLetterDocument();
		
		DocumentApi api = new DocumentApi(fac2, new DocumentDirector());
		BaseDocument graduationDocument = api.buildGraduationDocument();
		BaseDocument taxesDocument = api.buildTaxesDocument();
		BaseDocument letterDocument = api.buildLetterDocument();

		taxesDocument.show();
		graduationDocument.show();
		letterDocument.show();
		
		graduationDocument2.show();
		taxesDocument2.show();
		letterDocument2.show();
	}
}
