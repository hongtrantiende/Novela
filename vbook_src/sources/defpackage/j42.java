package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j42  reason: default package */
/* loaded from: classes.dex */
public final class j42 extends l42 {
    public final s76 a;

    public j42(s76 s76Var) {
        this.a = s76Var;
    }

    @Override // defpackage.l42
    public final s76 a(List list) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof j42) && ((j42) obj).a.equals(this.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
