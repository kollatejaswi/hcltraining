package com.hcl.domain;

	public class Emp {
		private int eno;
		private String name;
		public Emp() {
			// TODO Auto-generated constructor stub
		}
		public Emp(int eno, String name) {
			super();
			this.eno = eno;
			this.name = name;
		}
		public int getEno() {
			return eno;
		}
		public void setEno(int eno) {
			this.eno = eno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
}
