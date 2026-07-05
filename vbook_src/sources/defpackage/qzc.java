package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qzc  reason: default package */
/* loaded from: classes3.dex */
public final class qzc {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final boolean e;

    public qzc(String str, String str2, String str3, List list, boolean z) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = z;
    }

    public static qzc a(qzc qzcVar, String str, String str2, String str3, List list, boolean z, int i) {
        if ((i & 1) != 0) {
            str = qzcVar.a;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            str2 = qzcVar.b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = qzcVar.c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            list = qzcVar.d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            z = qzcVar.e;
        }
        qzcVar.getClass();
        list2.getClass();
        return new qzc(str4, str5, str6, list2, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qzc) {
                qzc qzcVar = (qzc) obj;
                if (!this.a.equals(qzcVar.a) || !this.b.equals(qzcVar.b) || !this.c.equals(qzcVar.c) || !c16.i(this.d, qzcVar.d) || this.e != qzcVar.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + eub.l(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("UserDetailState(userName=", this.a, ", email=", this.b, ", avatar=");
        y.append(this.c);
        y.append(", colors=");
        y.append(this.d);
        y.append(", isLoading=");
        return rs8.m(")", y, this.e);
    }
}
