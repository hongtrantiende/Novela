package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hge  reason: default package */
/* loaded from: classes.dex */
public final class hge implements AutoCloseable {
    public final int c;
    public final Context d;
    public final float e;
    public int f = 13;
    public final long a = System.currentTimeMillis();
    public final long b = SystemClock.uptimeMillis();

    public hge(Context context, int i, float f) {
        this.c = i;
        this.d = context;
        this.e = f;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Context context = this.d;
        if (kw5.f == null) {
            synchronized (kw5.C) {
                try {
                    if (kw5.f == null) {
                        kw5.f = new kw5(context, 2);
                    }
                } finally {
                }
            }
        }
        kw5 kw5Var = kw5.f;
        int i = this.f;
        long currentTimeMillis = System.currentTimeMillis();
        long uptimeMillis = SystemClock.uptimeMillis() - this.b;
        if (ThreadLocalRandom.current().nextFloat() < this.e) {
            int i2 = (int) uptimeMillis;
            long j = this.a;
            int i3 = this.c;
            synchronized (kw5Var) {
                AtomicLong atomicLong = (AtomicLong) kw5Var.c;
                if (atomicLong.get() != -1 && SystemClock.uptimeMillis() - atomicLong.get() <= 1800000) {
                    return;
                }
                ((xb4) kw5Var.b).c(new elb(0, Arrays.asList(new cc7(i3, i, -1, j, currentTimeMillis, null, null, 368, i2)))).addOnFailureListener(new k57(kw5Var, 24));
            }
        }
    }
}
