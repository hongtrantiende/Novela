package defpackage;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ou1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ou1 implements l99 {
    public final /* synthetic */ int a;

    public /* synthetic */ ou1(int i) {
        this.a = i;
    }

    @Override // defpackage.l99
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return ExecutorsRegistrar.a();
            case 2:
                ze6 ze6Var = ExecutorsRegistrar.a;
                return new t03(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new me2("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                ze6 ze6Var2 = ExecutorsRegistrar.a;
                return new t03(Executors.newCachedThreadPool(new me2("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                ze6 ze6Var3 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new me2("Firebase Scheduler", 0, null));
            default:
                return null;
        }
    }
}
