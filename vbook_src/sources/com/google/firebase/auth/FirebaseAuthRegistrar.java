package com.google.firebase.auth;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static /* synthetic */ e0e lambda$getComponents$0(mf9 mf9Var, mf9 mf9Var2, mf9 mf9Var3, mf9 mf9Var4, mf9 mf9Var5, du1 du1Var) {
        return new e0e((qf4) du1Var.a(qf4.class), du1Var.c(l06.class), du1Var.c(k55.class), (Executor) du1Var.h(mf9Var), (Executor) du1Var.h(mf9Var2), (Executor) du1Var.h(mf9Var3), (ScheduledExecutorService) du1Var.h(mf9Var4), (Executor) du1Var.h(mf9Var5));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<pt1> getComponents() {
        mf9 mf9Var = new mf9(ag0.class, Executor.class);
        mf9 mf9Var2 = new mf9(in0.class, Executor.class);
        mf9 mf9Var3 = new mf9(jo6.class, Executor.class);
        mf9 mf9Var4 = new mf9(jo6.class, ScheduledExecutorService.class);
        mf9 mf9Var5 = new mf9(tuc.class, Executor.class);
        ot1 ot1Var = new ot1(e0e.class, new Class[]{xz5.class});
        ot1Var.a(x13.b(qf4.class));
        ot1Var.a(new x13(1, 1, k55.class));
        ot1Var.a(new x13(mf9Var, 1, 0));
        ot1Var.a(new x13(mf9Var2, 1, 0));
        ot1Var.a(new x13(mf9Var3, 1, 0));
        ot1Var.a(new x13(mf9Var4, 1, 0));
        ot1Var.a(new x13(mf9Var5, 1, 0));
        ot1Var.a(new x13(0, 1, l06.class));
        w2e w2eVar = new w2e(0);
        w2eVar.b = mf9Var;
        w2eVar.c = mf9Var2;
        w2eVar.d = mf9Var3;
        w2eVar.e = mf9Var4;
        w2eVar.f = mf9Var5;
        ot1Var.f = w2eVar;
        pt1 b = ot1Var.b();
        j55 j55Var = new j55(0);
        ot1 b2 = pt1.b(j55.class);
        b2.e = 1;
        b2.f = new nt1(j55Var, 0);
        return Arrays.asList(b, b2.b(), rte.l("fire-auth", "24.1.0"));
    }
}
