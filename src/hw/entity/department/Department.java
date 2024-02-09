package hw.entity.department;

import hw.enums.Priority;

public class Department {

        protected int id;
        protected String name;
        private static int count;

        public Department(String name) {
            this.id = count++;
            this.name = name;
        }

        public void setId(int id) {
            this.id = id;
            if (id >= count) count = ++id;
        }

    public int getId() {
        return id;
    }

    public Department getDepartment() {
        Department o = null;
        return o;
    }

    public void setDepartment(Department department) {
    }

    public Priority getPriority() {
        Priority o = null;
        return null;
    }
}
