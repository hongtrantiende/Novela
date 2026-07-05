package defpackage;

import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: njb  reason: default package */
/* loaded from: classes.dex */
public final class njb {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public njb(int i, int i2, String str, String str2, String str3, boolean z) {
        int i3;
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        if (k4b.V(upperCase, "INT", false)) {
            i3 = 3;
        } else if (!k4b.V(upperCase, "CHAR", false) && !k4b.V(upperCase, "CLOB", false) && !k4b.V(upperCase, "TEXT", false)) {
            if (k4b.V(upperCase, "BLOB", false)) {
                i3 = 5;
            } else if (!k4b.V(upperCase, "REAL", false) && !k4b.V(upperCase, "FLOA", false) && !k4b.V(upperCase, "DOUB", false)) {
                i3 = 1;
            } else {
                i3 = 4;
            }
        } else {
            i3 = 2;
        }
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj instanceof njb) {
                if (this.d > 0) {
                    z = true;
                } else {
                    z = false;
                }
                njb njbVar = (njb) obj;
                int i = njbVar.f;
                if (njbVar.d > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z == z2 && c16.i(this.a, njbVar.a) && this.c == njbVar.c) {
                    String str = njbVar.e;
                    int i2 = this.f;
                    String str2 = this.e;
                    if ((i2 != 1 || i != 2 || str2 == null || mue.i(str2, str)) && ((i2 != 2 || i != 1 || str == null || mue.i(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : mue.i(str2, str))) && this.g == njbVar.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.a.hashCode() * 31) + this.g) * 31;
        if (this.c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((hashCode + i) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return l4b.x(l4b.z(sb.toString()), "    ");
    }
}
