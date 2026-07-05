package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ood  reason: default package */
/* loaded from: classes3.dex */
public final class ood extends xod {
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ood(yod yodVar, String str, String str2, String str3, String str4) {
        super(yodVar);
        this.b = str4.toString();
        this.c = str3.toString();
        this.d = str2.toString();
        this.e = str.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ood.class != obj.getClass()) {
            return false;
        }
        ood oodVar = (ood) obj;
        if (c16.i(this.b, oodVar.b) && c16.i(this.c, oodVar.c) && c16.i(this.d, oodVar.d) && c16.i(this.e, oodVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + eub.j(eub.j(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        String str = this.e;
        boolean j0 = k4b.j0(str);
        String str2 = this.b;
        String str3 = this.d;
        if (j0) {
            return str3 + "=\"" + str2 + '\"';
        }
        String str4 = this.c;
        if (k4b.j0(str4)) {
            StringBuilder sb = new StringBuilder("{");
            sb.append(str);
            sb.append('}');
            sb.append(str3);
            sb.append("=\"");
            return s21.p(sb, str2, '\"');
        }
        return "{" + str + '}' + str4 + ':' + str3 + "=\"" + str2 + '\"';
    }
}
