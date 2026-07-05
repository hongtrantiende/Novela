package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: am0  reason: default package */
/* loaded from: classes.dex */
public final class am0 implements dm0 {
    public final String a;
    public final Map b;

    public am0(Map map, String str) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof am0) {
                am0 am0Var = (am0) obj;
                if (!this.a.equals(am0Var.a) || !this.b.equals(am0Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Custom(typeId=" + this.a + ", data=" + this.b + ")";
    }
}
