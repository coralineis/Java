
public class Practice0504 {
	public static void main(String[] args) {
		double triangleArea = calcTriangleArea(30.0, 6.0);
		System.out.println("三角形の面積は" + triangleArea + "㎠");

		double circleArea = calcCircleArea(4.0);
		System.out.println("円の面積は" + circleArea +"㎠");
	}

	public static double calcTriangleArea(double bottom, double height) {
		double area = bottom * height / 2;
		return area;
	}

	public static double calcCircleArea(double radius) {
		double area = 3.14 * (radius * radius);
		return area;
	}
}
