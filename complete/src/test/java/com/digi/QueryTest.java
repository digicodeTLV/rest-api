package com.digi;

import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.example.db.mysql.tables.records.BranchRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.jooq.example.db.mysql.Tables.BRANCH;
import static org.junit.Assert.assertNotNull;

/**
 * Created by tymoshenkol on 25-Nov-16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@Slf4j
public class QueryTest {

    @Autowired
    DSLContext create;

    @Test
    public void testIntert() throws Exception {
        int result = create
                .insertInto(BRANCH)
                .columns(BRANCH.COMPANY, BRANCH.NAME)
                .values(1, "Test")
                .onDuplicateKeyIgnore()
                .execute();
        assertThat(result).isBetween(0, 1);
    }

    @Test
    public void testSelect() throws Exception {
        Result<BranchRecord> result = create.selectFrom(BRANCH).orderBy(BRANCH.ID).fetch();
        assertNotNull(result);
        log.info("Resultset:\n{}", result);
        result.stream().forEach(
                b -> {
                    log.info("Branch:{}, {}, {}", b.getId(), b.getCompany(), b.getName());
                }
        );
    }

}
