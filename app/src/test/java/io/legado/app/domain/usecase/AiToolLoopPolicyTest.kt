package io.legado.app.domain.usecase

import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test

class AiToolLoopPolicyTest {

    @Test
    fun `allows calls within every configured limit`() {
        val nextTotal = AiToolLoopPolicy.validateBeforeExecution(
            round = AiToolLoopPolicy.MAX_ROUNDS - 1,
            callsThisRound = AiToolLoopPolicy.MAX_CALLS_PER_ROUND,
            callsAlreadyExecuted = AiToolLoopPolicy.MAX_TOTAL_CALLS - AiToolLoopPolicy.MAX_CALLS_PER_ROUND
        )

        assertEquals(AiToolLoopPolicy.MAX_TOTAL_CALLS, nextTotal)
    }

    @Test
    fun `rejects another round after the round cap`() {
        assertThrows(AiToolLoopLimitException::class.java) {
            AiToolLoopPolicy.validateBeforeExecution(
                round = AiToolLoopPolicy.MAX_ROUNDS,
                callsThisRound = 1,
                callsAlreadyExecuted = 0
            )
        }
    }

    @Test
    fun `rejects too many calls in one round`() {
        assertThrows(AiToolLoopLimitException::class.java) {
            AiToolLoopPolicy.validateBeforeExecution(
                round = 0,
                callsThisRound = AiToolLoopPolicy.MAX_CALLS_PER_ROUND + 1,
                callsAlreadyExecuted = 0
            )
        }
    }

    @Test
    fun `rejects calls that exceed the total cap`() {
        assertThrows(AiToolLoopLimitException::class.java) {
            AiToolLoopPolicy.validateBeforeExecution(
                round = 1,
                callsThisRound = 2,
                callsAlreadyExecuted = AiToolLoopPolicy.MAX_TOTAL_CALLS - 1
            )
        }
    }
}
