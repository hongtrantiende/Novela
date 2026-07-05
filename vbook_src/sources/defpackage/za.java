package defpackage;

import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: za  reason: default package */
/* loaded from: classes3.dex */
public final class za {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final List e;
    public final Map f;
    public final l9 g;
    public final String h;

    public za(boolean z, boolean z2, boolean z3, List list, List list2, Map map, l9 l9Var, String str) {
        list.getClass();
        list2.getClass();
        map.getClass();
        l9Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
        this.e = list2;
        this.f = map;
        this.g = l9Var;
        this.h = str;
    }

    public static za a(za zaVar, boolean z, boolean z2, List list, List list2, Map map, l9 l9Var, String str, int i) {
        boolean z3;
        String str2;
        if ((i & 1) != 0) {
            z = zaVar.a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z3 = zaVar.b;
        } else {
            z3 = false;
        }
        boolean z5 = z3;
        if ((i & 4) != 0) {
            z2 = zaVar.c;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            list = zaVar.d;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = zaVar.e;
        }
        List list4 = list2;
        if ((i & 32) != 0) {
            map = zaVar.f;
        }
        Map map2 = map;
        if ((i & 64) != 0) {
            l9Var = zaVar.g;
        }
        l9 l9Var2 = l9Var;
        if ((i & Token.CASE) != 0) {
            str2 = zaVar.h;
        } else {
            str2 = str;
        }
        zaVar.getClass();
        list3.getClass();
        list4.getClass();
        map2.getClass();
        l9Var2.getClass();
        return new za(z4, z5, z6, list3, list4, map2, l9Var2, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za)) {
            return false;
        }
        za zaVar = (za) obj;
        if (this.a == zaVar.a && this.b == zaVar.b && this.c == zaVar.c && c16.i(this.d, zaVar.d) && c16.i(this.e, zaVar.e) && c16.i(this.f, zaVar.f) && c16.i(this.g, zaVar.g) && c16.i(this.h, zaVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.g.hashCode() + rs8.a(eub.l(eub.l(eub.k(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), this.d, 31), this.e, 31), 31, this.f)) * 31;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder p = rs8.p("AiTtsModelState(isLoadingData=", this.a, ", isLoadingModels=", this.b, ", isRefreshing=");
        p.append(this.c);
        p.append(", installedModels=");
        p.append(this.d);
        p.append(", remoteModels=");
        p.append(this.e);
        p.append(", downloadStatus=");
        p.append(this.f);
        p.append(", dataDownloadStatus=");
        p.append(this.g);
        p.append(", errorMessage=");
        p.append(this.h);
        p.append(")");
        return p.toString();
    }
}
