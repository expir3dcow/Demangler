






public class Main {

	public static void main(String[] args) {
		 String str = "_ZN9ChestTile4initEv";
		 
		
		 
		 
		 String result = str.replaceAll("\\d", "#");
		 
		 String slices[] = result.split("#");
		 
		 
		 
		 
		
		 System.out.println("~~~RESULT~~~");
		 String className = slices[1];
		 String functionNameAndParams = slices[2];
		 
		 String splits[] = functionNameAndParams.split("E");
		 
		 String functionName = splits[0];
		 
		 
		 String a = splits[1];

		 String params = "(";
		 
		 for(int i = 0; i < a.length();i++){
			 switch(a.charAt(i)){
			 	case 'i':
			 		params+= ("int,");
			 	break;
			 	case 'b':
			 		params+= ("bool,");
			 	break;
			 	case 'd':
			 		params+= ("double,");
			 	break;
			 	case 'f':
			 		params+= ("float,");
			 	break;
			 	case 'c':
			 		params+= ("char,");
			 	break;
			 	case 'a':
			 		params+= ("signed char,");
			 	break;	
			 	case 'v':
			 		params+= ("void,");
			 	break;
			 }
		 }
		 
		 
		 
		 for(int i = 3; i < slices.length;i++){
			 if(!slices[i].matches("\\s")  || !slices[i].isEmpty() ){
				 params+= (slices[i]+",");
			 }
		 }
		 
		 params+=")";
		 
		 
		 
		 String yolo = className + "::" + functionName+params;
		 
		 
		 for(int i = 0; i < yolo.length();i++){
			 yolo = yolo.replace(",)", ")");
			 yolo = yolo.replace(",,", ",");
		 }
		 System.out.println(yolo);
		  
	}

}
