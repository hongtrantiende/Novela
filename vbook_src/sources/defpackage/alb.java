package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: alb  reason: default package */
/* loaded from: classes3.dex */
public abstract class alb {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final hq7 f;

    static {
        String str;
        int i = ogb.a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        a = str;
        b = gue.z("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = ogb.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = gue.A(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = gue.A(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(gue.z("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = hq7.L;
    }
}
