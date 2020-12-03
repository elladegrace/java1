package ch06;

public interface CommandAction {
	void action();
}
class WriteAction implements CommandAction{
	@Override
	public void action(){ 	System.out.println("�۵��");	}
}
class ReadAction implements CommandAction{
	@Override
	public void action(){ System.out.println("�󼼺���"); }
}
class ListAction implements CommandAction{
	@Override
	public void action() { System.out.println("����Ʈ����"); }
}
class ReplyAction implements CommandAction{
	@Override
	public void action() { System.out.println("����ۼ�"); }
}
class UpdateAction implements CommandAction{
	@Override
	public void action() { System.out.println("�������"); }
}
class DeleteAction implements CommandAction{
	@Override
	public void action() {	System.out.println("�� ����");}
}