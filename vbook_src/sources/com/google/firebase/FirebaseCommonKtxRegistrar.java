package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<pt1> getComponents() {
        ot1 a = pt1.a(new mf9(ag0.class, f82.class));
        a.a(new x13(new mf9(ag0.class, Executor.class), 1, 0));
        a.f = r0f.H;
        pt1 b = a.b();
        ot1 a2 = pt1.a(new mf9(jo6.class, f82.class));
        a2.a(new x13(new mf9(jo6.class, Executor.class), 1, 0));
        a2.f = abf.f;
        pt1 b2 = a2.b();
        ot1 a3 = pt1.a(new mf9(in0.class, f82.class));
        a3.a(new x13(new mf9(in0.class, Executor.class), 1, 0));
        a3.f = p40.f;
        pt1 b3 = a3.b();
        ot1 a4 = pt1.a(new mf9(tuc.class, f82.class));
        a4.a(new x13(new mf9(tuc.class, Executor.class), 1, 0));
        a4.f = zj1.e;
        return tl1.B(b, b2, b3, a4.b());
    }
}
