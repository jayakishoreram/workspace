
public class TestResponse {

	public static void main(String[] args) {
		String response = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><BpmResponse type=\"success\"><token><![CDATA[bdR91oCJU5fBhXX87hRx7nJUA57Xr18OjSqkyqAqg6MtBGDyc1hkaEQ/vFVz3k6OxZQtTrlroCMMhSiHThn1hy3yNAgLSzcUVhVCn/n+8fO3R2tXVsQD9dTnYJl5RMUqbY4lxRmn8zDQ0sGDy4wIgmOcEekIhY2Q4X9zrIPxeL58qQGKS1ehivYBMv74ZMdH5DI7QmJCrLWUltkXZ7z9/LETu239VRq0OJbzzsJgrvJfj/gtZga3i8WF2wBjptp4R7ISBnY2GDy79QZinM4PndIECzToEUpyqnHCC4WlaWrrPHDWkXYxG5TGwyMaN6LfU5hwS+M8EJEFY5+Sp7CTHCn0YvV0rYJrucsUDDEknOFdCu7hsKFSzMK7SzluXWOMc8kTzW9badHUq/0+gprhzWf+8bGtJ0kSkUTz2qQO0Rf6jSVHQHHAE8SQ4nVqTRKM]]></token><user><![CDATA[admin]]></user><assertertoken><![CDATA[bzqLg4kRt9KcegKhk%2FDD28ro%2F5L1GzJ5%2F4byVqH9zjK4voMec6awcklRhcdDXwrj]]></assertertoken></BpmResponse>";
		TestResponse.getResponseTypeMessage(response);
	}
	
	
    public static String getResponseTypeMessage(String response) {
        String resp = response;
        System.out.println("resp==== " + resp);

        String idx1 = "<BpmResponse type=\"";
        String idx2 = "\"><";
        String responsetypestatus =
            resp.substring(resp.indexOf(idx1) + idx1.length(),
                           resp.indexOf(idx2));
        System.out.println("***Response type status : " + responsetypestatus);
        return responsetypestatus;
    }
}
