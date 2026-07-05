package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final ze6 a = new ze6(new ou1(1));
    public static final ze6 b = new ze6(new ou1(2));
    public static final ze6 c = new ze6(new ou1(3));
    public static final ze6 d = new ze6(new ou1(4));

    public static t03 a() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        detectNetwork.detectResourceMismatches();
        if (Build.VERSION.SDK_INT >= 26) {
            detectNetwork.detectUnbufferedIo();
        }
        return new t03(Executors.newFixedThreadPool(4, new me2("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        mf9 mf9Var = new mf9(ag0.class, ScheduledExecutorService.class);
        mf9[] mf9VarArr = {new mf9(ag0.class, ExecutorService.class), new mf9(ag0.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(mf9Var);
        for (mf9 mf9Var2 : mf9VarArr) {
            oc2.v(mf9Var2, "Null interface");
        }
        Collections.addAll(hashSet, mf9VarArr);
        pt1 pt1Var = new pt1(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new ls2(23), hashSet3);
        mf9 mf9Var3 = new mf9(in0.class, ScheduledExecutorService.class);
        mf9[] mf9VarArr2 = {new mf9(in0.class, ExecutorService.class), new mf9(in0.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(mf9Var3);
        for (mf9 mf9Var4 : mf9VarArr2) {
            oc2.v(mf9Var4, "Null interface");
        }
        Collections.addAll(hashSet4, mf9VarArr2);
        pt1 pt1Var2 = new pt1(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new ls2(24), hashSet6);
        mf9 mf9Var5 = new mf9(jo6.class, ScheduledExecutorService.class);
        mf9[] mf9VarArr3 = {new mf9(jo6.class, ExecutorService.class), new mf9(jo6.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(mf9Var5);
        for (mf9 mf9Var6 : mf9VarArr3) {
            oc2.v(mf9Var6, "Null interface");
        }
        Collections.addAll(hashSet7, mf9VarArr3);
        pt1 pt1Var3 = new pt1(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new ls2(25), hashSet9);
        ot1 a2 = pt1.a(new mf9(tuc.class, Executor.class));
        a2.f = new ls2(26);
        return Arrays.asList(pt1Var, pt1Var2, pt1Var3, a2.b());
    }
}
