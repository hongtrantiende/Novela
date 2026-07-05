package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h4a  reason: default package */
/* loaded from: classes.dex */
public final class h4a implements voc {
    public final g4a a;
    public final km8 b = new km8(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public h4a(g4a g4aVar) {
        this.a = g4aVar;
    }

    @Override // defpackage.voc
    public final void a(int i, km8 km8Var) {
        boolean z;
        int i2;
        boolean z2;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = km8Var.b + km8Var.z();
        } else {
            i2 = -1;
        }
        if (this.f) {
            if (z) {
                this.f = false;
                km8Var.M(i2);
                this.d = 0;
            } else {
                return;
            }
        }
        while (km8Var.a() > 0) {
            int i3 = this.d;
            km8 km8Var2 = this.b;
            if (i3 < 3) {
                if (i3 == 0) {
                    int z3 = km8Var.z();
                    km8Var.M(km8Var.b - 1);
                    if (z3 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(km8Var.a(), 3 - this.d);
                km8Var.k(km8Var2.a, this.d, min);
                int i4 = this.d + min;
                this.d = i4;
                if (i4 == 3) {
                    km8Var2.M(0);
                    km8Var2.L(3);
                    km8Var2.N(1);
                    int z4 = km8Var2.z();
                    int z5 = km8Var2.z();
                    if ((z4 & Token.CASE) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.e = z2;
                    int i5 = (((z4 & 15) << 8) | z5) + 3;
                    this.c = i5;
                    byte[] bArr = km8Var2.a;
                    if (bArr.length < i5) {
                        km8Var2.c(Math.min(4098, Math.max(i5, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(km8Var.a(), this.c - this.d);
                km8Var.k(km8Var2.a, this.d, min2);
                int i6 = this.d + min2;
                this.d = i6;
                int i7 = this.c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (this.e) {
                        if (a2d.o(0, km8Var2.a, i7, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        km8Var2.L(this.c - 4);
                    } else {
                        km8Var2.L(i7);
                    }
                    km8Var2.M(0);
                    this.a.b(km8Var2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.voc
    public final void c() {
        this.f = true;
    }

    @Override // defpackage.voc
    public final void d(lac lacVar, t94 t94Var, zc7 zc7Var) {
        this.a.d(lacVar, t94Var, zc7Var);
        this.f = true;
    }
}
