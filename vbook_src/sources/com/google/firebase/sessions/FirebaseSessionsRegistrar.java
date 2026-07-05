package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final fh4 Companion = new Object();
    private static final mf9 appContext = mf9.a(Context.class);
    private static final mf9 firebaseApp = mf9.a(qf4.class);
    private static final mf9 firebaseInstallationsApi = mf9.a(ig4.class);
    private static final mf9 backgroundDispatcher = new mf9(ag0.class, f82.class);
    private static final mf9 blockingDispatcher = new mf9(in0.class, f82.class);
    private static final mf9 transportFactory = mf9.a(hnc.class);
    private static final mf9 firebaseSessionsComponent = mf9.a(xg4.class);

    public static final ug4 getComponents$lambda$0(du1 du1Var) {
        return (ug4) ((ve2) ((xg4) du1Var.h(firebaseSessionsComponent))).p.get();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [ve2, xg4, java.lang.Object] */
    public static final xg4 getComponents$lambda$1(du1 du1Var) {
        Object h = du1Var.h(appContext);
        h.getClass();
        Object h2 = du1Var.h(backgroundDispatcher);
        h2.getClass();
        Object h3 = du1Var.h(blockingDispatcher);
        h3.getClass();
        Object h4 = du1Var.h(firebaseApp);
        h4.getClass();
        Object h5 = du1Var.h(firebaseInstallationsApi);
        h5.getClass();
        l99 g = du1Var.g(transportFactory);
        g.getClass();
        ?? obj = new Object();
        obj.a = nt2.a((qf4) h4);
        nt2 a = nt2.a((Context) h);
        obj.b = a;
        obj.c = re3.a(new mce(a));
        obj.d = re3.a(ah4.a);
        obj.e = nt2.a((ig4) h5);
        obj.f = re3.a(new mu9(obj.a));
        nt2 a2 = nt2.a((d82) h3);
        obj.g = a2;
        obj.h = re3.a(new yg4(obj.f, a2));
        obj.i = nt2.a((d82) h2);
        obj.j = re3.a(new eb5(27, obj.c, re3.a(new bm1(obj.d, obj.e, obj.f, obj.h, re3.a(new yx9(4, obj.i, obj.d, re3.a(new yg4(obj.b, (j99) obj.g)))), 16))));
        j99 a3 = re3.a(bh4.a);
        obj.k = a3;
        obj.l = re3.a(new s26(20, obj.d, a3));
        obj.m = re3.a(new bm1(obj.a, obj.e, obj.j, re3.a(new fz4(nt2.a(g))), obj.i, 19));
        obj.n = re3.a(new zg4(0, obj.b, obj.g, re3.a(new bp9(obj.l, 1))));
        j99 a4 = re3.a(new oe4(obj.j, obj.l, obj.m, obj.d, obj.n, re3.a(new eb5(20, obj.b, obj.k)), obj.i));
        obj.o = a4;
        obj.p = re3.a(new oaa(obj.a, obj.j, obj.i, re3.a(new k57(a4, 8)), 10));
        return obj;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<pt1> getComponents() {
        ot1 b = pt1.b(ug4.class);
        b.a = LIBRARY_NAME;
        b.a(x13.a(firebaseSessionsComponent));
        b.f = new fb4(13);
        b.c(2);
        pt1 b2 = b.b();
        ot1 b3 = pt1.b(xg4.class);
        b3.a = "fire-sessions-component";
        b3.a(x13.a(appContext));
        b3.a(x13.a(backgroundDispatcher));
        b3.a(x13.a(blockingDispatcher));
        b3.a(x13.a(firebaseApp));
        b3.a(x13.a(firebaseInstallationsApi));
        b3.a(new x13(transportFactory, 1, 1));
        b3.f = new fb4(14);
        return tl1.B(b2, b3.b(), rte.l(LIBRARY_NAME, "3.0.6"));
    }
}
