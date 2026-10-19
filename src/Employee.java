import java.util.Date;

public final class Employee{

    private final String name;
    private final Date hireDate;

    public Employee(String name, Date hireDate){
        this.name = name;
        this.hireDate = new Date(hireDate.getTime());
    }

    public String getName(){
        return name;
    }

    public Date getHireDate() {
        return new Date(hireDate.getTime());
    }

    @Override
    public String toString(){
        return "Сотрудник{Имя = "+name+", дата приёма = "+hireDate+"}";
    }
}


