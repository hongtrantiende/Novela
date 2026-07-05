package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oce  reason: default package */
/* loaded from: classes.dex */
public final class oce implements x68 {
    public final /* synthetic */ int a;
    public final String b;
    public static final oce c = new oce("ENABLED", 0);
    public static final oce d = new oce("DISABLED", 0);
    public static final oce e = new oce("DESTROYED", 0);
    public static final oce f = new oce("TINK", 1);
    public static final oce C = new oce("CRUNCHY", 1);
    public static final oce D = new oce("NO_PREFIX", 1);
    public static final oce E = new oce("TINK", 2);
    public static final oce F = new oce("NO_PREFIX", 2);
    public static final oce G = new oce("TINK", 3);
    public static final oce H = new oce("CRUNCHY", 3);
    public static final oce I = new oce("LEGACY", 3);
    public static final oce J = new oce("NO_PREFIX", 3);

    public oce(String str) {
        this.a = 5;
        str.getClass();
        this.b = str;
    }

    public static oce a(km8 km8Var) {
        String str;
        String str2;
        km8Var.N(2);
        int z = km8Var.z();
        int i = z >> 1;
        int z2 = ((km8Var.z() >> 3) & 31) | ((z & 1) << 5);
        if (i != 4 && i != 5 && i != 7 && i != 8) {
            if (i == 9) {
                str = "dvav";
            } else if (i == 10) {
                str = "dav1";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str3 = ".";
        if (i >= 10) {
            str2 = ".";
        } else {
            str2 = ".0";
        }
        sb.append(str2);
        sb.append(i);
        if (z2 < 10) {
            str3 = ".0";
        }
        return new oce(nk2.s(z2, str3, sb), 4);
    }

    @Override // defpackage.x68
    public String m() {
        return s21.p(new StringBuilder("expected '"), this.b, '\'');
    }

    public String toString() {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return str;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ oce(String str, int i) {
        this.a = i;
        this.b = str;
    }
}
