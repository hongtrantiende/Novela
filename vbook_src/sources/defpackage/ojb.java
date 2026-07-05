package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ojb  reason: default package */
/* loaded from: classes.dex */
public final class ojb {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public ojb(String str, String str2, String str3, List list, List list2) {
        rs8.w(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ojb) {
            ojb ojbVar = (ojb) obj;
            if (!c16.i(this.a, ojbVar.a) || !c16.i(this.b, ojbVar.b) || !c16.i(this.c, ojbVar.c) || !this.d.equals(ojbVar.d)) {
                return false;
            }
            return this.e.equals(ojbVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + eub.l(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.a);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.c);
        sb.append("',\n            |   columnNames = {");
        l4b.x(sl1.i0(sl1.t0(this.d), ",", null, null, null, 62), "    ");
        l4b.x("},", "    ");
        pvc pvcVar = pvc.a;
        sb.append(pvcVar);
        sb.append("\n            |   referenceColumnNames = {");
        l4b.x(sl1.i0(sl1.t0(this.e), ",", null, null, null, 62), "    ");
        l4b.x(" }", "    ");
        sb.append(pvcVar);
        sb.append("\n            |}\n        ");
        return l4b.x(l4b.z(sb.toString()), "    ");
    }
}
