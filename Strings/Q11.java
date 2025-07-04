package strings;

public class Q11 {
    
 {
	
				public static String trimSpace(String s) {
					String result="";
					for(int i=0;i<s.length();i++) {
						if(s.charAt(i)!=' ') {
							result+=s.charAt(i);
					}
					}
						return result;
				}
					
				public static String subString(String s, int start, int end) {
						String result="";
						for(int i=start;i<end;i++) {
							result+=s.charAt(i);
						}
                        return result;
				}
				
				public static boolean compareTwo(String s, String s1) {
						if(s.length()!=s1.length()) {
							return false;
						}
						for(int i=0;i<s.length();i++) {
						if(s.charAt(i)!=s1.charAt(i)) {
							return false;	
						}
						}
						return true;
				}
						
				public static void main(String[] args) {
				        String input = " h e l l o ";

                 String noSpaces = trimSpace(input);
                 System.out.println("Without spaces: " + noSpaces); 

                 String sub = subString("hello", 1, 4);
                 System.out.println("Substring(1,4): " + sub); 

                boolean isSame = compareTwo("test", "test");
                System.out.println("Compare: " + isSame); 
				}
				
			}

