package test.utilities;

class TConstraint {
	private String name;
	private String ocl;
	
	public TConstraint(String name) {
		this.name = name;
	}
	
	public TConstraint(String name, String ocl) {
		super();
		this.name = name;
		this.ocl = ocl;
	}

	public void setOcl(String ocl) {
		this.ocl = ocl;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((ocl == null) ? 0 : ocl.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TConstraint other = (TConstraint) obj;
		if (name == null) {
			if (other.name != null && !other.name.contains("unnamed") && !other.name.trim().isEmpty())
				return false;
		} else if (!name.equals(other.name)
					&& !(name.trim().isEmpty() && other.name == null)
					&& !(name.trim().isEmpty() && other.name.contains("unnamed"))
					&& !((other.name == null || other.name.trim().isEmpty()) && name.contains("unnamed"))
					&& !((other.name != null && name.contains(other.name) && name.length() == other.name.length()+1))
					&& !((other.name != null && other.name.contains(name) && other.name.length() == name.length()+1)))
			return false;
		if (ocl == null) {
			if (other.ocl != null && !other.ocl.trim().isEmpty() && !other.ocl.equals("true") && !other.ocl.equals("USE"))
				return false;
		} else if (!ocl.equals(other.ocl)
					&& !((other.ocl == null || other.ocl.trim().isEmpty()) && ocl.equals("true"))
					&& !(ocl.trim().isEmpty() && other.ocl != null && other.ocl.equals("true"))
					&& !(other.ocl == null && ocl.trim().isEmpty())
					&& !(other.ocl != null && other.ocl.equals("USE")) && !ocl.equals("USE")
					&& !(other.ocl != null && other.ocl.trim().replaceAll(" ", "") != null && ocl.equals(other.ocl.trim().replaceAll(" ", ""))))
			return false;
		return true;
	}
	
	
}
