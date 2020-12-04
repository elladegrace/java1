package verify.ch04;

//public abstract class DatatAccessObject {
interface DatatAccessObject {
	void insert();//public
	void select(); 
	void update();
	void delete();
}

//class OracleDao extends DatatAccessObject{
class OracleDao implements DatatAccessObject{
	@Override
	public void insert() {
		System.out.println("OracleDB���� �Է�");
	}
	@Override
	public void select() {
		System.out.println("OracleDB���� �˻�");	
	}
	@Override
	public void update() {
		System.out.println("OracleDB���� ����");	
	}

	@Override
	public void delete() {
		System.out.println("OracleDB���� ����");
	}
 }
//class MysqlDao extends DatatAccessObject{
class MysqlDao implements DatatAccessObject{
	@Override
	public void insert() {
		System.out.println("MysqlDB���� �Է�");
	}
	@Override
	public void select() {
		System.out.println("MysqlDB���� �˻�");	
	}
	@Override
	public void update() {
		System.out.println("MysqlDB���� ����");	
	}

	@Override
	public void delete() {
		System.out.println("MysqlDB���� ����");
	}
	}