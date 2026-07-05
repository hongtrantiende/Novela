package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ksc  reason: default package */
/* loaded from: classes3.dex */
public final class ksc implements w66 {
    public final gi1 a;
    public final String b;
    public final y76 c;
    public volatile List d;

    public ksc(gi1 gi1Var) {
        this.a = gi1Var;
        ipe.x(sk6.b, new u76(this, 0));
        this.b = "PluginConfigT";
        this.c = y76.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ksc) {
            ksc kscVar = (ksc) obj;
            if (c16.i(this.b, kscVar.b) && this.a.equals(kscVar.a)) {
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
        StringBuilder sb = new StringBuilder();
        int ordinal = this.c.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    sb.append("out ");
                } else {
                    xk5.o();
                    return null;
                }
            } else {
                sb.append("in ");
            }
        }
        sb.append(this.b);
        return sb.toString();
    }
}
