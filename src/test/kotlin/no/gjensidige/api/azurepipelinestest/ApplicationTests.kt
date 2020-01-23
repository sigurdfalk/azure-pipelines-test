package no.gjensidige.api.azurepipelinestest

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
class ApplicationTests {
    @Test
    fun `Oh yeah, I'm testing something reeeeally important here`() {
        val iAmSoTrue = true

        assertThat(iAmSoTrue).isFalse()
    }
}
