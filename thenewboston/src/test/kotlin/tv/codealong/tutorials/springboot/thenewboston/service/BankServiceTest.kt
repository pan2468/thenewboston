package tv.codealong.tutorials.springboot.thenewboston.service

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import tv.codealong.tutorials.springboot.thenewboston.datasource.BankDataSource

internal class BankServiceTest{

    private  val dataSource: BankDataSource = mockk(relaxed = true)
    private val bankService = BankService(dataSource)

    @Test
    fun shouldCallBanks(){
        // when
        bankService.getBanks()

        // then
        verify(exactly = 1) { dataSource.retrieveBanks() }

    }

}