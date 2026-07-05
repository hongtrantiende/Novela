package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zb3  reason: default package */
/* loaded from: classes.dex */
public final class zb3 {
    public final String a;
    public final String b;
    public final String c;
    public final Map d;

    public zb3(String str, String str2, String str3, Map map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zb3) {
                zb3 zb3Var = (zb3) obj;
                if (!this.a.equals(zb3Var.a) || !this.b.equals(zb3Var.b) || !this.c.equals(zb3Var.c) || !this.d.equals(zb3Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder y = nk2.y("DocHtmlDocument(html=", this.a, ", title=", this.b, ", creator=");
        y.append(this.c);
        y.append(", images=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
