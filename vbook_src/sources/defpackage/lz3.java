package defpackage;

import java.util.LinkedHashMap;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lz3  reason: default package */
/* loaded from: classes.dex */
public final class lz3 {
    public static final lz3 b = new lz3(new ukc((qa4) null, (dpa) null, (qa1) null, (iz9) null, (v4d) null, (LinkedHashMap) null, (int) Token.SWITCH));
    public static final lz3 c = new lz3(new ukc((qa4) null, (dpa) null, (qa1) null, (iz9) null, (v4d) null, (LinkedHashMap) null, 95));
    public final ukc a;

    public lz3(ukc ukcVar) {
        this.a = ukcVar;
    }

    public final lz3 a(lz3 lz3Var) {
        boolean z;
        ukc ukcVar = lz3Var.a;
        qa4 qa4Var = ukcVar.a;
        ukc ukcVar2 = this.a;
        if (qa4Var == null) {
            qa4Var = ukcVar2.a;
        }
        dpa dpaVar = ukcVar.b;
        if (dpaVar == null) {
            dpaVar = ukcVar2.b;
        }
        qa1 qa1Var = ukcVar.c;
        if (qa1Var == null) {
            qa1Var = ukcVar2.c;
        }
        iz9 iz9Var = ukcVar.d;
        if (iz9Var == null) {
            iz9Var = ukcVar2.d;
        }
        v4d v4dVar = ukcVar.e;
        if (v4dVar == null) {
            v4dVar = ukcVar2.e;
        }
        if (!ukcVar.f && !ukcVar2.f) {
            z = false;
        } else {
            z = true;
        }
        return new lz3(new ukc(qa4Var, dpaVar, qa1Var, iz9Var, v4dVar, z, o17.u(ukcVar2.g, ukcVar.g)));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof lz3) && ((lz3) obj).a.equals(this.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        if (equals(b)) {
            return "ExitTransition.None";
        }
        if (equals(c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        ukc ukcVar = this.a;
        qa4 qa4Var = ukcVar.a;
        String str4 = null;
        if (qa4Var != null) {
            str = qa4Var.toString();
        } else {
            str = null;
        }
        dpa dpaVar = ukcVar.b;
        if (dpaVar != null) {
            str2 = dpaVar.toString();
        } else {
            str2 = null;
        }
        qa1 qa1Var = ukcVar.c;
        if (qa1Var != null) {
            str3 = qa1Var.toString();
        } else {
            str3 = null;
        }
        iz9 iz9Var = ukcVar.d;
        if (iz9Var != null) {
            str4 = iz9Var.toString();
        }
        boolean z = ukcVar.f;
        StringBuilder y = nk2.y("ExitTransition: \nFade - ", str, ",\nSlide - ", str2, ",\nShrink - ");
        nk2.C(y, str3, ",\nScale - ", str4, ",\nKeepUntilTransitionsFinished - ");
        y.append(z);
        return y.toString();
    }
}
