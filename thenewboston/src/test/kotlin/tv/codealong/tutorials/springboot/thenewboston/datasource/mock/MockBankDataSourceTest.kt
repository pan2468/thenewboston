package tv.codealong.tutorials.springboot.thenewboston.datasource.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest{

    private val mockBankDataSource = MockBankDataSource()

    @Test
    fun shouldBank(){
        // when
        val banks = mockBankDataSource.retrieveBanks()
    
        // then
        assertThat(banks.size).isGreaterThanOrEqualTo(3)
    
    }

    @Test
    fun shouldMockData(){
        // when
        val banks = mockBankDataSource.retrieveBanks()

        // then
//        assertThat(banks).allMatch() { it.accountNumber.isNotBlank() }
//        assertThat(banks).anyMatch() { it.trust == 0.0 }
//        assertThat(banks).anyMatch() { it.transactionFree == 0 }

    }
    
}