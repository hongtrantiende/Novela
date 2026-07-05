package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pjb  reason: default package */
/* loaded from: classes.dex */
public final class pjb {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public pjb(String str, boolean z, List list, List list2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pjb) {
            pjb pjbVar = (pjb) obj;
            String str = pjbVar.a;
            if (this.b == pjbVar.b && this.c.equals(pjbVar.c) && c16.i(this.d, pjbVar.d)) {
                String str2 = this.a;
                if (r4b.Q(str2, "index_", false)) {
                    return r4b.Q(str, "index_", false);
                }
                return str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (r4b.Q(str, "index_", false)) {
            hashCode = -1184239155;
        } else {
            hashCode = str.hashCode();
        }
        return this.d.hashCode() + eub.l(((hashCode * 31) + (this.b ? 1 : 0)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   unique = '");
        sb.append(this.b);
        sb.append("',\n            |   columns = {");
        l4b.x(sl1.i0(this.c, ",", null, null, null, 62), "    ");
        l4b.x("},", "    ");
        pvc pvcVar = pvc.a;
        sb.append(pvcVar);
        sb.append("\n            |   orders = {");
        l4b.x(sl1.i0(this.d, ",", null, null, null, 62), "    ");
        l4b.x(" }", "    ");
        sb.append(pvcVar);
        sb.append("\n            |}\n        ");
        return l4b.x(l4b.z(sb.toString()), "    ");
    }
}
