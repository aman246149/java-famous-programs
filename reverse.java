class reverse
	{
	 public static String reversevowles(String str)
	  	{
	  		
	  		char[] ch=str.toCharArray();
	  		int j=ch.length-1;
	  		char temp;
	  		int i=0;
	  		while(i>j)
	  		
	  		{
	  			
	  				  if((ch[i]=='a' || ch[i]=='e' || ch[i]=='o' || ch[i]=='i' || ch[i]=='u' ) && (ch[j]=='a' || ch[j]=='e' || ch[j]=='i' || ch[j]=='o' ||ch[j]=='u') )
	  				  	{
	  				  	
	  				  	
	  						temp=ch[i];
	  						ch[i]=ch[j];
	  						ch[j]=temp;
	  						
	  						i++;
	  				  		j--;					
	  						
	  				  	}
	  				  	else
	  				  	{
	  				  	i++;
	  				  	}
	  					
	  					
	  					
	  					
	  		}			
	  				
	  				
	  			
	  			String strr=String.valueOf(ch);
	  	 	
	  	 	return strr;
	  	}
	  	public static void main(String[] args)
	  		{
	  		 	String str=reversevowles("ehllo");
	  		 	System.out.println(str);
	  		}
	  	
	  	
	}
