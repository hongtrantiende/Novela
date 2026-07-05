package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.util.Log;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a04  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class a04 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a04(qu1 qu1Var, ma2 ma2Var, tx3 tx3Var, boolean z) {
        this.c = qu1Var;
        this.d = ma2Var;
        this.e = tx3Var;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                i04 i04Var = (i04) this.d;
                a09 a09Var = (a09) this.e;
                l57 g = l57.g((Context) this.c);
                if (g == null) {
                    st0.w("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z) {
                    ms2 ms2Var = i04Var.r;
                    ms2Var.getClass();
                    ms2Var.f.a(g);
                }
                LogSessionId i = g.i();
                synchronized (a09Var) {
                    zz8 zz8Var = a09Var.b;
                    zz8Var.getClass();
                    zz8Var.b(i);
                }
                return;
            default:
                qu1 qu1Var = (qu1) this.c;
                ma2 ma2Var = (ma2) this.d;
                tx3 tx3Var = (tx3) this.e;
                boolean z2 = this.b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                }
                ((ta2) qu1Var.b).d(ma2Var, tx3Var.a, z2);
                return;
        }
    }

    public /* synthetic */ a04(Context context, boolean z, i04 i04Var, a09 a09Var) {
        this.c = context;
        this.b = z;
        this.d = i04Var;
        this.e = a09Var;
    }
}
