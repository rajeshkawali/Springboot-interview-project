package com.rajeshkawali.qualifier;

public interface University {

	public String display();
}

/*
Which is of higher priority @Primary or @Qualifier?
@Qualifier has higher priority than @Primary annotation. 
In this example we have used both @Primary and @Qualifier together – 
Qualifier has taken higher priority than @Primary.

Can we declare both @Primary and @Qualifier together?
Yes, Both annotations can be used together but only one can be executed at a time. 
(Qualifier first, if qualifier not present it will execute primary)

*/