public static int buyuUnluUyumu(String s){
	    int length = s.length();

	    int dummy=0;

	    if(s.isEmpty())
	    	return 0;
	    char[] y = new char[length];
	    for(int i = 0; i < length; i++){
	        y[i] = s.charAt(length - i - 1);
	    }
	  	for(int i =0;i<s.length();i++){
	  		if(y[i]=='a' || y[i]=='o' || y[i]=='u' || y[i]=='ı' )
	  			dummy=dummy+1;	
	  	}
		for(int i =0;i<s.length();i++)
	  		if(y[i]=='e' || y[i]=='ö' || y[i]=='ü' || y[i]=='i' )
	  			if(dummy>0)
	  				return 0;
	  
		return 1;
	    }
