package exam1105;

public class RemoteRepository implements MemoRepository {
	public void addMemo(String id, String body) {
		System.out.println("메모를 저장합니다.");
	}
	
	public void getMemo() {
		System.out.println("메모를 조회합니다.");
	}
	
	public void deleteMemo(String id) {
		System.out.println("메모를 삭제합니다.");
	}
	
	public void updateMemo(String id, String body) {
		System.out.println("메모를 수정합니다.");
	}
}
