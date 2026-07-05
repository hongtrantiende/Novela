package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dnb  reason: default package */
/* loaded from: classes.dex */
public final class dnb {
    public final String a;
    public final int b;
    public final float c;
    public final float d;
    public final sc1 e;

    public dnb(String str, int i, float f, float f2, sc1 sc1Var) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = f;
        this.d = f2;
        this.e = sc1Var;
    }

    public static dnb a(dnb dnbVar, String str, float f, float f2, int i) {
        if ((i & 1) != 0) {
            str = dnbVar.a;
        }
        String str2 = str;
        int i2 = dnbVar.b;
        if ((i & 4) != 0) {
            f = dnbVar.c;
        }
        float f3 = f;
        if ((i & 8) != 0) {
            f2 = dnbVar.d;
        }
        sc1 sc1Var = dnbVar.e;
        dnbVar.getClass();
        str2.getClass();
        return new dnb(str2, i2, f3, f2, sc1Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dnb) {
                dnb dnbVar = (dnb) obj;
                if (!c16.i(this.a, dnbVar.a) || this.b != dnbVar.b || Float.compare(this.c, dnbVar.c) != 0 || Float.compare(this.d, dnbVar.d) != 0 || !this.e.equals(dnbVar.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + nk2.d(this.d, nk2.d(this.c, hl5.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder s = s21.s("TextChar(text=", this.a, ", index=", this.b, ", x=");
        s21.D(s, this.c, ", width=", this.d, ", style=");
        s.append(this.e);
        s.append(")");
        return s.toString();
    }
}
