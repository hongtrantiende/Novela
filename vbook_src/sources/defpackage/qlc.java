package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qlc */
/* loaded from: classes3.dex */
public final class qlc {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final int h;
    public final List i;
    public final List j;
    public final List k;

    public qlc(boolean z, String str, String str2, String str3, boolean z2, String str4, String str5, int i, List list, List list2, List list3) {
        s21.B(str, str2, str3, str4, str5);
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z2;
        this.f = str4;
        this.g = str5;
        this.h = i;
        this.i = list;
        this.j = list2;
        this.k = list3;
    }

    public static qlc a(boolean z, String str, String str2, String str3, boolean z2, String str4, String str5, int i, List list, List list2, List list3) {
        s21.B(str, str2, str3, str4, str5);
        list.getClass();
        list2.getClass();
        list3.getClass();
        return new qlc(z, str, str2, str3, z2, str4, str5, i, list, list2, list3);
    }

    public static /* synthetic */ qlc b(qlc qlcVar, String str, String str2, String str3, boolean z, int i, List list, List list2, List list3, int i2) {
        boolean z2;
        int i3;
        List list4;
        List list5;
        List list6;
        boolean z3 = qlcVar.a;
        if ((i2 & 2) != 0) {
            str = qlcVar.b;
        }
        if ((i2 & 4) != 0) {
            str2 = qlcVar.c;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            str3 = qlcVar.d;
        }
        String str5 = str3;
        if ((i2 & 16) != 0) {
            z2 = qlcVar.e;
        } else {
            z2 = z;
        }
        String str6 = qlcVar.f;
        String str7 = qlcVar.g;
        if ((i2 & Token.CASE) != 0) {
            i3 = qlcVar.h;
        } else {
            i3 = i;
        }
        if ((i2 & 256) != 0) {
            list4 = qlcVar.i;
        } else {
            list4 = list;
        }
        if ((i2 & 512) != 0) {
            list5 = qlcVar.j;
        } else {
            list5 = list2;
        }
        if ((i2 & 1024) != 0) {
            list6 = qlcVar.k;
        } else {
            list6 = list3;
        }
        qlcVar.getClass();
        return a(z3, str, str4, str5, z2, str6, str7, i3, list4, list5, list6);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qlc) {
                qlc qlcVar = (qlc) obj;
                if (this.a != qlcVar.a || !c16.i(this.b, qlcVar.b) || !c16.i(this.c, qlcVar.c) || !c16.i(this.d, qlcVar.d) || this.e != qlcVar.e || !c16.i(this.f, qlcVar.f) || !c16.i(this.g, qlcVar.g) || this.h != qlcVar.h || !c16.i(this.i, qlcVar.i) || !c16.i(this.j, qlcVar.j) || !c16.i(this.k, qlcVar.k)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.k.hashCode() + eub.l(eub.l(hl5.a(this.h, eub.j(eub.j(eub.k(eub.j(eub.j(eub.j(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), this.i, 31), this.j, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TranslateSettingState(isLoading=");
        sb.append(this.a);
        sb.append(", engineId=");
        sb.append(this.b);
        sb.append(", fromLanguageId=");
        nk2.C(sb, this.c, ", toLanguageId=", this.d, ", isShowRaw=");
        sb.append(this.e);
        sb.append(", bookId=");
        sb.append(this.f);
        sb.append(", extensionId=");
        a82.u(this.h, this.g, ", saveSettingType=", ", availableEngines=", sb);
        sb.append(this.i);
        sb.append(", availableFromLanguages=");
        sb.append(this.j);
        sb.append(", availableToLanguages=");
        return rs8.n(sb, this.k, ")");
    }
}
