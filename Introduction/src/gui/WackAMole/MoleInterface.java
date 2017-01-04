package gui.WackAMole;

import gui.Components.Action;
import gui.Components.Clickable;

public interface MoleInterface extends Clickable {

	int getAppearanceTime();

	void setAppearanceTime(int screenTime);

	void setAction(Action action);

}
