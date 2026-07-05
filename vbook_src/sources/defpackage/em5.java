package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: em5  reason: default package */
/* loaded from: classes3.dex */
public final class em5 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final List d;

    public em5(boolean z, boolean z2, String str, ArrayList arrayList, int i) {
        str = (i & 4) != 0 ? null : str;
        arrayList = (i & 8) != 0 ? null : arrayList;
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof em5) {
                em5 em5Var = (em5) obj;
                if (this.a != em5Var.a || this.b != em5Var.b || !c16.i(this.c, em5Var.c) || !c16.i(this.d, em5Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int k = eub.k(Boolean.hashCode(this.a) * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (k + hashCode) * 31;
        List list = this.d;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder p = rs8.p("ImageContent(isLoading=", this.a, ", isError=", this.b, ", errorMessage=");
        p.append(this.c);
        p.append(", images=");
        p.append(this.d);
        p.append(")");
        return p.toString();
    }
}
