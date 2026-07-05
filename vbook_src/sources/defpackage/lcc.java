package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lcc  reason: default package */
/* loaded from: classes.dex */
public final class lcc implements AutoCloseable {
    public static final kcc c = new Object();
    public static final char[] d = {'*', '|', '_', '-'};
    public final /* synthetic */ int a = 0;
    public final Object b;

    public lcc(String str) {
        str.getClass();
        this.b = new vc1(str);
    }

    public String C() {
        char c2;
        char V;
        vc1 vc1Var = (vc1) this.b;
        if (!vc1Var.g0()) {
            kcc kccVar = c;
            String G = vc1Var.G(-1, new wob(1, kccVar, kcc.class, "isIdent", "isIdent(C)Z", 0, 16));
            char V2 = vc1Var.V();
            if (V2 != '\\' && V2 != 0) {
                return G;
            }
            StringBuilder b = d4b.b();
            if (G.length() > 0) {
                b.append(G);
            }
            while (!vc1Var.g0()) {
                char V3 = vc1Var.V();
                if (kcc.a(kccVar, V3)) {
                    b.append(vc1Var.C());
                } else if (V3 == 0) {
                    o();
                    b.append((char) 65533);
                } else if (V3 != '\\') {
                    break;
                } else {
                    o();
                    if (!vc1Var.g0() && ((V = vc1Var.V()) == '\n' || V == '\r' || V == '\f')) {
                        vc1Var.l1();
                        break;
                    } else if (vc1Var.g0()) {
                        b.append((char) 65533);
                    } else {
                        char C = vc1Var.C();
                        if (!d4b.g(C)) {
                            b.append(C);
                        } else {
                            vc1Var.l1();
                            String G2 = vc1Var.G(6, new txb(11));
                            Integer R = r4b.R(16, G2);
                            if (R != null) {
                                int intValue = R.intValue();
                                if (intValue != 0 && (intValue >>> 16) < 17 && (55296 > (c2 = (char) intValue) || c2 >= 57344)) {
                                    b.appendCodePoint(intValue);
                                } else {
                                    b.append((char) 65533);
                                }
                                if (!vc1Var.g0()) {
                                    char V4 = vc1Var.V();
                                    if (V4 == '\r') {
                                        o();
                                        if (!vc1Var.g0() && vc1Var.V() == '\n') {
                                            o();
                                        }
                                    } else if (V4 == ' ' || V4 == '\t' || V4 == '\n' || V4 == '\r' || V4 == '\f') {
                                        o();
                                    }
                                }
                            } else {
                                vs.m("Invalid escape sequence: ".concat(G2));
                                return null;
                            }
                        }
                    }
                }
            }
            return d4b.l(b);
        }
        vs.m("CSS identifier expected, but end of input found");
        return null;
    }

    public boolean G() {
        boolean z = false;
        while (nqe.y(((vc1) this.b).V())) {
            o();
            z = true;
        }
        return z;
    }

    public boolean Q(char c2) {
        vc1 vc1Var = (vc1) this.b;
        if (vc1Var.y0(c2)) {
            vc1Var.C();
            return true;
        }
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((vc1) obj).close();
                return;
            default:
                ((ve) obj).invoke();
                return;
        }
    }

    public void o() {
        vc1 vc1Var = (vc1) this.b;
        if (!vc1Var.g0()) {
            vc1Var.o();
        }
    }

    public String q(char c2, char c3) {
        StringBuilder b = d4b.b();
        vc1 vc1Var = (vc1) this.b;
        if (vc1Var.e - vc1Var.d < 1024) {
            vc1Var.f = 0;
        }
        vc1Var.q();
        vc1Var.D = vc1Var.d;
        char c4 = 0;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        boolean z3 = false;
        while (!vc1Var.g0()) {
            char C = vc1Var.C();
            if (c4 == '\\') {
                if (C != 'E') {
                    if (C == 'Q') {
                        z3 = true;
                    }
                } else {
                    z3 = false;
                }
                b.append(C);
            } else {
                if (C == '\'' && C != c2 && !z) {
                    z2 = !z2;
                } else if (C == '\"' && C != c2 && !z2) {
                    z = !z;
                }
                if (!z2 && !z && !z3) {
                    if (C == c2) {
                        i++;
                        if (i > 1) {
                            b.append(C);
                        }
                    } else if (C == c3) {
                        i--;
                        if (i > 0) {
                            b.append(C);
                        }
                    } else {
                        b.append(C);
                    }
                } else {
                    b.append(C);
                }
            }
            if (i <= 0) {
                break;
            }
            c4 = C;
        }
        String l = d4b.l(b);
        if (i <= 0) {
            return l;
        }
        vc1Var.k1();
        throw new IllegalArgumentException("Did not find balanced marker at '" + l + "'");
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return ((vc1) this.b).toString();
            default:
                return super.toString();
        }
    }

    public lcc(ve veVar) {
        this.b = veVar;
    }
}
