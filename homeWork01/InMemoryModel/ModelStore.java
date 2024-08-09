package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;
import java.util.ArrayList;

public class ModelStore implements IModelChangeObserver, IModelChanger {
  ArrayList<PoligonalModel> Models = new ArrayList<>();
  ArrayList<Scene> Scenes = new ArrayList<>();
  ArrayList<Flash> Flashes = new ArrayList<>();
  ArrayList<Camera> Cameras = new ArrayList<>();

  public Scene getScene(int n_scene) {

    return Scenes.get(n_scene);
  }

  @Override
  public void notifyChange(IModelChanger sender) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'notifyChange'");
  }

  @Override
  public void applyUpdateModel() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'applyUpdateModel'");
  }
}
