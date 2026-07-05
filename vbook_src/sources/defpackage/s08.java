package defpackage;

import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s08  reason: default package */
/* loaded from: classes.dex */
public final class s08 extends yv7 {
    public final yv7 o;
    public boolean p;

    public s08(long j, cra craVar, xt4 xt4Var, xt4 xt4Var2, yv7 yv7Var) {
        super(j, craVar, xt4Var, xt4Var2);
        this.o = yv7Var;
        yv7Var.k();
    }

    @Override // defpackage.yv7, defpackage.zqa
    public final void c() {
        if (!this.c) {
            super.c();
            if (!this.p) {
                this.p = true;
                this.o.l();
            }
        }
    }

    @Override // defpackage.yv7
    public final rae w() {
        HashMap hashMap;
        s08 s08Var;
        yv7 yv7Var = this.o;
        if (!yv7Var.m && !yv7Var.c) {
            uv7 uv7Var = this.h;
            long j = this.b;
            if (uv7Var != null) {
                hashMap = dra.b(yv7Var.g(), this, this.o.d());
            } else {
                hashMap = null;
            }
            Object obj = dra.c;
            synchronized (obj) {
                try {
                    dra.c(this);
                    if (uv7Var == null || uv7Var.d == 0) {
                        s08Var = this;
                        s08Var.a();
                    } else {
                        s08Var = this;
                        rae z = s08Var.z(this.o.g(), uv7Var, hashMap, this.o.d());
                        if (!z.equals(bra.u)) {
                            return z;
                        }
                        uv7 x = s08Var.o.x();
                        if (x != null) {
                            x.j(uv7Var);
                        } else {
                            s08Var.o.B(uv7Var);
                            s08Var.h = null;
                        }
                    }
                    if (c16.m(s08Var.o.g(), j) < 0) {
                        s08Var.o.v();
                    }
                    yv7 yv7Var2 = s08Var.o;
                    yv7Var2.r(yv7Var2.d().b(j).a(s08Var.j));
                    s08Var.o.A(j);
                    yv7 yv7Var3 = s08Var.o;
                    int i = s08Var.d;
                    s08Var.d = -1;
                    if (i >= 0) {
                        int[] iArr = yv7Var3.k;
                        iArr.getClass();
                        int length = iArr.length;
                        int[] copyOf = Arrays.copyOf(iArr, length + 1);
                        copyOf[length] = i;
                        yv7Var3.k = copyOf;
                    } else {
                        yv7Var3.getClass();
                    }
                    yv7 yv7Var4 = s08Var.o;
                    cra craVar = s08Var.j;
                    yv7Var4.getClass();
                    synchronized (obj) {
                        yv7Var4.j = yv7Var4.j.d(craVar);
                        yv7 yv7Var5 = s08Var.o;
                        int[] iArr2 = s08Var.k;
                        yv7Var5.getClass();
                        if (iArr2.length != 0) {
                            int[] iArr3 = yv7Var5.k;
                            if (iArr3.length != 0) {
                                int length2 = iArr3.length;
                                int length3 = iArr2.length;
                                int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                                System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                                iArr2 = copyOf2;
                            }
                            yv7Var5.k = iArr2;
                        }
                    }
                    s08Var.m = true;
                    if (!s08Var.p) {
                        s08Var.p = true;
                        s08Var.o.l();
                    }
                    return bra.u;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new ara(this);
    }
}
