package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sn3  reason: default package */
/* loaded from: classes.dex */
public final class sn3 {
    public final Context a;
    public final int b;
    public long c = 0;
    public EdgeEffect d;
    public EdgeEffect e;
    public EdgeEffect f;
    public EdgeEffect g;
    public EdgeEffect h;
    public EdgeEffect i;
    public EdgeEffect j;
    public EdgeEffect k;

    public sn3(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        float f;
        boolean z = false;
        if (edgeEffect == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            f = ih.k(edgeEffect);
        } else {
            f = 0.0f;
        }
        if (f == nae.e) {
            z = true;
        }
        return !z;
    }

    public final EdgeEffect a(ff8 ff8Var) {
        EdgeEffect oz4Var;
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i >= 31) {
            oz4Var = ih.b(context);
        } else {
            oz4Var = new oz4(context);
        }
        oz4Var.setColor(this.b);
        if (!zy5.b(this.c, 0L)) {
            long j = this.c;
            if (ff8Var == ff8.a) {
                oz4Var.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return oz4Var;
            }
            oz4Var.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return oz4Var;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect == null) {
            EdgeEffect a = a(ff8.a);
            this.e = a;
            return a;
        }
        return edgeEffect;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f;
        if (edgeEffect == null) {
            EdgeEffect a = a(ff8.b);
            this.f = a;
            return a;
        }
        return edgeEffect;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect == null) {
            EdgeEffect a = a(ff8.b);
            this.g = a;
            return a;
        }
        return edgeEffect;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect == null) {
            EdgeEffect a = a(ff8.a);
            this.d = a;
            return a;
        }
        return edgeEffect;
    }
}
