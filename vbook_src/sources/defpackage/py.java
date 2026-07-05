package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: py  reason: default package */
/* loaded from: classes.dex */
public final class py extends fb6 implements lu4 {
    public final /* synthetic */ zl9 C;
    public final /* synthetic */ zl9 D;
    public final /* synthetic */ zl9 E;
    public final /* synthetic */ zl9 a;
    public final /* synthetic */ zl9 b;
    public final /* synthetic */ zl9 c;
    public final /* synthetic */ RemoteViews d;
    public final /* synthetic */ bx5 e;
    public final /* synthetic */ zl9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py(zl9 zl9Var, zl9 zl9Var2, zl9 zl9Var3, Context context, RemoteViews remoteViews, bx5 bx5Var, zl9 zl9Var4, zl9 zl9Var5, zl9 zl9Var6, smc smcVar, zl9 zl9Var7, zl9 zl9Var8, zl9 zl9Var9) {
        super(2);
        this.a = zl9Var;
        this.b = zl9Var2;
        this.c = zl9Var3;
        this.d = remoteViews;
        this.e = bx5Var;
        this.f = zl9Var4;
        this.C = zl9Var6;
        this.D = zl9Var8;
        this.E = zl9Var9;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        ph8 ph8Var;
        pvc pvcVar = (pvc) obj;
        wy4 wy4Var = (wy4) obj2;
        if (wy4Var instanceof o5) {
            zl9 zl9Var = this.a;
            if (zl9Var.a != null) {
                Log.w("GlanceAppWidget", "More than one clickable defined on the same GlanceModifier, only the last one will be used.");
            }
            zl9Var.a = wy4Var;
        } else if (wy4Var instanceof mid) {
            this.b.a = wy4Var;
        } else if (wy4Var instanceof u55) {
            this.c.a = wy4Var;
        } else if (wy4Var instanceof fg0) {
            fg0 fg0Var = (fg0) wy4Var;
            int i = this.e.a;
            if (fg0Var instanceof fg0) {
                nm1 nm1Var = fg0Var.a;
                boolean z = nm1Var instanceof ih4;
                RemoteViews remoteViews = this.d;
                if (z) {
                    remoteViews.setInt(i, "setBackgroundColor", sve.x(0L));
                } else if (nm1Var instanceof rq9) {
                    int i2 = ((rq9) nm1Var).a;
                    if (Build.VERSION.SDK_INT >= 31) {
                        on9.d(remoteViews, i, "setBackgroundColor", i2);
                    } else {
                        remoteViews.setInt(i, "setBackgroundResource", i2);
                    }
                } else {
                    Log.w("GlanceAppWidget", "Unexpected background color modifier: " + nm1Var);
                }
            }
        } else if (wy4Var instanceof ph8) {
            zl9 zl9Var2 = this.f;
            ph8 ph8Var2 = (ph8) zl9Var2.a;
            if (ph8Var2 != null) {
                ph8 ph8Var3 = (ph8) wy4Var;
                ph8Var = new ph8(ph8Var2.a.a(ph8Var3.a), ph8Var2.b.a(ph8Var3.b), ph8Var2.c.a(ph8Var3.c), ph8Var2.d.a(ph8Var3.d), ph8Var2.e.a(ph8Var3.e), ph8Var2.f.a(ph8Var3.f));
            } else {
                ph8Var = (ph8) wy4Var;
            }
            zl9Var2.a = ph8Var;
        } else if (wy4Var instanceof w72) {
            this.C.a = ((w72) wy4Var).a;
        } else if (!(wy4Var instanceof lc)) {
            if (wy4Var instanceof ts3) {
                this.D.a = wy4Var;
            } else if (wy4Var instanceof w7a) {
                this.E.a = wy4Var;
            } else {
                Log.w("GlanceAppWidget", "Unknown modifier '" + wy4Var + "', nothing done.");
            }
        }
        return pvc.a;
    }
}
