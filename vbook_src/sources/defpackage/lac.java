package defpackage;

import java.math.RoundingMode;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lac  reason: default package */
/* loaded from: classes.dex */
public final class lac {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public lac(long j) {
        f(j);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!e()) {
                long j2 = this.a;
                if (j2 == 9223372036854775806L) {
                    Long l = (Long) this.d.get();
                    l.getClass();
                    j2 = l.longValue();
                }
                this.b = j2 - j;
                notifyAll();
            }
            this.c = j;
            return j + this.b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.c;
            if (j2 != -9223372036854775807L) {
                String str = a2d.a;
                long Y = a2d.Y(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = (4294967296L + Y) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                long j5 = (j3 * 8589934592L) + j;
                if (Math.abs(j4 - Y) < Math.abs(j5 - Y)) {
                    j = j4;
                } else {
                    j = j5;
                }
            }
            long j6 = j;
            String str2 = a2d.a;
            return a(a2d.Y(j6, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.c;
            if (j2 != -9223372036854775807L) {
                String str = a2d.a;
                long Y = a2d.Y(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = Y / 8589934592L;
                long j4 = (j3 * 8589934592L) + j;
                long j5 = ((j3 + 1) * 8589934592L) + j;
                if (j4 >= Y) {
                    j = j4;
                } else {
                    j = j5;
                }
            }
            long j6 = j;
            String str2 = a2d.a;
            return a(a2d.Y(j6, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long d() {
        long j;
        j = this.a;
        return (j == Long.MAX_VALUE || j == 9223372036854775806L) ? -9223372036854775807L : -9223372036854775807L;
    }

    public final synchronized boolean e() {
        boolean z;
        if (this.b != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized void f(long j) {
        long j2;
        this.a = j;
        if (j == Long.MAX_VALUE) {
            j2 = 0;
        } else {
            j2 = -9223372036854775807L;
        }
        this.b = j2;
        this.c = -9223372036854775807L;
    }

    public final synchronized void g(boolean z, long j) {
        boolean z2;
        try {
            if (this.a == 9223372036854775806L) {
                z2 = true;
            } else {
                z2 = false;
            }
            wq9.D(z2);
            if (e()) {
                return;
            }
            if (z) {
                this.d.set(Long.valueOf(j));
            } else {
                while (!e()) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
