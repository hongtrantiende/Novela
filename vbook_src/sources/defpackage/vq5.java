package defpackage;

import android.widget.RemoteViews;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vq5  reason: default package */
/* loaded from: classes.dex */
public final class vq5 {
    public static final vq5 a = new Object();

    public final void a(smc smcVar, RemoteViews remoteViews, nm1 nm1Var, int i) {
        if (nm1Var instanceof rq9) {
            int i2 = ((rq9) nm1Var).a;
            remoteViews.getClass();
            on9.d(remoteViews, i, "setColorFilter", i2);
            return;
        }
        int x = sve.x(nm1Var.a(smcVar.a));
        remoteViews.getClass();
        remoteViews.setInt(i, "setColorFilter", x);
    }
}
