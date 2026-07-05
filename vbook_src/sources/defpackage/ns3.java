package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ns3  reason: default package */
/* loaded from: classes3.dex */
public final class ns3 implements tl8 {
    public static final ns3 c = new Object();

    @Override // defpackage.g4b
    public final Set a() {
        return rs3.a;
    }

    @Override // defpackage.g4b
    public final boolean d() {
        return true;
    }

    @Override // defpackage.g4b
    public final List e(String str) {
        str.getClass();
        return null;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof tl8) && ((tl8) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.g4b
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.g4b
    public final Set names() {
        return rs3.a;
    }

    public final String toString() {
        return "Parameters " + rs3.a;
    }
}
