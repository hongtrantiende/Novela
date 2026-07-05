package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dac  reason: default package */
/* loaded from: classes3.dex */
public class dac {
    public static final cac d = new Object();
    public boolean a;
    public long b;
    public long c;

    public dac a() {
        this.a = false;
        return this;
    }

    public dac b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        vs.k("No deadline");
        return 0L;
    }

    public dac d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.a && this.b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public dac g(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j >= 0) {
            this.c = timeUnit.toNanos(j);
            return this;
        }
        p1a.k(hl5.k(j, "timeout < 0: "));
        return null;
    }

    public long h() {
        return this.c;
    }
}
