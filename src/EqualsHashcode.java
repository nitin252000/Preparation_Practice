public class EqualsHashcode {
    int id;
    String name;
    double salary;
    EqualsHashcode(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    @Override
    public boolean equals(Object o) {
       if(this==o)return true;
        if(getClass()!=o.getClass() || o==null)return false;
        EqualsHashcode equalsHashcode=(EqualsHashcode)o;
        return id==equalsHashcode.id && Double.compare(salary,equalsHashcode.salary)==0 && name.equals(equalsHashcode.name);

    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(id,name,salary);
    }

    public static void main(String[] args) {
        EqualsHashcode e1=new EqualsHashcode(1,"Ram",2345.90);
        EqualsHashcode e2=new EqualsHashcode(1,"Ram",2345.90);
        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }
}
