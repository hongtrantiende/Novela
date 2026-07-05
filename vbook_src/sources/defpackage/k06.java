package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k06  reason: default package */
/* loaded from: classes.dex */
public final class k06 {
    public final String a;

    public k06(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k06)) {
            return false;
        }
        return hud.l(this.a, ((k06) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        s26 s26Var = new s26(this);
        s26Var.h(this.a, "token");
        return s26Var.toString();
    }
}
