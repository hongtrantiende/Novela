package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qjb  reason: default package */
/* loaded from: classes.dex */
public final class qjb {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public qjb(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this != obj) {
            if (obj instanceof qjb) {
                qjb qjbVar = (qjb) obj;
                if (!this.a.equals(qjbVar.a) || !this.b.equals(qjbVar.b) || !c16.i(this.c, qjbVar.c)) {
                    return false;
                }
                Set set2 = this.d;
                if (set2 != null && (set = qjbVar.d) != null) {
                    return set2.equals(set);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + rs8.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        Collection collection;
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(mue.k(sl1.u0(this.b.values(), new roa(8))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(mue.k(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        if (set != null) {
            collection = sl1.u0(set, new roa(9));
        } else {
            collection = ks3.a;
        }
        sb.append(mue.k(collection));
        sb.append("\n            |}\n        ");
        return l4b.z(sb.toString());
    }
}
