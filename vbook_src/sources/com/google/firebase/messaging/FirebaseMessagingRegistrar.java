package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(mf9 mf9Var, du1 du1Var) {
        qf4 qf4Var = (qf4) du1Var.a(qf4.class);
        if (du1Var.a(kg4.class) == null) {
            return new FirebaseMessaging(qf4Var, du1Var.c(ty2.class), du1Var.c(l55.class), (ig4) du1Var.a(ig4.class), du1Var.g(mf9Var), (r7b) du1Var.a(r7b.class));
        }
        vm1.h();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<pt1> getComponents() {
        mf9 mf9Var = new mf9(fnc.class, hnc.class);
        ot1 b = pt1.b(FirebaseMessaging.class);
        b.a = LIBRARY_NAME;
        b.a(x13.b(qf4.class));
        b.a(new x13(0, 0, kg4.class));
        b.a(new x13(0, 1, ty2.class));
        b.a(new x13(0, 1, l55.class));
        b.a(x13.b(ig4.class));
        b.a(new x13(mf9Var, 0, 1));
        b.a(x13.b(r7b.class));
        b.f = new au2(mf9Var, 1);
        b.c(1);
        return Arrays.asList(b.b(), rte.l(LIBRARY_NAME, "25.1.0"));
    }
}
