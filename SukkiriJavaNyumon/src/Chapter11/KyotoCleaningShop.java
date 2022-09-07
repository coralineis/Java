package Chapter11;

public class KyotoCleaningShop implements Cleaning Service {
		String ownerName;
		String address;
		String phone;

		public Shirt washShirt(Shirt s) {
			return s;
		}

		public Towel washTowel(Towel t) {
			return t;
		}

		public Coat washCoat(Coat c) {
			return c;
		}
}
