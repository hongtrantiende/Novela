package defpackage;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n4e  reason: default package */
/* loaded from: classes.dex */
public abstract class n4e implements Map.Entry, Comparable, Serializable {
    public abstract Object a();

    public abstract Object b();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        n4e n4eVar = (n4e) obj;
        l3e l3eVar = new l3e();
        l3eVar.a(a(), n4eVar.a());
        l3eVar.a(b(), n4eVar.b());
        return l3eVar.a;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (Objects.equals(a(), entry.getKey()) && Objects.equals(b(), entry.getValue())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return a();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return b();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return Objects.hashCode(b()) ^ Objects.hashCode(a());
    }

    public final String toString() {
        String valueOf = String.valueOf(a());
        String valueOf2 = String.valueOf(b());
        StringBuilder sb = new StringBuilder(valueOf.length() + 2 + valueOf2.length() + 1);
        nk2.C(sb, "(", valueOf, ",", valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
