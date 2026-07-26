package io.legado.app.domain.usecase

object AiToolLoopPolicy {

    const val MAX_ROUNDS = 6
    const val MAX_CALLS_PER_ROUND = 8
    const val MAX_TOTAL_CALLS = 24

    fun validateBeforeExecution(
        round: Int,
        callsThisRound: Int,
        callsAlreadyExecuted: Int
    ): Int {
        if (round !in 0 until MAX_ROUNDS) {
            throw AiToolLoopLimitException(
                "Đã dừng Chat AI vì vượt quá $MAX_ROUNDS vòng gọi công cụ."
            )
        }
        if (callsThisRound !in 1..MAX_CALLS_PER_ROUND) {
            throw AiToolLoopLimitException(
                "Đã dừng Chat AI vì một vòng yêu cầu quá $MAX_CALLS_PER_ROUND công cụ."
            )
        }
        if (callsAlreadyExecuted < 0 ||
            callsAlreadyExecuted > MAX_TOTAL_CALLS - callsThisRound
        ) {
            throw AiToolLoopLimitException(
                "Đã dừng Chat AI vì vượt quá $MAX_TOTAL_CALLS lượt gọi công cụ."
            )
        }
        return callsAlreadyExecuted + callsThisRound
    }
}

class AiToolLoopLimitException(message: String) : IllegalStateException(message)
