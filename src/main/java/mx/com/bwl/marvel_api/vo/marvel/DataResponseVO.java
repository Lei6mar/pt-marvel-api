package mx.com.bwl.marvel_api.vo.marvel;

import java.util.List;

public class DataResponseVO {
    private Long offset;
    private Long limit;
    private Long total;
    private Long count;
    private List<CharacterResponseVO> results;

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<CharacterResponseVO> getResults() {
        return results;
    }

    public void setResults(List<CharacterResponseVO> results) {
        this.results = results;
    }
}
