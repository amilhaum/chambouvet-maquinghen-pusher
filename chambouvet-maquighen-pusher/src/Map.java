
/**
 * @author chamboug
 * Classe Map
 */
public class Map {
	
	/**
	 * D�claration de l'attribut du nombre de colonnes de la map
	 */
	private final int nombreDeColonnes;
	/**
	 * D�claration de l'attribut du nombre de lignes
	 */
	private final int nombreDeLignes;
	
	/**
	 * D�claration du tableau de cases qui constitue la map
	 */
	private final Case[][] map;
	
	/**
	 * Constructeur de map, qui construit pour l'instant une map unique
	 */
	public Map()
	{
		nombreDeColonnes = 8;
		nombreDeLignes = 9;
		
		map = new Case[nombreDeLignes][nombreDeColonnes];
		
		
	}

}
