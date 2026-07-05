package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wx0  reason: default package */
/* loaded from: classes3.dex */
public final class wx0 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final List g;
    public final int h;

    public wx0(boolean z, String str, String str2, String str3, List list, List list2, List list3, int i) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = list2;
        this.g = list3;
        this.h = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.List] */
    public static wx0 a(wx0 wx0Var, boolean z, String str, String str2, String str3, List list, ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ArrayList arrayList3;
        int i3;
        if ((i2 & 1) != 0) {
            z = wx0Var.a;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            str = wx0Var.b;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = wx0Var.c;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = wx0Var.d;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            list = wx0Var.e;
        }
        List list2 = list;
        ArrayList arrayList4 = arrayList;
        if ((i2 & 32) != 0) {
            arrayList4 = wx0Var.f;
        }
        ArrayList arrayList5 = arrayList4;
        if ((i2 & 64) != 0) {
            arrayList3 = wx0Var.g;
        } else {
            arrayList3 = arrayList2;
        }
        if ((i2 & Token.CASE) != 0) {
            i3 = wx0Var.h;
        } else {
            i3 = i;
        }
        wx0Var.getClass();
        str4.getClass();
        list2.getClass();
        arrayList5.getClass();
        arrayList3.getClass();
        return new wx0(z2, str4, str5, str6, list2, arrayList5, arrayList3, i3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wx0) {
                wx0 wx0Var = (wx0) obj;
                if (this.a != wx0Var.a || !this.b.equals(wx0Var.b) || !this.c.equals(wx0Var.c) || !this.d.equals(wx0Var.d) || !c16.i(this.e, wx0Var.e) || !c16.i(this.f, wx0Var.f) || !c16.i(this.g, wx0Var.g) || this.h != wx0Var.h) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + eub.l(eub.l(eub.l(eub.j(eub.j(eub.j(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), this.e, 31), this.f, 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrowserTranslateState(isEnabled=");
        sb.append(this.a);
        sb.append(", engineId=");
        sb.append(this.b);
        sb.append(", fromLanguage=");
        nk2.C(sb, this.c, ", toLanguage=", this.d, ", engines=");
        sb.append(this.e);
        sb.append(", fromLanguages=");
        sb.append(this.f);
        sb.append(", toLanguages=");
        sb.append(this.g);
        sb.append(", pendingChunks=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
