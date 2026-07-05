package defpackage;

import java.io.Serializable;
import java.util.Queue;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ux3  reason: default package */
/* loaded from: classes3.dex */
public final class ux3 implements pw6, Serializable {
    public String a;
    public t7b b;
    public Queue c;

    @Override // defpackage.pw6
    public final boolean a() {
        return true;
    }

    @Override // defpackage.pw6
    public final boolean b() {
        return true;
    }

    @Override // defpackage.pw6
    public final boolean c() {
        return true;
    }

    @Override // defpackage.pw6
    public final boolean d() {
        return true;
    }

    @Override // defpackage.pw6
    public final boolean e() {
        return true;
    }

    @Override // defpackage.pw6
    public final void f(String str, Throwable th) {
        k(4);
    }

    @Override // defpackage.pw6
    public final void g(String str) {
        k(3);
    }

    @Override // defpackage.pw6
    public final String getName() {
        return this.a;
    }

    @Override // defpackage.pw6
    public final void h(String str) {
        k(2);
    }

    @Override // defpackage.pw6
    public final void i(String str) {
        k(5);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v7b, java.lang.Object] */
    public final void k(int i) {
        ?? obj = new Object();
        System.currentTimeMillis();
        obj.a = i;
        obj.b = this.b;
        Thread.currentThread().getName();
        this.c.add(obj);
    }
}
