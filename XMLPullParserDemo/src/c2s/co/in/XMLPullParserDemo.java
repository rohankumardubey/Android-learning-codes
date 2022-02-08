package c2s.co.in;

import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import android.app.Activity;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.widget.TextView;

public class XMLPullParserDemo extends Activity {
	String str;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView myText=(TextView)findViewById(R.id.mytext);
        try {
			str=getEventsFromAnXMLFile(this);
		} catch (XmlPullParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        myText.setText(str);
        
    }
	private String getEventsFromAnXMLFile(XMLPullParserDemo xmlPullParserDemo) throws XmlPullParserException, IOException {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		Resources res=xmlPullParserDemo.getResources();
		XmlResourceParser xpp = res.getXml(R.xml.test);
		xpp.next();
		int eventType = xpp.getEventType();
		while (eventType != XmlPullParser.END_DOCUMENT)
		{
		if(eventType == XmlPullParser.START_DOCUMENT)
		{
		sb.append("******Start document");
		}
		else if(eventType == XmlPullParser.START_TAG)
		{
		sb.append("\nStart tag "+xpp.getName());
		}
		else if(eventType == XmlPullParser.END_TAG)
		{
		sb.append("\nEnd tag "+xpp.getName());
		}
		else if(eventType == XmlPullParser.TEXT)
		{sb.append("\nText "+xpp.getText());
		}
		eventType = xpp.next();
		}//eof-while
		sb.append("\n******End document");
		return sb.toString();
		
	}
}