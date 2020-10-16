package games;

public abstract class Level {
protected int levelNumber;
protected boolean isCompleted;

public int getLevel() {
	return levelNumber;
};

public boolean isCompleted() {
	return isCompleted;
}

protected abstract void setLevel (int levelNumber, boolean isCompleted);

}
