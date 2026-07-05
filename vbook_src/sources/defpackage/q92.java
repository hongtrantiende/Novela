package defpackage;

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q92  reason: default package */
/* loaded from: classes.dex */
public final class q92 {
    public static final r0f c = new r0f(20);
    public final ve8 a;
    public final AtomicReference b = new AtomicReference(null);

    public q92(ve8 ve8Var) {
        this.a = ve8Var;
        ve8Var.a(new q6(this, 5));
    }

    public final r0f a() {
        q92 q92Var = (q92) this.b.get();
        if (q92Var == null) {
            return c;
        }
        return q92Var.a();
    }

    public final boolean b() {
        q92 q92Var = (q92) this.b.get();
        if (q92Var != null && q92Var.b()) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        q92 q92Var = (q92) this.b.get();
        if (q92Var != null && q92Var.c()) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j, gd0 gd0Var) {
        String m = s21.m("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", m, null);
        }
        this.a.a(new p92(str, j, gd0Var));
    }
}
