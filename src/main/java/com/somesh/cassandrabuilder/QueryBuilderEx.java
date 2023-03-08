package com.somesh.cassandrabuilder;

import com.datastax.driver.core.ColumnMetadata;
import com.datastax.driver.core.TableMetadata;
import com.datastax.driver.core.querybuilder.BuiltStatement;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.datastax.driver.core.querybuilder.Select;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class QueryBuilderEx {
    private static final String TABLE_WORKFLOWS = "table1";
    private static final String WORKFLOW_ID_KEY = "";
    private static final String SHARD_ID_KEY = "";
    private static final String TASK_ID_KEY = "";
    private static final String ENTITY_KEY = "";
    private static final String PAYLOAD_KEY = "";
    private static final Object ENTITY_TYPE_TASK = "";

    public static void main(String[] args){
        System.out.println(getInsertTaskStatement());
    }



    public static String getInsertTaskStatement() {
        String keyspace = "cloudleaf";
        return QueryBuilder.insertInto(keyspace, TABLE_WORKFLOWS)
                .value(WORKFLOW_ID_KEY, QueryBuilder.bindMarker())
                .value(SHARD_ID_KEY, QueryBuilder.bindMarker())
                .value(TASK_ID_KEY, QueryBuilder.bindMarker())
                .value(ENTITY_KEY, ENTITY_TYPE_TASK)
                .value(PAYLOAD_KEY, QueryBuilder.bindMarker())
                .getQueryString();
    }

}
