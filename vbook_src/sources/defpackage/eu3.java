package defpackage;

import java.util.LinkedHashMap;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eu3  reason: default package */
/* loaded from: classes.dex */
public final class eu3 {
    public static final eu3 b = new eu3(new ukc((qa4) null, (dpa) null, (qa1) null, (iz9) null, (v4d) null, (LinkedHashMap) null, (int) Token.SWITCH));
    public final ukc a;

    public eu3(ukc ukcVar) {
        this.a = ukcVar;
    }

    public final eu3 a(eu3 eu3Var) {
        ukc ukcVar = eu3Var.a;
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
        return new eu3(new ukc(qa4Var, dpaVar, qa1Var, iz9Var, v4dVar, o17.u(ukcVar2.g, ukcVar.g), 32));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof eu3) && ((eu3) obj).a.equals(this.a)) {
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
            return "EnterTransition.None";
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
        return nk2.v(nk2.y("EnterTransition: \nFade - ", str, ",\nSlide - ", str2, ",\nShrink - "), str3, ",\nScale - ", str4);
    }
}
