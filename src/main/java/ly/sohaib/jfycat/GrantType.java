package ly.sohaib.jfycat;

public enum GrantType {

	CLIENT_CREDENTIALS{
		@Override
		public String toString() {
			return "client_credentials";
		}
	},
	
	PASSWORD{
		@Override
		public String toString() {
			return "password";
		}
	}
}
