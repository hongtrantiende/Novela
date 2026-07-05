package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ hnc lambda$getComponents$0(du1 du1Var) {
        knc.b((Context) du1Var.a(Context.class));
        return knc.a().c(d41.f);
    }

    public static /* synthetic */ hnc lambda$getComponents$1(du1 du1Var) {
        knc.b((Context) du1Var.a(Context.class));
        return knc.a().c(d41.f);
    }

    public static /* synthetic */ hnc lambda$getComponents$2(du1 du1Var) {
        knc.b((Context) du1Var.a(Context.class));
        return knc.a().c(d41.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<pt1> getComponents() {
        ot1 b = pt1.b(hnc.class);
        b.a = LIBRARY_NAME;
        b.a(x13.b(Context.class));
        b.f = new p1a(20);
        pt1 b2 = b.b();
        ot1 a = pt1.a(new mf9(ql6.class, hnc.class));
        a.a(x13.b(Context.class));
        a.f = new p1a(21);
        pt1 b3 = a.b();
        ot1 a2 = pt1.a(new mf9(fnc.class, hnc.class));
        a2.a(x13.b(Context.class));
        a2.f = new p1a(22);
        return Arrays.asList(b2, b3, a2.b(), rte.l(LIBRARY_NAME, "19.0.0"));
    }
}
