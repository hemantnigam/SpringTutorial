import org.springframework.jdbc.core.JdbcTemplate; 

public class EmployeeDAO {
	private JdbcTemplate jdbcTemplate;


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;	} 
	
	public int insertEmployee(Employee e) {
		String query="insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
		return jdbcTemplate.update(query);
	}
	public int deleteEmloyee(Employee e) {
		String query="delete from employee where id='"+e.getId()+"'";
		return jdbcTemplate.update(query);
	}
	public int updateEmloyee(Employee e) {
		String query="update employee set name='"+e.getName()+"',id='"+e.getId()+"',salary='"+e.getSalary()+"'";
		return jdbcTemplate.update(query);
	}
}
