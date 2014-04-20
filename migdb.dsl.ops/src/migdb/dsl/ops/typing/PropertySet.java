package migdb.dsl.ops.typing;

import java.util.Set;
import java.util.TreeSet;

public class PropertySet extends TreeSet<PropertySet.Property> {

	public Set<String> names() {
		Set<String> result = new TreeSet<String>();
		for (Property p : this)
			if (p.name != null)
				result.add(p.name);
		return result;
	}

	public Set<String> types() {
		Set<String> result = new TreeSet<String>();
		for (Property p : this)
			if (p.type != null)
				result.add(p.type);
		return result;
	}
	
	public boolean contains(Object o) {
		if(o instanceof String)
			return super.contains(new Property((String) o, null, 0, 0));
		return super.contains(o);
	}

	public boolean add(String name, String type, int low, int up) {
		return this.add(new Property(name, type, low, up));
	}
	
	public boolean remove(Object o) {
		if(o instanceof String)
			return super.remove(new Property((String) o, null, 0, 0));
		return super.remove(o);
	}
	
	public Property get(String name) {
		for (Property p : this)
			if (p.name.equalsIgnoreCase(name))
				return p;
		return null;
	}

	public class Property implements Comparable<Property> {
		public String name;
		public String type;
		public int low;
		public int upper;

		public Property(String p, String t, int n, int m) {
			this.name = p;
			this.type = t;
			this.low = n;
			this.upper = m;
		}

		public int compareTo(Property o) {
			return name.compareToIgnoreCase(o.name);
		}

		public boolean equals(Object other) {
			if (this == other)
				return true;
			if (!(other instanceof Property) || !(other instanceof String))
				return false;

			String oprop = null;
			if (other instanceof Property)
				oprop = ((Property) other).name;
			else
				oprop = (String) other;

			return oprop != null ? oprop.equalsIgnoreCase(name) : false;
		}
	}
}
