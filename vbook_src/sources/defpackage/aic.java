package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aic  reason: default package */
/* loaded from: classes3.dex */
public final class aic {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List e;

    public aic(String str, boolean z, boolean z2, boolean z3, List list) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = list;
    }

    public static aic a(aic aicVar, String str, boolean z, boolean z2, List list, int i) {
        if ((i & 1) != 0) {
            str = aicVar.a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            z = aicVar.b;
        }
        boolean z3 = z;
        boolean z4 = aicVar.c;
        if ((i & 8) != 0) {
            z2 = aicVar.d;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            list = aicVar.e;
        }
        aicVar.getClass();
        str2.getClass();
        return new aic(str2, z3, z4, z5, list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof aic) {
                aic aicVar = (aic) obj;
                if (!this.a.equals(aicVar.a) || this.b != aicVar.b || this.c != aicVar.c || this.d != aicVar.d || !c16.i(this.e, aicVar.e)) {
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
        int k = eub.k(eub.k(eub.k(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        List list = this.e;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return k + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopicEditorState(title=");
        sb.append(this.a);
        sb.append(", isPublishing=");
        sb.append(this.b);
        sb.append(", isEditing=");
        rs8.z(sb, this.c, ", isLoading=", this.d, ", initialBlocks=");
        return rs8.n(sb, this.e, ")");
    }
}
