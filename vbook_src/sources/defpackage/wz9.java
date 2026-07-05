package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wz9  reason: default package */
/* loaded from: classes.dex */
public interface wz9 {
    List a();

    List b();

    Object getKey();

    default Map l() {
        Map map;
        jz7 jz7Var = (jz7) sl1.k0(b());
        if (jz7Var != null && (map = jz7Var.c) != null) {
            return map;
        }
        return ls3.a;
    }

    tu1 o();
}
