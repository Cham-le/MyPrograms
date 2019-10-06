package Entity;

public class Room {
	private int id;
	private String name;
	private String type;
	private int displayPrice;
	private String description;

	public Room(int id, String name, String type, int displayPrice, String description) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.displayPrice = displayPrice;
		this.description = description;
		}

	public Room() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDisplayPrice() {
		return displayPrice;
	}

	public void setDisplayPrice(int displayPrice) {
		this.displayPrice = displayPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
