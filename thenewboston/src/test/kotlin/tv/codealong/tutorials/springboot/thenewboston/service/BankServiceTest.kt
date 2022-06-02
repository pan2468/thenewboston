package tv.codealong.tutorials.springboot.thenewboston.service

import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test
import tv.codealong.tutorials.springboot.thenewboston.datasource.BankDataSource

internal class BankServiceTest{

    private val dataSource: BankDataSource = mockk(relaxed = true) // mockk kotlin 테스트 동작 라이브러리
    private val bankService = BankService(dataSource)

    @Test
    fun shouldCallBanks(){
        // when
        bankService.getBanks()

        // then
        verify(exactly = 1) { //test 안에 검증확인
            dataSource.retrieveBanks()
        }

    }

}