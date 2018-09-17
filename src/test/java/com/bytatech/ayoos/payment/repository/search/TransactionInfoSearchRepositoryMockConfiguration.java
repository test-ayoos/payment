package com.bytatech.ayoos.payment.repository.search;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;

/**
 * Configure a Mock version of TransactionInfoSearchRepository to test the
 * application without starting Elasticsearch.
 */
@Configuration
public class TransactionInfoSearchRepositoryMockConfiguration {

    @MockBean
    private TransactionInfoSearchRepository mockTransactionInfoSearchRepository;

}
