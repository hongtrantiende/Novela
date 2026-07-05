package defpackage;

import android.graphics.Bitmap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pi8  reason: default package */
/* loaded from: classes.dex */
public final class pi8 {
    public final nl5 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public pi8(uy5 uy5Var, uy5 uy5Var2, nl5 nl5Var) {
        uy5Var.getClass();
        uy5Var2.getClass();
        nl5Var.getClass();
        this.a = nl5Var;
        this.b = py5.c(uy5Var2.d(), uy5Var.d());
        this.c = (((int) (uy5Var2.c() >> 32)) << 32) | (((int) (uy5Var2.c() & 4294967295L)) & 4294967295L);
        int e = uy5Var.e();
        this.d = (uy5Var.b() & 4294967295L) | (e << 32);
        Bitmap bitmap = ((jj) nl5Var).a;
        this.e = bitmap.getWidth() * bitmap.getHeight();
    }
}
