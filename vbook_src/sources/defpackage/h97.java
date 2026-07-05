package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h97  reason: default package */
/* loaded from: classes.dex */
public final class h97 {
    public final String a;
    public final Map b;

    public h97(Map map, String str) {
        this.a = str;
        this.b = que.x(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h97) {
            h97 h97Var = (h97) obj;
            if (c16.i(this.a, h97Var.a) && c16.i(this.b, h97Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.a + ", extras=" + this.b + ")";
    }

    public /* synthetic */ h97(String str) {
        this(ls3.a, str);
    }
}
