package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rlc  reason: default package */
/* loaded from: classes3.dex */
public final class rlc {
    public final boolean a;
    public final int b;
    public final List c;

    public rlc(int i, List list, boolean z) {
        list.getClass();
        this.a = z;
        this.b = i;
        this.c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    public static rlc a(rlc rlcVar, boolean z, int i, ArrayList arrayList, int i2) {
        if ((i2 & 1) != 0) {
            z = rlcVar.a;
        }
        if ((i2 & 2) != 0) {
            i = rlcVar.b;
        }
        ArrayList arrayList2 = arrayList;
        if ((i2 & 4) != 0) {
            arrayList2 = rlcVar.c;
        }
        rlcVar.getClass();
        arrayList2.getClass();
        return new rlc(i, arrayList2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlc)) {
            return false;
        }
        rlc rlcVar = (rlc) obj;
        if (this.a == rlcVar.a && this.b == rlcVar.b && c16.i(this.c, rlcVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + hl5.a(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TranslateSettingState(isEnabled=");
        sb.append(this.a);
        sb.append(", autoDetectLanguageMode=");
        sb.append(this.b);
        sb.append(", engines=");
        return rs8.n(sb, this.c, ")");
    }
}
