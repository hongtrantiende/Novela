package defpackage;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ztc  reason: default package */
/* loaded from: classes3.dex */
public final class ztc implements Serializable {
    public static final ztc c;
    public static final ztc d;
    public static final LinkedHashMap e;
    public final String a;
    public final int b;

    static {
        ztc ztcVar = new ztc("http", 80);
        c = ztcVar;
        ztc ztcVar2 = new ztc("https", 443);
        ztc ztcVar3 = new ztc("ws", 80);
        d = ztcVar3;
        List B = tl1.B(ztcVar, ztcVar2, ztcVar3, new ztc("wss", 443), new ztc("socks", 1080));
        int k = p17.k(tl1.s(B, 10));
        if (k < 16) {
            k = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(k);
        for (Object obj : B) {
            linkedHashMap.put(((ztc) obj).a, obj);
        }
        e = linkedHashMap;
    }

    public ztc(String str, int i) {
        this.a = str;
        this.b = i;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Character.toLowerCase(charAt) != charAt) {
                vs.m("All characters should be lower case");
                throw null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ztc) {
                ztc ztcVar = (ztc) obj;
                if (!this.a.equals(ztcVar.a) || this.b != ztcVar.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("URLProtocol(name=");
        sb.append(this.a);
        sb.append(", defaultPort=");
        return hl5.p(sb, this.b, ')');
    }
}
