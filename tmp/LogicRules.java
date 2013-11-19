
public class LogicRules {

	public static boolean and(Boolean p1, Boolean p2){
		return ( p1 == true && p2 == true);
	}
	public static boolean or(Boolean p1, Boolean p2){
		return !( p1 == false && p2 == false );
	}
	public static boolean imply(Boolean p1, Boolean p2){
		return !( p1 == true && p2 == false );
	}
	public static boolean equi(Boolean p1, Boolean p2){
		return (( p1 == true && p2 == true ) || ( p1 == false && p2 == false ));
	}
	public static boolean equal(float n1, float n2){
		return n1 == n2 ;
	}
	public static boolean equal(Boolean p1, Boolean p2){
		return equi(p1, p2);
	}
	public static boolean sup(float n1, float n2){
		return n1 > n2 ;
	}
	public static boolean sup(Boolean p1, Boolean p2){
		// p1 = 0 et p2 = 1
		return (p1 == false && p2 == true);
	}
}
