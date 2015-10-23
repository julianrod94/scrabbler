package general;

import general.BoardState.Direction;

public class Move {
	private String word;
	private int x, y;
	private Direction dir;

	public Move(String word, int x, int y, Direction dir) {
		this.word = word;
		this.x = x;
		this.y = y;
		this.dir = dir;
	}

	public String getWord() {
		return word;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Direction getDirection() {
		return dir;
	}
	
	//TODO verify and remove if unnecessary
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dir == null) ? 0 : dir.hashCode());
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(!(obj instanceof Move)) {
			return false;
		}
		Move other = (Move) obj;
		return dir == other.dir && word.equals(other.word) && x == other.x && y == other.y;
	}

	@Override
	public String toString() {
		return "\"" + word + "\" @ ("+ x + "," + y + ") going " + dir;
	}
}