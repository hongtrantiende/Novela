package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kr7  reason: default package */
/* loaded from: classes.dex */
public final class kr7 implements jr7 {
    public final Context a;
    public m41 b;
    public final dm8 c = new dm8(1.0f);
    public iya d;

    public kr7(Context context) {
        this.a = context;
    }

    @Override // defpackage.d82
    public final Object fold(Object obj, lu4 lu4Var) {
        return lu4Var.invoke(obj, this);
    }

    @Override // defpackage.jr7
    public final float g0() {
        aza azaVar;
        if (this.d == null) {
            Context context = this.a;
            tv7 tv7Var = ukd.a;
            synchronized (tv7Var) {
                try {
                    Object g = tv7Var.g(context);
                    if (g == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        xy0 a = xpe.a(-1, 6, null);
                        g = z1d.K(new s02(new xr0(contentResolver, uriFor, new tkd(a, cqe.f(Looper.getMainLooper())), a, context, null, 20), 6), k27.d(), new vya(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        tv7Var.n(context, g);
                    }
                    azaVar = (aza) g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.c.i(((Number) azaVar.getValue()).floatValue());
            m41 m41Var = this.b;
            if (m41Var != null) {
                this.d = z87.v(m41Var, null, null, new c95(azaVar, this, (m42) null, 24), 3);
            } else {
                vs.k("MotionDurationScale scale factor requested before recomposer loop start");
                return nae.e;
            }
        }
        return this.c.h();
    }

    @Override // defpackage.d82
    public final b82 get(c82 c82Var) {
        return nq2.x(this, c82Var);
    }

    @Override // defpackage.d82
    public final d82 minusKey(c82 c82Var) {
        return nq2.B(this, c82Var);
    }

    @Override // defpackage.d82
    public final d82 plus(d82 d82Var) {
        return nq2.C(this, d82Var);
    }
}
