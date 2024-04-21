package live.learnjava.model;

public class TechConsultant {
	private int id;
	private String name;
	private String field;

	public TechConsultant() {
		super();
	}

	public TechConsultant(int id, String name, String field) {
		super();
		this.id = id;
		this.name = name;
		this.field = field;
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

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	@Override
	public String toString() {
		return "TechConsultant [id=" + id + ", name=" + name + ", field=" + field + "]";
	}
}
