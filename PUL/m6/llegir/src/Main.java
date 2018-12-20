import java.io.File; 
  
public class Main  { 
     static void ImprimirRecursiu(File[] arr,int index,int nivell){ 
    	 if(arr == null)
        	 return;
    	 
         if(index == arr.length) 
             return; 
           
         for (int i = 0; i < nivell; i++) {
        	 System.out.print("\t");
         }
              
         if(arr[index].isFile()) {
        	 System.out.println(arr[index].getName());
        	 
         }else if(arr[index].isDirectory()) { 
             System.out.println("[" + arr[index].getName() + "]"); 
             ImprimirRecursiu(arr[index].listFiles(), 0, nivell + 1); 
         } 
         
         ImprimirRecursiu(arr,++index, nivell); 
    } 
      
     
    public static void main(String[] args) {   
        String directoriPrincipal = "C:\\Users\\Pol\\Desktop\\prova"; 
                  
        File directoriprincipal = new File(directoriPrincipal); 
           
        if(directoriprincipal.exists() && directoriprincipal.isDirectory()){ 
            File arr[] = directoriprincipal.listFiles(); 
            ImprimirRecursiu(arr,0,0);  
       }  
    } 
    
} 
