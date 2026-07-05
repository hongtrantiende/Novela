package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pud  reason: default package */
/* loaded from: classes.dex */
public final class pud {
    public final jv a;
    public final mb4 b;

    public /* synthetic */ pud(jv jvVar, mb4 mb4Var) {
        this.a = jvVar;
        this.b = mb4Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pud) {
            pud pudVar = (pud) obj;
            if (hud.l(this.a, pudVar.a) && hud.l(this.b, pudVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        s26 s26Var = new s26(this);
        s26Var.h(this.a, "key");
        s26Var.h(this.b, "feature");
        return s26Var.toString();
    }
}
