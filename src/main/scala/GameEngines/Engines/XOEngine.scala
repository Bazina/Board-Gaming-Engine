package GameEngines.Engines

import GameEngines.Drawers.XODrawer
import GameEngines.GameEngine
import GameEngines.GamesControllers.XOController

class XOEngine extends GameEngine {
  override val gameController = new XOController
  override val gameDrawer = new XODrawer

}