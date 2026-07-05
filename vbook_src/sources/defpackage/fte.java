package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fte  reason: default package */
/* loaded from: classes.dex */
public final class fte implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hfe b;
    public final /* synthetic */ AppMeasurementDynamiteService c;

    public /* synthetic */ fte(AppMeasurementDynamiteService appMeasurementDynamiteService, hfe hfeVar, int i) {
        this.a = i;
        this.b = hfeVar;
        this.c = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.a) {
            case 0:
                w2f p = this.c.a.p();
                hfe hfeVar = this.b;
                p.W();
                p.Y();
                p.l0(new gp9(11, p, p.n0(false), hfeVar));
                return;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.c;
                l6f l6fVar = appMeasurementDynamiteService.a.E;
                lte.k(l6fVar);
                lte lteVar = appMeasurementDynamiteService.a;
                if (lteVar.U != null && lteVar.U.booleanValue()) {
                    z = true;
                }
                l6fVar.P0(this.b, z);
                return;
        }
    }
}
