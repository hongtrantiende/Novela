package defpackage;

import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t7b  reason: default package */
/* loaded from: classes3.dex */
public final class t7b implements pw6 {
    public final boolean C;
    public final String a;
    public volatile pw6 b;
    public Boolean c;
    public Method d;
    public ux3 e;
    public final Queue f;

    public t7b(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.a = str;
        this.f = linkedBlockingQueue;
        this.C = z;
    }

    @Override // defpackage.pw6
    public final boolean a() {
        return k().a();
    }

    @Override // defpackage.pw6
    public final boolean b() {
        return k().b();
    }

    @Override // defpackage.pw6
    public final boolean c() {
        return k().c();
    }

    @Override // defpackage.pw6
    public final boolean d() {
        return k().d();
    }

    @Override // defpackage.pw6
    public final boolean e() {
        return k().e();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t7b.class == obj.getClass() && this.a.equals(((t7b) obj).a)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.pw6
    public final void f(String str, Throwable th) {
        k().f(str, th);
    }

    @Override // defpackage.pw6
    public final void g(String str) {
        k().g(str);
    }

    @Override // defpackage.pw6
    public final String getName() {
        return this.a;
    }

    @Override // defpackage.pw6
    public final void h(String str) {
        k().h(str);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pw6
    public final void i(String str) {
        k().i(str);
    }

    @Override // defpackage.pw6
    public final boolean j(int i) {
        return k().j(i);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ux3, java.lang.Object] */
    public final pw6 k() {
        if (this.b != null) {
            return this.b;
        }
        if (this.C) {
            return dx7.a;
        }
        if (this.e == null) {
            Queue queue = this.f;
            ?? obj = new Object();
            obj.b = this;
            obj.a = this.a;
            obj.c = queue;
            this.e = obj;
        }
        return this.e;
    }

    public final boolean l() {
        Boolean bool = this.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.d = this.b.getClass().getMethod("log", v7b.class);
            this.c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.c = Boolean.FALSE;
        }
        return this.c.booleanValue();
    }
}
