package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: im3  reason: default package */
/* loaded from: classes.dex */
public final class im3 implements fp3 {
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public im3(List list) {
        this.a = 0;
        this.f = list;
        this.g = new fjc[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // defpackage.fp3
    public final void b(km8 km8Var) {
        fjc[] fjcVarArr;
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (km8Var.a() == 0) {
                            z2 = false;
                        } else {
                            if (km8Var.z() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z2 = this.b;
                        }
                        if (!z2) {
                            return;
                        }
                    }
                    if (this.d == 1) {
                        if (km8Var.a() == 0) {
                            z = false;
                        } else {
                            if (km8Var.z() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z = this.b;
                        }
                        if (!z) {
                            return;
                        }
                    }
                    int i = km8Var.b;
                    int a = km8Var.a();
                    for (fjc fjcVar : (fjc[]) this.g) {
                        km8Var.M(i);
                        fjcVar.e(a, km8Var);
                    }
                    this.e += a;
                    return;
                }
                return;
            default:
                km8 km8Var2 = (km8) this.f;
                ((fjc) this.g).getClass();
                if (this.b) {
                    int a2 = km8Var.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int min = Math.min(a2, 10 - i2);
                        System.arraycopy(km8Var.a, km8Var.b, km8Var2.a, this.e, min);
                        if (this.e + min == 10) {
                            km8Var2.M(0);
                            if (73 == km8Var2.z() && 68 == km8Var2.z() && 51 == km8Var2.z()) {
                                km8Var2.N(3);
                                this.d = km8Var2.y() + 10;
                            } else {
                                st0.w("Id3Reader", "Discarding invalid ID3 tag");
                                this.b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a2, this.d - this.e);
                    ((fjc) this.g).e(min2, km8Var);
                    this.e += min2;
                    return;
                }
                return;
        }
    }

    @Override // defpackage.fp3
    public final void c() {
        switch (this.a) {
            case 0:
                this.b = false;
                this.c = -9223372036854775807L;
                return;
            default:
                this.b = false;
                this.c = -9223372036854775807L;
                return;
        }
    }

    @Override // defpackage.fp3
    public final void d(boolean z) {
        int i;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.c == -9223372036854775807L) {
                        z2 = false;
                    }
                    wq9.D(z2);
                    for (fjc fjcVar : (fjc[]) this.g) {
                        fjcVar.a(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                    return;
                }
                return;
            default:
                ((fjc) this.g).getClass();
                if (this.b && (i = this.d) != 0 && this.e == i) {
                    if (this.c == -9223372036854775807L) {
                        z2 = false;
                    }
                    wq9.D(z2);
                    ((fjc) this.g).a(this.c, 1, this.d, 0, null);
                    this.b = false;
                    return;
                }
                return;
        }
    }

    @Override // defpackage.fp3
    public final void e(int i, long j) {
        switch (this.a) {
            case 0:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.e = 0;
                    this.d = 2;
                    return;
                }
                return;
            default:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.d = 0;
                    this.e = 0;
                    return;
                }
                return;
        }
    }

    @Override // defpackage.fp3
    public final void f(t94 t94Var, zc7 zc7Var) {
        switch (this.a) {
            case 0:
                fjc[] fjcVarArr = (fjc[]) this.g;
                for (int i = 0; i < fjcVarArr.length; i++) {
                    uoc uocVar = (uoc) ((List) this.f).get(i);
                    zc7Var.a();
                    zc7Var.b();
                    fjc s = t94Var.s(zc7Var.c, 3);
                    uq4 uq4Var = new uq4();
                    zc7Var.b();
                    uq4Var.a = (String) zc7Var.e;
                    uq4Var.m = lc7.p("video/mp2t");
                    uq4Var.n = lc7.p("application/dvbsubs");
                    uq4Var.q = Collections.singletonList(uocVar.b);
                    uq4Var.d = uocVar.a;
                    eub.t(uq4Var, s);
                    fjcVarArr[i] = s;
                }
                return;
            default:
                zc7Var.a();
                zc7Var.b();
                fjc s2 = t94Var.s(zc7Var.c, 5);
                this.g = s2;
                uq4 uq4Var2 = new uq4();
                zc7Var.b();
                uq4Var2.a = (String) zc7Var.e;
                uq4Var2.m = lc7.p("video/mp2t");
                uq4Var2.n = lc7.p("application/id3");
                eub.t(uq4Var2, s2);
                return;
        }
    }

    public im3() {
        this.a = 1;
        this.f = new km8(10);
        this.c = -9223372036854775807L;
    }
}
