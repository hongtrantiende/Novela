package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lu0  reason: default package */
/* loaded from: classes.dex */
public final class lu0 implements ku0 {
    public final /* synthetic */ int a = 2;
    public int b;
    public int c;
    public int d;
    public int e;
    public Object f;

    public lu0(ps psVar, long j) {
        String str = psVar.b;
        cw cwVar = new cw(3, (byte) 0);
        cwVar.d = str;
        cwVar.b = -1;
        cwVar.c = -1;
        this.f = cwVar;
        this.b = fxb.g(j);
        this.c = fxb.f(j);
        this.d = -1;
        this.e = -1;
        int g = fxb.g(j);
        int f = fxb.f(j);
        if (g >= 0 && g <= str.length()) {
            if (f >= 0 && f <= str.length()) {
                if (g <= f) {
                    return;
                }
                vs.m(rs8.k("Do not set reversed range: ", g, f, " > "));
                throw null;
            }
            cy7.k(rs8.k("end (", f, str.length(), ") offset is outside of text region "));
            throw null;
        }
        cy7.k(rs8.k("start (", g, str.length(), ") offset is outside of text region "));
        throw null;
    }

    public void a(int i, int i2) {
        long a = sze.a(i, i2);
        ((cw) this.f).l(i, i2, "");
        long m = zve.m(sze.a(this.b, this.c), a);
        j(fxb.g(m));
        i(fxb.f(m));
        int i3 = this.d;
        if (i3 != -1) {
            long m2 = zve.m(sze.a(i3, this.e), a);
            if (fxb.d(m2)) {
                this.d = -1;
                this.e = -1;
                return;
            }
            this.d = fxb.g(m2);
            this.e = fxb.f(m2);
        }
    }

    @Override // defpackage.ku0
    public int b() {
        return -1;
    }

    public char c(int i) {
        cw cwVar = (cw) this.f;
        mv4 mv4Var = (mv4) cwVar.e;
        if (mv4Var == null) {
            return ((String) cwVar.d).charAt(i);
        }
        if (i < cwVar.b) {
            return ((String) cwVar.d).charAt(i);
        }
        int a = mv4Var.b - mv4Var.a();
        int i2 = cwVar.b;
        if (i < a + i2) {
            int i3 = i - i2;
            int i4 = mv4Var.d;
            char[] cArr = mv4Var.c;
            if (i3 < i4) {
                return cArr[i3];
            }
            return cArr[(i3 - i4) + mv4Var.e];
        }
        return ((String) cwVar.d).charAt(i - ((a - cwVar.c) + i2));
    }

    public fxb d() {
        int i = this.d;
        if (i != -1) {
            return new fxb(sze.a(i, this.e));
        }
        return null;
    }

    public long e() {
        int i = this.d;
        if (i != 0) {
            int i2 = this.b;
            long j = ((long[]) this.f)[i2];
            this.b = this.e & (i2 + 1);
            this.d = i - 1;
            return j;
        }
        xk5.g();
        return 0L;
    }

    public void f(int i, int i2, String str) {
        cw cwVar = (cw) this.f;
        if (i >= 0 && i <= cwVar.e()) {
            if (i2 >= 0 && i2 <= cwVar.e()) {
                if (i <= i2) {
                    cwVar.l(i, i2, str);
                    j(str.length() + i);
                    i(str.length() + i);
                    this.d = -1;
                    this.e = -1;
                    return;
                }
                vs.m(rs8.k("Do not set reversed range: ", i, i2, " > "));
                return;
            }
            cy7.k(rs8.k("end (", i2, cwVar.e(), ") offset is outside of text region "));
            return;
        }
        cy7.k(rs8.k("start (", i, cwVar.e(), ") offset is outside of text region "));
    }

    public void g(int i, int i2) {
        cw cwVar = (cw) this.f;
        if (i >= 0 && i <= cwVar.e()) {
            if (i2 >= 0 && i2 <= cwVar.e()) {
                if (i < i2) {
                    this.d = i;
                    this.e = i2;
                    return;
                }
                vs.m(rs8.k("Do not set reversed or empty range: ", i, i2, " > "));
                return;
            }
            cy7.k(rs8.k("end (", i2, cwVar.e(), ") offset is outside of text region "));
            return;
        }
        cy7.k(rs8.k("start (", i, cwVar.e(), ") offset is outside of text region "));
    }

    public void h(int i, int i2) {
        cw cwVar = (cw) this.f;
        if (i >= 0 && i <= cwVar.e()) {
            if (i2 >= 0 && i2 <= cwVar.e()) {
                if (i <= i2) {
                    j(i);
                    i(i2);
                    return;
                }
                vs.m(rs8.k("Do not set reversed range: ", i, i2, " > "));
                return;
            }
            cy7.k(rs8.k("end (", i2, cwVar.e(), ") offset is outside of text region "));
            return;
        }
        cy7.k(rs8.k("start (", i, cwVar.e(), ") offset is outside of text region "));
    }

    public void i(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            mv5.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public void j(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            mv5.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    @Override // defpackage.ku0
    public int s() {
        return this.b;
    }

    @Override // defpackage.ku0
    public int t() {
        km8 km8Var = (km8) this.f;
        int i = this.c;
        if (i == 8) {
            return km8Var.z();
        }
        if (i == 16) {
            return km8Var.G();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 == 0) {
            int z = km8Var.z();
            this.e = z;
            return (z & 240) >> 4;
        }
        return this.e & 15;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return ((cw) this.f).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ lu0() {
    }

    public lu0(ts7 ts7Var) {
        km8 km8Var = ts7Var.c;
        this.f = km8Var;
        km8Var.M(12);
        this.c = km8Var.D() & 255;
        this.b = km8Var.D();
    }
}
