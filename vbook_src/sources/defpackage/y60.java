package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: y60  reason: default package */
/* loaded from: classes3.dex */
public final class y60 {
    public static final x60 Companion = new Object();
    public final vyc a;
    public final rc8 b;
    public final kw8 c;
    public final String d;
    public final String e;

    public /* synthetic */ y60(int i, vyc vycVar, rc8 rc8Var, kw8 kw8Var, String str, String str2) {
        if (31 == (i & 31)) {
            this.a = vycVar;
            this.b = rc8Var;
            this.c = kw8Var;
            this.d = str;
            this.e = str2;
            return;
        }
        w92.x(i, 31, w60.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y60)) {
            return false;
        }
        y60 y60Var = (y60) obj;
        if (c16.i(this.a, y60Var.a) && c16.i(this.b, y60Var.b) && c16.i(this.c, y60Var.c) && c16.i(this.d, y60Var.d) && c16.i(this.e, y60Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode();
        int j = eub.j((this.c.hashCode() + ((hashCode2 + (this.a.C.hashCode() * 31)) * 31)) * 31, 31, this.d);
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return j + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthCodeRequest(url=");
        sb.append(this.a);
        sb.append(", config=");
        sb.append(this.b);
        sb.append(", pkce=");
        sb.append(this.c);
        sb.append(", state=");
        sb.append(this.d);
        sb.append(", nonce=");
        return s21.q(sb, this.e, ")");
    }

    public y60(vyc vycVar, rc8 rc8Var, kw8 kw8Var, String str, String str2) {
        rc8Var.getClass();
        this.a = vycVar;
        this.b = rc8Var;
        this.c = kw8Var;
        this.d = str;
        this.e = str2;
    }
}
