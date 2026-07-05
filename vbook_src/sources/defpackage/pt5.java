package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pt5  reason: default package */
/* loaded from: classes3.dex */
public final class pt5 implements mo3 {
    public static final pt5 a = new Object();

    @Override // defpackage.mo3
    public final so3 a(so3 so3Var) {
        so3Var.getClass();
        List list = so3Var.a;
        List s = qwe.s(list, so3Var.b, so3Var.c, rt5.Forward);
        if (s == list) {
            return so3Var;
        }
        return so3.a(so3Var, tl1.H(s), null, null, null, null, 30);
    }

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof pt5)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return -2136350266;
    }

    public final String toString() {
        return "IndentForward";
    }
}
