package exam1105;

public interface MemoRepository {
	void addMemo(String id, String body);
	void getMemo();
	void updateMemo(String id, String body);
	void deleteMemo(String id);
}
