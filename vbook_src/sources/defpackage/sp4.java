package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sp4  reason: default package */
/* loaded from: classes3.dex */
public final class sp4 {
    public final boolean a;
    public final String b;
    public final float c;
    public final float d;
    public final List e;

    public sp4(boolean z, String str, float f, float f2, List list) {
        list.getClass();
        this.a = z;
        this.b = str;
        this.c = f;
        this.d = f2;
        this.e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    public static sp4 a(sp4 sp4Var, String str, float f, float f2, ArrayList arrayList, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = sp4Var.a;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            str = sp4Var.b;
        }
        if ((i & 4) != 0) {
            f = sp4Var.c;
        }
        if ((i & 8) != 0) {
            f2 = sp4Var.d;
        }
        ArrayList arrayList2 = arrayList;
        if ((i & 16) != 0) {
            arrayList2 = sp4Var.e;
        }
        ArrayList arrayList3 = arrayList2;
        sp4Var.getClass();
        str.getClass();
        arrayList3.getClass();
        float f3 = f2;
        float f4 = f;
        return new sp4(z, str, f4, f3, arrayList3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sp4) {
                sp4 sp4Var = (sp4) obj;
                if (this.a != sp4Var.a || !this.b.equals(sp4Var.b) || Float.compare(this.c, sp4Var.c) != 0 || Float.compare(this.d, sp4Var.d) != 0 || !c16.i(this.e, sp4Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + nk2.d(this.d, nk2.d(this.c, eub.j(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontSettingState(isLoading=");
        sb.append(this.a);
        sb.append(", currentFont=");
        sb.append(this.b);
        sb.append(", fontScale=");
        s21.D(sb, this.c, ", densityScale=", this.d, ", localFonts=");
        return rs8.n(sb, this.e, ")");
    }
}
