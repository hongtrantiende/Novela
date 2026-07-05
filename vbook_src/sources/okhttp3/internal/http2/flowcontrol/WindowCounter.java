package okhttp3.internal.http2.flowcontrol;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class WindowCounter {
    public final int a;
    public long b;
    public long c;

    public WindowCounter(int i) {
        this.a = i;
    }

    public static void b(WindowCounter windowCounter, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        synchronized (windowCounter) {
            try {
                if (j >= 0) {
                    if (j2 >= 0) {
                        long j3 = windowCounter.b + j;
                        windowCounter.b = j3;
                        long j4 = windowCounter.c + j2;
                        windowCounter.c = j4;
                        if (j4 > j3) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized long a() {
        return this.b - this.c;
    }

    public final String toString() {
        return "WindowCounter(streamId=" + this.a + ", total=" + this.b + ", acknowledged=" + this.c + ", unacknowledged=" + a() + ')';
    }
}
