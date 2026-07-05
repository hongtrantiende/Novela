package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dwd  reason: default package */
/* loaded from: classes.dex */
public final class dwd implements xs {
    public static final dwd c;
    public final boolean a;
    public final String b;

    static {
        rwa rwaVar = new rwa(15, false);
        rwaVar.b = Boolean.FALSE;
        c = new dwd(rwaVar);
    }

    public dwd(rwa rwaVar) {
        this.a = ((Boolean) rwaVar.b).booleanValue();
        this.b = (String) rwaVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dwd)) {
            return false;
        }
        dwd dwdVar = (dwd) obj;
        if (hud.l(null, null) && this.a == dwdVar.a && hud.l(this.b, dwdVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
