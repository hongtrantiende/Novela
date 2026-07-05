package com.google.firebase.crashlytics;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int d = 0;
    public final mf9 a = new mf9(ag0.class, ExecutorService.class);
    public final mf9 b = new mf9(in0.class, ExecutorService.class);
    public final mf9 c = new mf9(jo6.class, ExecutorService.class);

    static {
        Map map = eh4.b;
        oba obaVar = oba.a;
        if (map.containsKey(obaVar)) {
            Log.d("FirebaseSessions", "Dependency " + obaVar + " already added.");
            return;
        }
        map.put(obaVar, new ch4(new CountDownLatch(1)));
        Log.d("FirebaseSessions", "Dependency to " + obaVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        ot1 b = pt1.b(cg4.class);
        b.a = "fire-cls";
        b.a(x13.b(qf4.class));
        b.a(x13.b(ig4.class));
        b.a(new x13(this.a, 1, 0));
        b.a(new x13(this.b, 1, 0));
        b.a(new x13(this.c, 1, 0));
        b.a(new x13(0, 2, q92.class));
        b.a(new x13(0, 2, wc.class));
        b.a(new x13(0, 2, tg4.class));
        b.f = new q6(this, 6);
        b.c(2);
        return Arrays.asList(b.b(), rte.l("fire-cls", "20.0.6"));
    }
}
