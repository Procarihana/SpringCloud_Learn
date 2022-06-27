package com.luwei.common.elasticsearch.service;

public interface IElasticSearchService {
    /**
     * 创建索引库
     */
    void createIndexRequest(String index);

    /**
     * 自定义json字符串方式设置Mapping
     */
    void putMappingRequest(String index, String sourceStr);

    /**
     * 删除索引库
     */
    void deleteIndexRequest(String index);

    /**
     * 更新索引文档
     */
    void updateRequest(String index, String id, Object object);

    /**
     * 新增索引文档
     */
    void insertRequest(String index, String id, Object object);

    /**
     * 删除索引文档
     */
    void deleteRequest(String index, String id);
}
