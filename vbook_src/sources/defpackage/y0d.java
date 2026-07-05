package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y0d  reason: default package */
/* loaded from: classes3.dex */
public final class y0d {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final boolean f;
    public final int g;
    public final String h;
    public final boolean i;
    public final int j;
    public final int k;

    public y0d(boolean z, String str, String str2, String str3, List list, boolean z2, int i, String str4, boolean z3, int i2, int i3) {
        list.getClass();
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = z2;
        this.g = i;
        this.h = str4;
        this.i = z3;
        this.j = i2;
        this.k = i3;
    }

    public static y0d a(y0d y0dVar, boolean z, String str, String str2, String str3, List list, boolean z2, int i, String str4, boolean z3, int i2, int i3, int i4) {
        String str5;
        List list2;
        boolean z4;
        int i5;
        String str6;
        boolean z5;
        int i6;
        int i7;
        if ((i4 & 1) != 0) {
            z = y0dVar.a;
        }
        boolean z6 = z;
        if ((i4 & 2) != 0) {
            str = y0dVar.b;
        }
        String str7 = str;
        if ((i4 & 4) != 0) {
            str2 = y0dVar.c;
        }
        String str8 = str2;
        if ((i4 & 8) != 0) {
            str5 = y0dVar.d;
        } else {
            str5 = str3;
        }
        if ((i4 & 16) != 0) {
            list2 = y0dVar.e;
        } else {
            list2 = list;
        }
        if ((i4 & 32) != 0) {
            z4 = y0dVar.f;
        } else {
            z4 = z2;
        }
        if ((i4 & 64) != 0) {
            i5 = y0dVar.g;
        } else {
            i5 = i;
        }
        if ((i4 & Token.CASE) != 0) {
            str6 = y0dVar.h;
        } else {
            str6 = str4;
        }
        if ((i4 & 256) != 0) {
            z5 = y0dVar.i;
        } else {
            z5 = z3;
        }
        if ((i4 & 512) != 0) {
            i6 = y0dVar.j;
        } else {
            i6 = i2;
        }
        if ((i4 & 1024) != 0) {
            i7 = y0dVar.k;
        } else {
            i7 = i3;
        }
        y0dVar.getClass();
        list2.getClass();
        return new y0d(z6, str7, str8, str5, list2, z4, i5, str6, z5, i6, i7);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof y0d) {
                y0d y0dVar = (y0d) obj;
                if (this.a != y0dVar.a || !this.b.equals(y0dVar.b) || !this.c.equals(y0dVar.c) || !this.d.equals(y0dVar.d) || !c16.i(this.e, y0dVar.e) || this.f != y0dVar.f || this.g != y0dVar.g || !this.h.equals(y0dVar.h) || this.i != y0dVar.i || this.j != y0dVar.j || this.k != y0dVar.k) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + hl5.a(this.j, eub.k(eub.j(hl5.a(this.g, eub.k(eub.l(eub.j(eub.j(eub.j(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), this.e, 31), 31, this.f), 31), 31, this.h), 31, this.i), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserState(isLogin=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", name=");
        nk2.C(sb, this.c, ", email=", this.d, ", colors=");
        sb.append(this.e);
        sb.append(", isPremium=");
        sb.append(this.f);
        sb.append(", role=");
        nk2.z(this.g, ", avatar=", this.h, ", verified=", sb);
        sb.append(this.i);
        sb.append(", messageUnreadCount=");
        sb.append(this.j);
        sb.append(", notificationUnreadCount=");
        return rs8.g(this.k, ")", sb);
    }
}
