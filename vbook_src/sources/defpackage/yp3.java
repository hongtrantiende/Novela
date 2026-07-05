package defpackage;

import android.graphics.Rect;
import android.view.View;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yp3  reason: default package */
/* loaded from: classes.dex */
public abstract class yp3 {
    public int a;
    public final Object b;
    public final Object c;

    public yp3(el9 el9Var) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = el9Var;
    }

    public static yp3 b(el9 el9Var, int i) {
        if (i != 0) {
            if (i == 1) {
                return new gf8(el9Var, 1);
            }
            vs.m("invalid orientation");
            return null;
        }
        return new gf8(el9Var, 0);
    }

    public abstract void a(cw9 cw9Var);

    public abstract void c(cw9 cw9Var);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o(View view);

    public abstract int p(View view);

    public abstract void q(int i);

    public abstract void r(cw9 cw9Var);

    public abstract void s(cw9 cw9Var);

    public abstract void t(cw9 cw9Var);

    public abstract void u(cw9 cw9Var);

    public abstract s8 v(cw9 cw9Var);

    public yp3(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public yp3(bq3 bq3Var) {
        this.a = 0;
        this.c = new zt2();
        this.b = bq3Var;
    }
}
