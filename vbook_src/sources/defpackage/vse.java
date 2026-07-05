package defpackage;

import java.lang.Thread;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vse  reason: default package */
/* loaded from: classes.dex */
public final class vse implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final /* synthetic */ ete b;

    public vse(ete eteVar, String str) {
        this.b = eteVar;
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        ppe ppeVar = ((lte) this.b.a).f;
        lte.m(ppeVar);
        ppeVar.f.f(th, this.a);
    }
}
