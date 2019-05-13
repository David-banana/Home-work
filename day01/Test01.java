	public class Demo01 {
	
	    public static class Test01 {
	        public static void main(String[] args) {
	            String str = "HelloWorld";
	            test1(str);
	            test2(str);
	            test3(str);
	            test4(str);
	            test5(str);
	            test6(str);
	            test7(str);
	            test8(str);
	            System.out.println("dd");
	            System.out.println(04);
	        }
	        public static void test1(String str){
	        	System.out.println(str.length());
	        }
	        public static void test2(String str) {
	        	System.out.println(str.indexOf("o"));
	        }
	        public static void test3(String str) {
	        	System.out.println(str.indexOf("o", 5));
	        }
	        public static void test4(String str) {
	        	System.out.println(str.substring(0, 5));
	        }
	        public static void test5(String str) {
	        	System.out.println(str.substring(5, str.length()));
	        }
	        public static void test6(String str) {
	        	System.out.println(str.charAt(6));
	        }
	        public static void test7(String str) {
	        	System.out.println(str.matches("h//d+ld"));
	        }
	        public static void test8(String str) {
	        	System.out.println(str.toLowerCase());
	        	System.out.println(str.toUpperCase());
	        }
	    }
	}
