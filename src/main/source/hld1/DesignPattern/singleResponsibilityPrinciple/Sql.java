package hld1.DesignPattern.singleResponsibilityPrinciple;

public class Sql {

    public Sql(String tableName, Column[] columns) {
    }

    public String create() {
        return null;
    }
    public String insert(Object[] fields) {
        return null;
    }
    public String selectAll() {
        return null;
    }
    public String findByKey(String keyColumn, String keyValue) {
        return null;
    }
    public String select(Column column, String pattern) {
        return null;
    }
    public String select(Criteria criteria) {
        return null;
    }
    public String preparedInsert() {
        return null;
    }
    public String columnList(Column[] columns) {
        return null;
    }
    private String valuesWithCriteria(String criteria) {
        return null;
    }
    private String valuesList(Object[] fields, Column[] columns) {
        return null;
    }
    private String placeholderList(Column[] columns) {
        return null;
    }
}
