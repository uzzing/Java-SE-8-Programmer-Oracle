
interface Exportable { void export(); }


class Tool implements Exportable {
	
	public void export() {
		System.out.println("Tool");
	}
}


public class ReportTool extends Tool implements Exportable {
	
	public void export() {
		System.out.println("RTool");
	}

	public static void main(String[] args) {
		Tool t1 = new ReportTool();
		Tool t2 = new Tool();
		
		t2 = (Tool) t1;
		
		callExport(t1);
		callExport(t2);
	}
	
	public static void callExport (Exportable ex) {
		ex.export();
	}

}
