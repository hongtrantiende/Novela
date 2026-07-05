package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zy0  reason: default package */
/* loaded from: classes3.dex */
public abstract class zy0 {
    public static final kb1 a = new kb1(-1, null, null, 0);
    public static final int b = gue.A(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int c = gue.A(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final lie d = new lie(5, "BUFFERED", false);
    public static final lie e = new lie(5, "SHOULD_BUFFER", false);
    public static final lie f = new lie(5, "S_RESUMING_BY_RCV", false);
    public static final lie g = new lie(5, "RESUMING_BY_EB", false);
    public static final lie h = new lie(5, "POISONED", false);
    public static final lie i = new lie(5, "DONE_RCV", false);
    public static final lie j = new lie(5, "INTERRUPTED_SEND", false);
    public static final lie k = new lie(5, "INTERRUPTED_RCV", false);
    public static final lie l = new lie(5, "CHANNEL_CLOSED", false);
    public static final lie m = new lie(5, "SUSPEND", false);
    public static final lie n = new lie(5, "SUSPEND_NO_WAITER", false);
    public static final lie o = new lie(5, "FAILED", false);
    public static final lie p = new lie(5, "NO_RECEIVE_RESULT", false);
    public static final lie q = new lie(5, "CLOSE_HANDLER_CLOSED", false);
    public static final lie r = new lie(5, "CLOSE_HANDLER_INVOKED", false);
    public static final lie s = new lie(5, "NO_CLOSE_CAUSE", false);

    public static final boolean a(e61 e61Var, Object obj, mu4 mu4Var) {
        lie g2 = e61Var.g(obj, mu4Var);
        if (g2 != null) {
            e61Var.n(g2);
            return true;
        }
        return false;
    }
}
