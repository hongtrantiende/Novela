package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static ig4 lambda$getComponents$0(du1 du1Var) {
        return new hg4((qf4) du1Var.a(qf4.class), du1Var.c(k55.class), (ExecutorService) du1Var.h(new mf9(ag0.class, ExecutorService.class)), new m9a((Executor) du1Var.h(new mf9(in0.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<pt1> getComponents() {
        ot1 b = pt1.b(ig4.class);
        b.a = LIBRARY_NAME;
        b.a(x13.b(qf4.class));
        b.a(new x13(0, 1, k55.class));
        b.a(new x13(new mf9(ag0.class, ExecutorService.class), 1, 0));
        b.a(new x13(new mf9(in0.class, Executor.class), 1, 0));
        b.f = new fb4(8);
        pt1 b2 = b.b();
        j55 j55Var = new j55(0);
        ot1 b3 = pt1.b(j55.class);
        b3.e = 1;
        b3.f = new nt1(j55Var, 0);
        return Arrays.asList(b2, b3.b(), rte.l(LIBRARY_NAME, "19.1.1"));
    }
}
