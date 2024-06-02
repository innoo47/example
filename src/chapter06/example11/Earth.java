package chapter06.example11;

public class Earth {

	// 상수 선언 및 초기화
	public static final double EARTH_RADIUS = 6400;

	public final static double EARTH_SURFACE_AREA;

	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS; // 겉넓이

	}
}
