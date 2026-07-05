package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q03  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class q03 implements u03 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t03 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ q03(t03 t03Var, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = t03Var;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override // defpackage.u03
    public final ScheduledFuture a(mce mceVar) {
        int i = this.a;
        Runnable runnable = this.c;
        t03 t03Var = this.b;
        switch (i) {
            case 0:
                return t03Var.b.scheduleAtFixedRate(new r03(t03Var, runnable, mceVar, 0), this.d, this.e, this.f);
            default:
                return t03Var.b.scheduleWithFixedDelay(new r03(t03Var, runnable, mceVar, 2), this.d, this.e, this.f);
        }
    }
}
