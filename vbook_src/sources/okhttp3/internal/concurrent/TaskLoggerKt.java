package okhttp3.internal.concurrent;

import java.util.Arrays;
import java.util.logging.Logger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class TaskLoggerKt {
    public static final void a(Logger logger, Task task, TaskQueue taskQueue, String str) {
        logger.fine(taskQueue.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.a);
    }

    public static final String b(long j) {
        String q;
        if (j <= -999500000) {
            q = hl5.q(new StringBuilder(), (j - 500000000) / 1000000000, " s ");
        } else if (j <= -999500) {
            q = hl5.q(new StringBuilder(), (j - 500000) / 1000000, " ms");
        } else if (j <= 0) {
            q = hl5.q(new StringBuilder(), (j - 500) / 1000, " µs");
        } else if (j < 999500) {
            q = hl5.q(new StringBuilder(), (j + 500) / 1000, " µs");
        } else if (j < 999500000) {
            q = hl5.q(new StringBuilder(), (j + 500000) / 1000000, " ms");
        } else {
            q = hl5.q(new StringBuilder(), (j + 500000000) / 1000000000, " s ");
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{q}, 1));
    }
}
