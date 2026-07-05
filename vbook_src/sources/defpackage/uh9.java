package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uh9  reason: default package */
/* loaded from: classes3.dex */
public class uh9 extends z1 {
    public final f06 C;
    public final char[] D;
    public int E;
    public final pz F;

    public uh9(f06 f06Var, char[] cArr, a46 a46Var) {
        super(a46Var);
        this.C = f06Var;
        this.D = cArr;
        this.E = Token.CASE;
        this.F = new pz(cArr);
        F(0);
    }

    @Override // defpackage.z1
    public final String A(int i, int i2) {
        pz pzVar = this.F;
        return r4b.D(pzVar.a, i, Math.min(i2, pzVar.b));
    }

    public final void F(int i) {
        pz pzVar = this.F;
        char[] cArr = pzVar.a;
        if (i != 0) {
            int i2 = this.b;
            b00.X(cArr, cArr, 0, i2, i2 + i);
        }
        int i3 = pzVar.b;
        while (true) {
            if (i == i3) {
                break;
            }
            int g = this.C.g(cArr, i, i3 - i);
            if (g == -1) {
                pzVar.b = Math.min(pzVar.a.length, i);
                this.E = -1;
                break;
            }
            i += g;
        }
        this.b = 0;
    }

    public final void G() {
        yb1 yb1Var = yb1.d;
        yb1Var.getClass();
        char[] cArr = this.D;
        cArr.getClass();
        if (cArr.length == 16384) {
            yb1Var.E(cArr);
            return;
        }
        int length = cArr.length;
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + length).toString());
    }

    @Override // defpackage.z1
    public final void c(int i, int i2) {
        ((StringBuilder) this.f).append(this.F.a, i, i2 - i);
    }

    @Override // defpackage.z1
    public boolean d() {
        o();
        int i = this.b;
        while (true) {
            int y = y(i);
            if (y != -1) {
                char c = this.F.a[y];
                if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
                    this.b = y;
                    return z1.u(c);
                }
                i = y + 1;
            } else {
                this.b = y;
                return false;
            }
        }
    }

    @Override // defpackage.z1
    public final String f() {
        String str;
        i('\"');
        int i = this.b;
        pz pzVar = this.F;
        int i2 = pzVar.b;
        char[] cArr = pzVar.a;
        int i3 = i;
        while (true) {
            if (i3 < i2) {
                if (cArr[i3] == '\"') {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 == -1) {
            int y = y(i);
            int i4 = this.b;
            if (y == -1) {
                int i5 = i4 > 0 ? i4 - 1 : i4;
                if (i4 != pzVar.b && i5 >= 0) {
                    str = String.valueOf(pzVar.a[i5]);
                } else {
                    str = "EOF";
                }
                z1.r(this, hl5.n("Expected quotation mark '\"', but had '", str, "' instead"), i5, null, 4);
                throw null;
            }
            return l(i4, y, pzVar);
        }
        for (int i6 = i; i6 < i3; i6++) {
            if (cArr[i6] == '\\') {
                return l(this.b, i6, pzVar);
            }
        }
        this.b = i3 + 1;
        return r4b.D(cArr, i, Math.min(i3, pzVar.b));
    }

    @Override // defpackage.z1
    public byte g() {
        o();
        int i = this.b;
        while (true) {
            int y = y(i);
            if (y != -1) {
                int i2 = y + 1;
                byte f = pbe.f(this.F.a[y]);
                if (f != 3) {
                    this.b = i2;
                    return f;
                }
                i = i2;
            } else {
                this.b = y;
                return (byte) 10;
            }
        }
    }

    @Override // defpackage.z1
    public void i(char c) {
        o();
        int i = this.b;
        while (true) {
            int y = y(i);
            if (y != -1) {
                int i2 = y + 1;
                char c2 = this.F.a[y];
                if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t') {
                    this.b = i2;
                    if (c2 == c) {
                        return;
                    }
                    E(c);
                    throw null;
                }
                i = i2;
            } else {
                this.b = y;
                E(c);
                throw null;
            }
        }
    }

    @Override // defpackage.z1
    public final void o() {
        int i = this.F.b - this.b;
        if (i > this.E) {
            return;
        }
        F(i);
    }

    @Override // defpackage.z1
    public final CharSequence t() {
        return this.F;
    }

    @Override // defpackage.z1
    public final String v(String str, boolean z) {
        str.getClass();
        return null;
    }

    @Override // defpackage.z1
    public final int y(int i) {
        pz pzVar = this.F;
        if (i < pzVar.b) {
            return i;
        }
        this.b = i;
        o();
        if (this.b == 0 && pzVar.length() != 0) {
            return 0;
        }
        return -1;
    }

    @Override // defpackage.z1
    public int z() {
        int y;
        char c;
        int i = this.b;
        while (true) {
            y = y(i);
            if (y == -1 || !((c = this.F.a[y]) == ' ' || c == '\n' || c == '\r' || c == '\t')) {
                break;
            }
            i = y + 1;
        }
        this.b = y;
        return y;
    }
}
