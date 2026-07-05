package defpackage;

import java.util.Collections;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ac4  reason: default package */
/* loaded from: classes.dex */
public final class ac4 {
    public final String a;
    public final Map b;

    public ac4(Map map, String str) {
        this.a = str;
        this.b = map;
    }

    public static ac4 a(String str) {
        return new ac4(Collections.EMPTY_MAP, str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ac4) {
                ac4 ac4Var = (ac4) obj;
                if (this.a.equals(ac4Var.a) && this.b.equals(ac4Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
