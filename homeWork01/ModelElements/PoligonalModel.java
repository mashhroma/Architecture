package ModelElements;

import java.util.List;

public class PoligonalModel {
  public List<Poligon> poligons;
	private List<Texture> textures;

	public PoligonalModel(List<Poligon> poligons, List<Texture> textures) {
		this.poligons = poligons;
		this.textures = textures;
	}
}
