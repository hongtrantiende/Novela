package defpackage;

import android.os.SystemClock;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xhf  reason: default package */
/* loaded from: classes.dex */
public abstract class xhf {
    public static final nc2 a;

    static {
        thf thfVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            thfVar = new thf(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            thfVar = new thf(1);
        }
        a = thfVar;
    }
}
