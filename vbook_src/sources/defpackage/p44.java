package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p44  reason: default package */
/* loaded from: classes3.dex */
public final class p44 {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;

    public p44(HashMap hashMap, HashMap hashMap2, HashMap hashMap3, HashMap hashMap4) {
        this.a = hashMap;
        this.b = hashMap2;
        this.c = hashMap3;
        this.d = hashMap4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p44) {
                p44 p44Var = (p44) obj;
                if (!this.a.equals(p44Var.a) || !this.b.equals(p44Var.b) || !this.c.equals(p44Var.c) || !this.d.equals(p44Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ExtensionData(scriptData=" + this.a + ", infoData=" + this.b + ", featureData=" + this.c + ", configData=" + this.d + ")";
    }
}
