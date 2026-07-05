package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n4  reason: default package */
/* loaded from: classes.dex */
public final class n4 extends l4 {
    public static n4 f;
    public static final oq9 g = oq9.b;
    public static final oq9 h = oq9.a;
    public fvb d;
    public b8a e;

    @Override // defpackage.l4
    public final int[] a(int i) {
        int i2;
        if (c().length() > 0 && i < c().length()) {
            try {
                b8a b8aVar = this.e;
                if (b8aVar != null) {
                    rk9 g2 = b8aVar.g();
                    int round = Math.round(g2.d - g2.b);
                    if (i <= 0) {
                        i = 0;
                    }
                    fvb fvbVar = this.d;
                    if (fvbVar != null) {
                        int d = fvbVar.b.d(i);
                        fvb fvbVar2 = this.d;
                        if (fvbVar2 != null) {
                            float f2 = fvbVar2.b.f(d) + round;
                            fvb fvbVar3 = this.d;
                            if (fvbVar3 != null) {
                                it7 it7Var = fvbVar3.b;
                                int i3 = (f2 > it7Var.f(it7Var.f - 1) ? 1 : (f2 == it7Var.f(it7Var.f - 1) ? 0 : -1));
                                fvb fvbVar4 = this.d;
                                if (i3 < 0) {
                                    if (fvbVar4 != null) {
                                        i2 = fvbVar4.b.e(f2);
                                    } else {
                                        c16.w("layoutResult");
                                        throw null;
                                    }
                                } else if (fvbVar4 != null) {
                                    i2 = fvbVar4.b.f;
                                } else {
                                    c16.w("layoutResult");
                                    throw null;
                                }
                                return b(i, j(i2 - 1, h) + 1);
                            }
                            c16.w("layoutResult");
                            throw null;
                        }
                        c16.w("layoutResult");
                        throw null;
                    }
                    c16.w("layoutResult");
                    throw null;
                }
                c16.w("node");
                throw null;
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.l4
    public final int[] d(int i) {
        int i2;
        if (c().length() > 0 && i > 0) {
            try {
                b8a b8aVar = this.e;
                if (b8aVar != null) {
                    rk9 g2 = b8aVar.g();
                    int round = Math.round(g2.d - g2.b);
                    int length = c().length();
                    if (length <= i) {
                        i = length;
                    }
                    fvb fvbVar = this.d;
                    if (fvbVar != null) {
                        int d = fvbVar.b.d(i);
                        fvb fvbVar2 = this.d;
                        if (fvbVar2 != null) {
                            float f2 = fvbVar2.b.f(d) - round;
                            if (f2 > nae.e) {
                                fvb fvbVar3 = this.d;
                                if (fvbVar3 != null) {
                                    i2 = fvbVar3.b.e(f2);
                                } else {
                                    c16.w("layoutResult");
                                    throw null;
                                }
                            } else {
                                i2 = 0;
                            }
                            if (i == c().length() && i2 < d) {
                                i2++;
                            }
                            return b(j(i2, g), i);
                        }
                        c16.w("layoutResult");
                        throw null;
                    }
                    c16.w("layoutResult");
                    throw null;
                }
                c16.w("node");
                throw null;
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int j(int i, oq9 oq9Var) {
        fvb fvbVar = this.d;
        if (fvbVar != null) {
            int i2 = fvbVar.i(i);
            fvb fvbVar2 = this.d;
            if (fvbVar2 != null) {
                oq9 h2 = fvbVar2.b.h(i2);
                fvb fvbVar3 = this.d;
                if (oq9Var != h2) {
                    if (fvbVar3 != null) {
                        return fvbVar3.i(i);
                    }
                    c16.w("layoutResult");
                    throw null;
                } else if (fvbVar3 != null) {
                    return fvbVar3.b.c(i, false) - 1;
                } else {
                    c16.w("layoutResult");
                    throw null;
                }
            }
            c16.w("layoutResult");
            throw null;
        }
        c16.w("layoutResult");
        throw null;
    }
}
